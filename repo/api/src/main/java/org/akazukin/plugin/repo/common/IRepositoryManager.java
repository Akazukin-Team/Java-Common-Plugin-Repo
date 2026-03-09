package org.akazukin.plugin.repo.common;

import org.akazukin.plugin.repo.common.repo.IRepository;

public interface IRepositoryManager<T extends IRepository<?>> {
    <U extends T> U getRepository(Class<U> blueprint);

    void registerRegistry(IRepositoryRegistry<? extends T> repo);

    void unregisterRegistry(IRepositoryRegistry<? extends T> repo);
}
