package mtcls.common.service;

import mtcls.common.model.AppModule;
import mtcls.common.model.AppNamespace;

public interface MetadataService {
	public AppModule getModule(String canonicalName);
	public AppNamespace getNamespace(String namespace);
	public AppModule getModule(AppNamespace namespace);
}
