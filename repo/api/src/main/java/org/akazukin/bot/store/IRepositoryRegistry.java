package org.akazukin.bot.store;

import org.akazukin.bot.store.repo.IRepository;

public interface IRepositoryRegistry<T extends IRepository<?>> {
    <U extends T> void registerRepository(final Class<U> blueprint, final U repo);

    void unregisterRepository(Class<? extends T> blueprint);

    void unregisterRepository(T repo);
}
