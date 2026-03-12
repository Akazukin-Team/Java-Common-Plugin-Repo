package org.akazukin.plugin.repo.common;

import org.akazukin.loader.api.context.IPlugin;
import org.akazukin.plugin.repo.common.repo.IRepository;

public interface ICommonRepoPlugin extends IPlugin {
    IRepositoryManager<IRepository<?>> getRepoMgr();

    void setRepoMgr(IRepositoryManager<IRepository<?>> repoMgr);

    ITransactionManager getTxMgr();

    void setTxMgr(ITransactionManager txMgr);
}
