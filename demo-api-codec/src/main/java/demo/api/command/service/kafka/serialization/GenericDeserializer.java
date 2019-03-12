package demo.api.command.service.kafka.serialization;

import demo.api.common.domain.constants.KafkaTopics;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Map;

public class GenericDeserializer implements Deserializer<Object> {

    @Override
    public void configure(final Map<String, ?> map, final boolean b) {
        // nothing to do here
    }

    @Override
    public Object deserialize(final String s, final byte[] bytes) {
          Object obj = null;

        switch (KafkaTopics.getValue(s)){
            case springCloudBus:
                StringDeserializer deserializer = new StringDeserializer();
                 obj = deserializer.deserialize(s, bytes);
             break;
             default:
                 ItemEventDeserializer itemEventDeserializer = new ItemEventDeserializer();
                 obj =itemEventDeserializer.deserialize(s,bytes);
        }

        return obj;
    }


    @Override
    public void close() {
        // nothing to do here
    }
}
