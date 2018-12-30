package demo.api.common.domain;

import demo.api.common.domain.event.ItemEvent;

import java.util.concurrent.CompletableFuture;

public interface EventHandler {

    CompletableFuture<Void> onEvent(ItemEvent event);
}
