package demo.api.common.domain;

import demo.api.common.domain.event.ItemCreated;
import demo.api.common.domain.event.ItemEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;


@Service
public class ItemUpdater implements EventHandler {

    private static final Logger log = LoggerFactory.getLogger(ItemUpdater.class);

    private final ItemRepository repository;

    @Autowired
    public ItemUpdater(final ItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public CompletableFuture<Void> onEvent(final ItemEvent event) {

        return CompletableFuture.runAsync(() -> {
            if (event instanceof ItemCreated) {
                createNewItem((ItemCreated) event);
            } else {
                modifyExistingItem(event);
            }
        });
    }

    private void createNewItem(final ItemCreated itemCreated) {
        final Item newItem = new Item(itemCreated);
        repository.save(newItem);
        log.info("Applied event {} and created new item with current state {}.", itemCreated, newItem);
    }

    private void modifyExistingItem(final ItemEvent event) {
        final Item item = repository.findById(event.getItemId()).get();
        item.project(event);
        final Item updatedItem = repository.save(item);
        log.info("Applied event {} to the aggregate with ID {} and current state {}.", event, event.getItemId(), updatedItem);
    }
}
