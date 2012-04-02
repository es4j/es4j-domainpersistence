package com.lingona.es4j.domain.persistence;

import com.lingona.es4j.domainpersistence.eventstore.IDomainEvent;
import java.util.UUID;


public class TestAggregateCreatedEvent implements IDomainEvent {
    private UUID   id;   // { get; set; }
    private String name; // { get; set; }

    public TestAggregateCreatedEvent(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
