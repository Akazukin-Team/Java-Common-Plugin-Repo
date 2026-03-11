package org.akazukin.plugin.repo.common;

import org.akazukin.plugin.repo.common.repo.IRepository;
import org.akazukin.service.manager.holder.ServiceManagerHolder;

public class RepositoryManager<T extends IRepository<?>> extends ServiceManagerHolder<T> implements IRepositoryManager<T> {
    public RepositoryManager(final Class<T> repoType) {
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
    public void registerRegistry(final IRepositoryRegistry<T> repo) {
        super.registerStore(repo);
    }

    @Override
    public void unregisterRegistry(final IRepositoryRegistry<T> repo) {
        super.registerStore(repo);
    }
}
