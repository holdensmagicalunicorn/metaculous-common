package mtcls.common.service;

public abstract class ServiceTypeRegistry {
	public static ServiceType SysPropertyService = new ServiceType("sys.module.values");
	public static ServiceType SysModuleService = new ServiceType("sys.module");	
	public static ServiceType SysNamingService = new ServiceType("sys.naming");
}
