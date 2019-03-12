package demo.api.query.service.api.client;
import demo.api.common.domain.Item;
import demo.api.query.service.feign.headers.FeignHeaderConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public interface ItemClient  {

    CompletableFuture<ResponseEntity<List<Item>>> listAllItems();

    CompletableFuture<ResponseEntity<Item>> showItem(String itemId);

}
