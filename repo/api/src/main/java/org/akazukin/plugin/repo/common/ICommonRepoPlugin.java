package org.akazukin.plugin.repo.common;

import org.akazukin.loader.api.context.IPlugin;

public interface ICommonRepoPlugin extends IPlugin {
    IRepositoryManager<?> getRepoMgr();

    void setRepoMgr(IRepositoryManager<?> repoMgr);

    ITransactionManager getTxMgr();

    void setTxMgr(ITransactionManager txMgr);
}
