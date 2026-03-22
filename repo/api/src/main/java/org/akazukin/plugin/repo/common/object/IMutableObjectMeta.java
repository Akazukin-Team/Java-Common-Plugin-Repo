package org.akazukin.plugin.repo.common.object;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IMutableObjectMeta<T extends IStoreObject> extends IObjectMeta<T> {
    @Nullable
    T getOriginal();

    IMutableObjectMeta<T> renewInstance(@NotNull T object);

    boolean isModified();
}
