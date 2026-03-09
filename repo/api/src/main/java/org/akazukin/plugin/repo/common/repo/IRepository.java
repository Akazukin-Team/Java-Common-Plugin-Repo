package org.akazukin.plugin.repo.common.repo;

import org.akazukin.plugin.repo.common.object.IObjectMetadata;

public interface IRepository<T extends IObjectMetadata<?>> {
    String getRepositoryName();
}
