package demo.api.common.domain.commands;


abstract public class ItemCommand {

    private final String itemId;

    public ItemCommand(final String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return itemId;
    }
}
