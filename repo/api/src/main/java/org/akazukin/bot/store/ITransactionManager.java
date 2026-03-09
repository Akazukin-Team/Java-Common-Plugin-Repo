package org.akazukin.bot.store;

import java.util.function.Supplier;

public interface ITransactionManager {
    void requiresNew(Runnable runnable);

    <T> T requiresNew(Supplier<T> supplier);
}
