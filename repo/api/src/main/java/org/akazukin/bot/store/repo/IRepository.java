package org.akazukin.bot.store.repo;

import org.akazukin.bot.store.object.IObjectMetadata;

public interface IRepository<T extends IObjectMetadata<?>> {
    String getRepositoryName();
}
