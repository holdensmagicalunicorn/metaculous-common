package mtcls.common.registry;

import mtcls.common.model.type.NamedType;

@SuppressWarnings("serial")
public class CustomRegistryType extends NamedType{
	
	public CustomRegistryType(String name) {
		super(name);
	}
	
	public String getRegistryName(){
		return getName();
	}
}
