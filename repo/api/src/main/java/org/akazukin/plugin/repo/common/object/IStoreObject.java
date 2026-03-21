package org.akazukin.plugin.repo.common.object;

public interface IStoreObject {
    @Override
    String toString();

    boolean equalsData(Object obj);
}
