package com.lingona.es4j.domainpersistence.api;

import com.lingona.es4j.domain.api.IAggregate;
import java.util.Map;
import java.util.UUID;


public class RepositoryExtensions {

    public static void save(/*this*/ IRepository repository, IAggregate aggregate, UUID commitId) {
        repository.save(aggregate, commitId, new HeaderUpdater() {
            @Override
            public void updateHeader(Map<String, Object> map) {}
        });
    }
}
