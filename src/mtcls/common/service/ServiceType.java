package mtcls.common.service;

import mtcls.common.model.type.NamedType;

@SuppressWarnings("serial")
public class ServiceType extends NamedType{
	public ServiceType(){
		super();
	}
	
	public ServiceType(String serviceName){
		super(serviceName);
	}
	
	public String getServiceName(){
		return getName();
	}
}
