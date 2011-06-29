package mtcls.common.registry;

import mtcls.common.model.type.KeyedTypeRegistry;

public abstract class AbstractTypesRegistry<U> extends KeyedTypeRegistry<U> {

	public abstract void init();
}
