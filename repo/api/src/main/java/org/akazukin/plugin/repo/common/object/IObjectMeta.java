package org.akazukin.plugin.repo.common.object;

public interface IObjectMeta<T extends IStoreObject> {
    T getObject();

    Long getVersionNo();

    IObjectMeta<T> renewInstance(T object);
}
