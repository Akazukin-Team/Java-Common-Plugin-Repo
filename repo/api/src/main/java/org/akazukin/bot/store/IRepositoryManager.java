package org.akazukin.bot.store;

import org.akazukin.bot.store.repo.IRepository;

public interface IRepositoryManager<T extends IRepository<?>> {
    <U extends T> U getRepository(Class<U> blueprint);

    void registerRegistry(IRepositoryRegistry<? extends T> repo);

    void unregisterRegistry(IRepositoryRegistry<? extends T> repo);
}
