package demo.api.command.service.api;

import demo.api.common.domain.CommandHandler;
import demo.api.common.domain.commands.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.*;
import java.util.concurrent.CompletableFuture;


@RestController
public class ItemCommandResource {

    private static final Logger log = LoggerFactory.getLogger(ItemCommandResource.class);


    private final CommandHandler commandHandler;

     @Autowired
    public ItemCommandResource(final CommandHandler commandHandler) {
        this.commandHandler = commandHandler;
    }

    @RequestMapping(path = "/items/{itemId}", method = RequestMethod.DELETE, produces = "application/json")
    public CompletableFuture<ResponseEntity<Object>> deleteItem(@PathVariable("itemId") String itemId) {

        log.info("Received a delete item request for item with ID {}.", itemId);

        return commandHandler
                .onCommand(new ConcludeItem(itemId))
                .thenApply(dontCare -> ResponseEntity.accepted().build())
                .exceptionally(e -> {
                    log.warn("Caught an exception at the service boundary.", e);
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
                });
    }

    @RequestMapping(path = "/items/{itemId}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public CompletableFuture<ResponseEntity<Object>> updateItem(@PathVariable("itemId") String itemId,
                                                                UpdateItemRequest updateItem) {

        log.info("Received an update item request for item with ID {} and updated data {}.", itemId, updateItem);

        return commandHandler
                .onCommand(commandsFor(itemId, updateItem).orElse(Collections.emptyList()))
                .thenApply(dontCare -> ResponseEntity.accepted().build())
                .exceptionally((e -> {
                    log.warn("Caught an exception at the service boundary.", e);
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
                }));
    }

    private Optional<List<ItemCommand>> commandsFor(final String itemId, final UpdateItemRequest updateItem) {
        final List<ItemCommand> commands = new ArrayList<>();
        if (updateItem.getAssociatedList() != null) {
            commands.add(new MoveItemToList(itemId, updateItem.getAssociatedList()));
        }
        if (updateItem.getDueDate() != null) {
            final Date dueDate = Date.from(Instant.ofEpochMilli(updateItem.getDueDate()));
            commands.add(new AssignDueDate(itemId, dueDate));
        }
        if (updateItem.getRequiredTime() != null) {
            commands.add(new AssignRequiredTime(itemId, updateItem.getRequiredTime()));
        }
        if (updateItem.getTags() != null) {
            commands.add(new AssignTags(itemId, updateItem.getTags()));
        }
        if (updateItem.getDescription() != null) {
            commands.add(new AssignDesc(itemId, updateItem.getDescription()));
        }
        return Optional.of(Collections.unmodifiableList(commands));
    }
}
