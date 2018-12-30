package demo.api.common.domain;

import demo.api.common.domain.commands.ItemCommand;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Accepts a command (or a list of commands) and attempts to validate them against the current
 * state of the referenced aggregate. If the validation holds, the {@code CommandHandler} emits
 * corresponding events to the event log.
 */
public interface CommandHandler {

    CompletableFuture<Void> onCommand(ItemCommand command);

    CompletableFuture<Void> onCommand(List<ItemCommand> command);
}
