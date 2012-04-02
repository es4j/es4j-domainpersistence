package com.lingona.es4j.domainpersistence.api;

public interface IConflictWith {

    boolean ConflictsWith(Object uncommitted, Object committed);
}
