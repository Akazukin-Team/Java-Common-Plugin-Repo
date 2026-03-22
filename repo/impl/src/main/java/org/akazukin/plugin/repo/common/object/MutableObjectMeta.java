package org.akazukin.plugin.repo.common.object;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Getter
public class MutableObjectMeta<T extends IStoreObject> extends ObjectMeta<T> implements IMutableObjectMeta<T> {
    T original;

    public MutableObjectMeta(@NotNull final T object) {
        this(object, null, null);
    }

    public MutableObjectMeta(@NotNull final T object, @Nullable final T original, @Nullable final Long versionNo) {
        super(object, versionNo);
        this.original = original;
    }

    @Override
    public IMutableObjectMeta<T> renewInstance(final @NotNull T object) {
        return new MutableObjectMeta<>(object, this.getObject(), this.getVersionNo());
    }

    @Override
    public boolean isModified() {
        return !Objects.equals(this.getObject(), this.original);
    }

    @Override
    public String toString() {
        return "MutableObjectMeta{" +
                "object=" + this.getObject() +
                ", original=" + this.original +
                ", versionNo=" + this.getVersionNo() +
                '}';
    }
}
