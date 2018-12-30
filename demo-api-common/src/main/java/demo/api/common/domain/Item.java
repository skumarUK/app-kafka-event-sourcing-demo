package demo.api.common.domain;

import demo.api.common.domain.event.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ITEM")
public class Item implements Serializable {

    @Id
    @Column(name = "ID", unique = true, nullable = false, updatable = false)
    private String id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "REQUIRED_TIME")
    private int requiredTime;

    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @Column(name = "TAGS")
    private List<String> tags;

    @Column(name = "ASSOCIATED_LIST")
    private String associatedList;

    @Column(name = "DONE")
    private boolean done;

    public Item() { /* to make JPA happy */ }

    public Item(final ItemCreated event) {
        this.id = event.getItemId();
        this.description = event.getDescription();
        this.tags = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public boolean isDone() {
        return done;
    }

    public String getDescription() {
        return description;
    }

    public int getRequiredTime() {
        return requiredTime;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public List<String> getTags() {
        return Collections.unmodifiableList(tags);
    }

    public String getAssociatedList() {
        return associatedList;
    }

    /**
     * Mutates the state of this {@code Item} in compliance with the given {@code ItemEvent}.
     *
     * @param event an event that occured in the system and that signals a change of state
     *              for the aggregate {@code Item}
     */
    public void project(final ItemEvent event) {
        if (event instanceof DueDateAssigned) project((DueDateAssigned) event);
        else if (event instanceof RequiredTimeAssigned) project((RequiredTimeAssigned) event);
        else if (event instanceof TagAssigned) project((TagAssigned) event);
        else if (event instanceof ItemConcluded) project((ItemConcluded) event);
        else if (event instanceof ItemMovedToList) project((ItemMovedToList) event);
        else if (event instanceof TagRemoved) project((TagRemoved) event);
        else throw new IllegalStateException("Unrecognized event: " + event.toString());
    }

    private void project(final DueDateAssigned event) {
        this.dueDate = event.getDueDate();
    }

    private void project(final RequiredTimeAssigned event) {
        this.requiredTime = event.getRequiredTime();
    }

    private void project(final TagAssigned event) {
        synchronized (this) {
            if (!tags.contains(event.getTag())) {
                tags.add(event.getTag());
            }
        }
    }

    private void project(final TagRemoved event) {
        synchronized (this) {
            tags.remove(event.getTag());
        }
    }

    private void project(final ItemConcluded event) {
        this.done = true;
    }

    private void project(final ItemMovedToList event) {
        this.associatedList = event.getList();
    }
}
