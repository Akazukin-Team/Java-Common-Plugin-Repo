package org.akazukin.plugin.repo.common.repo;

import org.akazukin.plugin.repo.common.object.IObjectMeta;

public interface IRepository<T extends IObjectMeta<?>> {
    String getRepositoryName();
}
