package org.akazukin.plugin.repo.common;

import org.akazukin.plugin.repo.common.repo.IRepository;
import org.akazukin.service.manager.holder.ServiceManagerHolder;

public class RepositoryManager<T extends IRepository<?>> extends ServiceManagerHolder<T> implements IRepositoryManager<T> {
    protected RepositoryManager(final Class<T> repoType) {
        super(repoType);
    }

    @Override
    public <U extends T> U getRepository(final Class<U> blueprint) {
        final U[] repos = super.getServicesByInterfaceClass(blueprint);
        if (repos.length != 1) {
            return null;
        }

        return repos[0];
    }

    @Override
    @SuppressWarnings("unchecked")
    public void registerRegistry(final IRepositoryRegistry<? extends T> repo) {
        if (!(repo instanceof RepositoryRegistry)) {
            throw new IllegalArgumentException("The repository must be an instance: " + RepositoryRegistry.class.getName());
        }
        super.registerStore((RepositoryRegistry<T>) repo);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void unregisterRegistry(final IRepositoryRegistry<? extends T> repo) {
        if (!(repo instanceof RepositoryRegistry)) {
            throw new IllegalArgumentException("The repository must be an instance: " + RepositoryRegistry.class.getName());
        }
        super.registerStore((RepositoryRegistry<T>) repo);
    }
}
