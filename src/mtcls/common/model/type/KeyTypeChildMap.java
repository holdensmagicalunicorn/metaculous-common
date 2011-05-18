package mtcls.common.model.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("serial")
public class KeyTypeChildMap<U> extends HashMap<String, List<U>> {
	protected KeyTypeMap<U> typeMap;
	
	public KeyTypeChildMap(KeyTypeMap<U> typeMap){
		setTypeMap(typeMap);
	}
	
	public void addChildNames(String key, String [] childNames){
		if(childNames == null || childNames.length <=0){
			return;
		}
		for(int i=0; i<childNames.length; i++){
			String childName = childNames[i];
			addChild(key, childName);
		}
	}
	
	public boolean addChild(String key, String childName){
		U child = getTypeMap().get(childName);
		return addChild(key, child);
	}
	
	public boolean addChild(String key, U child){
		List<U> list = getChildren(key);
		if(list == null){
			list = new ArrayList<U>();
		}
		boolean retval = list.add(child);
		put(key, list);
		return retval;
	}
	
	public List<U> setChildren(String key, List<U> children){
		List<U> retval = put(key, children);
		return retval;
	}
	public List<U> getChildren(String key){
		List<U> retval = get(key);
		return retval;
	}
	/**
	 * @return the typeMap
	 */
	public KeyTypeMap<U> getTypeMap() {
		return typeMap;
	}
	/**
	 * @param typeMap the typeMap to set
	 */
	public void setTypeMap(KeyTypeMap<U> typeMap) {
		this.typeMap = typeMap;
	}
}
