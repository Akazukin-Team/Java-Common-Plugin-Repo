package org.akazukin.plugin.repo.common.repo;

public interface ITransactableRepository {
    void beginTransaction();

    void commitTransaction();

    void rollbackTransaction();
}
