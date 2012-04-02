package com.lingona.es4j.domainpersistence.api;

import java.util.Map;

/**
 *
 * @author Esfand
 */
public abstract class HeaderUpdater {
    public abstract void updateHeader(Map<String, Object> map);
}
