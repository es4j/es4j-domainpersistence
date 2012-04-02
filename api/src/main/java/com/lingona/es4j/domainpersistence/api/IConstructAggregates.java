package com.lingona.es4j.domainpersistence.api;

import com.lingona.es4j.domain.api.IAggregate;
import com.lingona.es4j.domain.api.IMemento;
import java.util.UUID;


public interface IConstructAggregates {

    <TAggregate extends IAggregate> TAggregate build(Class<TAggregate> type, UUID id, IMemento snapshot);
}
