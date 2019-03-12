package demo.api.query.service.kafka;

import demo.api.codec.kafka.events.serialization.AvroItemEvent;
import demo.api.common.domain.EventHandler;
import demo.api.common.domain.event.ItemEvent;
import demo.api.command.service.kafka.serialization.ItemEventConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;


@Component
public class ItemEventConsumer {

    private static final Logger log = LoggerFactory.getLogger(ItemEventConsumer.class);

    private final ItemEventConverter converter;

    private final EventHandler eventHandler;

    @Autowired
    public ItemEventConsumer(final ItemEventConverter converter,
                             final EventHandler eventHandler) {
        this.converter = converter;
        this.eventHandler = eventHandler;
    }

    @KafkaListener(topics = "${kafka.demo.topic}", groupId = "kafka-demo-group")
    public void consume(final AvroItemEvent itemEvent, final Acknowledgment ack) {
        final ItemEvent event = converter.to(itemEvent);
        log.debug("Received event {}. Trying to apply it to the latest state of aggregate with ID {}.", event, event.getItemId());
        try {
            eventHandler
                    .onEvent(event)
                    .thenRun(ack::acknowledge);
        } catch (Exception e) {
            // log the exception and do *not* acknowledge the event
            log.warn("Unable to apply event {} to the latest state of aggregate with ID {}.", event, event.getItemId(), e);
        }
    }
}
