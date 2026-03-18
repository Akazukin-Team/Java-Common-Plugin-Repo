package org.akazukin.plugin.repo.common.object;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class ObjectMeta<T extends IStoreObject> implements IObjectMeta<T> {
    final T object;
    final Long versionNo;
    final T original;

    public ObjectMeta(@NotNull final T object) {
        this(object, null, null);
    }

    public ObjectMeta(@NotNull final T object, @Nullable final T original, @Nullable final Long versionNo) {
        this.object = object;
        this.original = original;
        this.versionNo = versionNo;
    }

    @Override
    public IObjectMeta<T> renewInstance(final @NotNull T object) {
        return new ObjectMeta<>(object, this.object, this.versionNo);
    }

    @Override
    public boolean isModified() {
        return !Objects.equals(this.object, this.original);
    }
}
