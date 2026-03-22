package org.akazukin.plugin.repo.common.object;

import org.jetbrains.annotations.NotNull;

public interface IMutableObjectMeta<T extends IStoreObject> extends IObjectMeta<T> {
    T getOriginal();

    IMutableObjectMeta<T> renewInstance(@NotNull T object);

    boolean isModified();
}
