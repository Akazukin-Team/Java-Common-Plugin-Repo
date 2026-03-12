package org.akazukin.plugin.repo.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.akazukin.loader.api.ILoader;
import org.akazukin.plugin.repo.common.repo.IRepository;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommonRepoPlugin implements ICommonRepoPlugin {
    final ILoader loader;
    @Setter
    IRepositoryManager<IRepository<?>> repoMgr;
    @Setter
    ITransactionManager txMgr;

    public CommonRepoPlugin(final ILoader loader) {
        this.loader = loader;
    }
}
