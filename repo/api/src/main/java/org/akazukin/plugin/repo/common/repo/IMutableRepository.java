package org.akazukin.plugin.repo.common.repo;

import org.akazukin.plugin.repo.common.object.IMutableObjectMeta;
import org.jetbrains.annotations.NotNull;

public interface IMutableRepository<T extends IMutableObjectMeta<?>> extends IRepository<T> {
    void save(@NotNull T meta);

    void delete(@NotNull T meta);
}
