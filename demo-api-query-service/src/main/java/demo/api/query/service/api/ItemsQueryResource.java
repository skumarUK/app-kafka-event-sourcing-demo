package demo.api.query.service.api;

import demo.api.common.domain.Item;
import demo.api.query.domain.ItemView;
import demo.api.query.service.api.client.ItemClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class ItemsQueryResource implements ItemClient{

    private static final Logger log = LoggerFactory.getLogger(ItemsQueryResource.class);

    private final ItemView itemView;

    @Autowired

    public ItemsQueryResource(final ItemView itemView) {
        this.itemView = itemView;
    }

    @GetMapping(path = "/items", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompletableFuture<ResponseEntity<List<Item>>> listAllItems() {

        log.info("Received a list all managed items request.");

        return itemView.getItems()
                .thenApply(ResponseEntity::ok)
                .exceptionally(e -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }

    @GetMapping(path = "/items/{itemId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CompletableFuture<ResponseEntity<Item>> showItem(String itemId) {

        log.info("Received a show item request for item with ID {}.", itemId);

        return itemView.getItem(itemId)
            .thenApply(optionalItem -> optionalItem.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build()))
            .exceptionally(e -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
}
