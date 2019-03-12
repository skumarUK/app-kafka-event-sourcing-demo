package demo.api.query.domain;

import demo.api.common.domain.Item;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;


public interface ItemView {

    CompletableFuture<List<Item>> getItems();

    CompletableFuture<Optional<Item>> getItem(String itemId);
}
