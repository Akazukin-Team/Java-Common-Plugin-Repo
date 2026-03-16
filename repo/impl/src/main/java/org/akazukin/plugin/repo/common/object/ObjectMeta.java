package org.akazukin.plugin.repo.common.object;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class ObjectMeta<T extends IStoreObject> implements IObjectMeta<T> {
    final T object;
    final Long versionNo;

    public ObjectMeta(final T object, final Long versionNo) {
        this.object = object;
        this.versionNo = versionNo;
    }

    @Override
    public IObjectMeta<T> renewInstance(final @NotNull T object) {
        return new ObjectMeta<>(object, this.versionNo);
    }
}
