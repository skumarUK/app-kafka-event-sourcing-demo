package demo.api.command.service.api;

import demo.api.command.service.api.config.ItemProperties;
import demo.api.common.domain.CommandHandler;
import demo.api.common.domain.commands.CreateItem;
import demo.api.common.domain.commands.ItemCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;


@RestController
@RefreshScope
public class ItemsCommandResource {

    private static final Logger log = LoggerFactory.getLogger(ItemsCommandResource.class);

    private final CommandHandler commandHandler;

    @Autowired
    private ItemProperties itemProperties;

    @Autowired
    public ItemsCommandResource(final CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
    }

    @RequestMapping(path = "/items", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CompletableFuture<ResponseEntity<Object>> createItem(@RequestBody CreateItemRequest createItem) {

        log.info("Received a create item request with data {}.", createItem);

        return commandHandler
                .onCommand(commandsFor(createItem))
                .thenApply(dontCare -> ResponseEntity.accepted().build())
                .exceptionally(e -> {
                    log.warn("Caught an exception at the service boundary.", e);
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
                });
    }

    private ItemCommand commandsFor(final CreateItemRequest createItem) {
        return new CreateItem(createItem.getDescription()+itemProperties.getDescriptionSuffix());
    }
}
