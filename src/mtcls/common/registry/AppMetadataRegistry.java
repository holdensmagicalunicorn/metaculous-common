package mtcls.common.registry;

import java.util.List;

import mtcls.common.model.AppModule;
import mtcls.common.model.AppNamespace;
import mtcls.common.model.AppProperty;

public interface AppMetadataRegistry {
	public List<AppNamespace> getNamespaces();

	public AppNamespace getNamespace(String namespace);

	public List<AppModule> getModules(AppNamespace namespace);

	public AppModule getModule(AppNamespace namespace, String moduleName);
	
	public AppModule getModule(String namespace, String moduleName);
	
	public AppModule getModuleFromPathName(String pathName);
	
	public List<AppProperty> getProperties(String namespace, String moduleName);
}
