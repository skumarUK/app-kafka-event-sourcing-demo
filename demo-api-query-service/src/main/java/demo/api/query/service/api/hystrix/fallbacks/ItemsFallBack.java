package demo.api.query.service.api.hystrix.fallbacks;

import demo.api.common.domain.Item;
import demo.api.query.service.api.client.ItemClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class ItemsFallBack {

    private static final Logger log = LoggerFactory.getLogger(ItemsFallBack.class);


    public CompletableFuture<ResponseEntity<List<Item>>> listAllItems() {
        log.info("Received a fallback items request.");
        return new CompletableFuture().thenApply(ResponseEntity::ok);
    }


    public CompletableFuture<ResponseEntity<Item>> showItem(String itemId) {
        log.info("Received a fallback items request.");
        return new CompletableFuture().thenApply(ResponseEntity::ok);
    }
}
