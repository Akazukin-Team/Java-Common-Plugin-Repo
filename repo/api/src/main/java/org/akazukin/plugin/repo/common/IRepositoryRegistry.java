package org.akazukin.plugin.repo.common;

import org.akazukin.plugin.repo.common.repo.IRepository;

public interface IRepositoryRegistry<T extends IRepository<?>> {
    <U extends T> void registerRepository(final Class<U> blueprint, final U repo);

    void unregisterRepository(Class<? extends T> blueprint);

    void unregisterRepository(T repo);
}
