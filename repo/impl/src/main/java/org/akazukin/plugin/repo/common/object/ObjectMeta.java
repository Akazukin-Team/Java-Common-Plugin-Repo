package org.akazukin.plugin.repo.common.object;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Getter
public class ObjectMeta<T extends IStoreObject> implements IObjectMeta<T> {
    T object;
    Long versionNo;

    public ObjectMeta(@NotNull final T object, final Long versionNo) {
        this.object = object;
        this.versionNo = versionNo;
    }

    @Override
    public String toString() {
        return "ObjectMeta{" +
                "object=" + this.object +
                ", versionNo=" + this.versionNo +
                '}';
    }
}
