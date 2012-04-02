package com.lingona.es4j.domainpersistence.api;

import com.lingona.es4j.domain.api.ISaga;
import java.util.UUID;

public interface ISagaRepository {

    <TSaga extends ISaga> TSaga getById(Class<TSaga> clazz, UUID sagaId); // where TSaga : class, ISaga, new();

    void save(ISaga saga, UUID commitId, HeaderUpdater updateHeaders);
}
