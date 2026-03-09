package org.akazukin.bot.store.repo;

public interface ITransactableRepository {
    void beginTransaction();

    void commitTransaction();

    void rollbackTransaction();
}
