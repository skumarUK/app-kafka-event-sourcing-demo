package demo.api.common.domain;


import demo.api.common.domain.event.ItemEvent;

public interface ItemEventPublisher {

    void log(ItemEvent itemEvent);
}
