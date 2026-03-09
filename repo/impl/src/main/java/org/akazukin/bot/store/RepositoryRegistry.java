package org.akazukin.bot.store;

import org.akazukin.bot.store.repo.IRepository;
import org.akazukin.service.registry.SingleServiceRegistry;
import org.jetbrains.annotations.NotNull;

public class RepositoryRegistry<T extends IRepository<?>> extends SingleServiceRegistry<T> implements IRepositoryRegistry<T> {
    public RepositoryRegistry() {
        this((Class) IRepository.class);
    }

    public RepositoryRegistry(@NotNull final Class<T> repoType) {
        super(repoType);
    }

    @Override
    public <U extends T> void registerRepository(final Class<U> blueprint, final U repo) {
        super.registerService(blueprint, repo);
    }

    @Override
    public void unregisterRepository(final Class<? extends T> blueprint) {
        super.unregisterServiceByInterfaceClass(blueprint);
    }

    @Override
    public void unregisterRepository(final T repo) {
        super.unregisterService(repo);
    }
}
