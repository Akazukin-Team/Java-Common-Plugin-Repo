package org.akazukin.bot.store.object;

public interface IObjectMetadata<T extends IStoreObject> {
    String getObjectName();

    T getObject();

    Long getVersionNo();

    IObjectMetadata<T> renewInstance(T object);
}
