package org.akazukin.bot.store.repo;

import org.akazukin.bot.store.object.IObjectMetadata;
import org.jetbrains.annotations.NotNull;

public interface IMutableRepository<T extends IObjectMetadata<?>> extends IRepository<T> {
    void save(@NotNull T meta);

    void delete(@NotNull T meta);
}
