package demo.api.common.domain.event;

import java.util.UUID;


abstract public class ItemEvent {

    private final String eventId;
    private final long timestamp;
    private final String itemId;

    public ItemEvent(final String itemId) {
        this(UUID.randomUUID().toString().substring(0, 7), System.currentTimeMillis(), itemId);
    }

    public ItemEvent(final String eventId, final long timestamp, final String itemId) {
        this.eventId = eventId;
        this.timestamp = timestamp;
        this.itemId = itemId;
    }

    public String getEventId() {
        return eventId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getItemId() {
        return itemId;
    }
}
