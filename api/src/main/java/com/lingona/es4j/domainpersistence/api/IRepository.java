package com.lingona.es4j.domainpersistence.api;

import com.lingona.es4j.domain.api.IAggregate;
import java.util.UUID;


public interface IRepository {
    public <TAggregate extends IAggregate> TAggregate getById(Class<TAggregate> clazz, UUID id); // where TAggregate : class, IAggregate;

    <TAggregate extends IAggregate> TAggregate getById(Class<TAggregate> clazz, UUID id, int version); // where TAggregate : class, IAggregate;

    <TAggregate extends IAggregate> void save(TAggregate aggregate, UUID commitId, HeaderUpdater headerUpdater/*updateHeaders*/);
}
