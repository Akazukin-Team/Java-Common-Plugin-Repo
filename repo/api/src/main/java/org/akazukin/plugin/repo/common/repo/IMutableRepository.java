package org.akazukin.plugin.repo.common.repo;

import org.akazukin.plugin.repo.common.object.IObjectMeta;
import org.jetbrains.annotations.NotNull;

public interface IMutableRepository<T extends IObjectMeta<?>> extends IRepository<T> {
    void save(@NotNull T meta);

    void delete(@NotNull T meta);
}
