package mtcls.common.model.type;

public abstract class KeyedTypeRegistry<U> {
	protected KeyTypeMap<U> typeMap;
	protected KeyTypeChildMap<U> childMap;
	
	public KeyedTypeRegistry() {
	}

	
	public void addChildren(String key, String [] childNames){
		getChildMap().addChildNames(key, childNames);
		afterAdd(key, childNames);
	}
	
	public void addChild(String key, String childName){
		getChildMap().addChild(key, childName);
		afterAdd(key, childName);
	}
	
	public void addChild(String key, U child){
		getChildMap().addChild(key, child);
		afterAdd(key, child);
	}

	public void register(String key, U namedType) {
		getTypeMap().put(key, namedType);
	}
	
	public void afterAdd(String key, String [] childNames){
		
	}
	
	public void afterAdd(String key, String childName){
		
	}
	
	public void afterAdd(String key, U child){
		onChildUpdated(key, child);
	}
	
	protected abstract void onChildUpdated(String key, U child);

	public KeyTypeMap<U> getTypeMap() {
		if (typeMap != null) {
			return typeMap;
		}
		typeMap = new KeyTypeMap<U>();
		return typeMap;
	}

	public void setTypeMap(KeyTypeMap<U> typeMap) {
		this.typeMap = typeMap;
	}

	/**
	 * @return the childMap
	 */
	public KeyTypeChildMap<U> getChildMap() {
		if(childMap == null){
			childMap = new KeyTypeChildMap<U>(getTypeMap());
		}
		return childMap;
	}

	/**
	 * @param childMap the childMap to set
	 */
	public void setChildMap(KeyTypeChildMap<U> childMap) {
		this.childMap = childMap;
	}
}
