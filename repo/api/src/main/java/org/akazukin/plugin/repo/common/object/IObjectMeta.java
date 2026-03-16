package org.akazukin.plugin.repo.common.object;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IObjectMeta<T extends IStoreObject> {
    @NotNull
    T getObject();

    @Nullable
    Long getVersionNo();

    IObjectMeta<T> renewInstance(@NotNull T object);
}
