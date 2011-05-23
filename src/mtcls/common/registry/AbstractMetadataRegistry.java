package mtcls.common.registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mtcls.common.model.AppModule;
import mtcls.common.model.AppNamespace;
import mtcls.common.model.AppProperty;

public class AbstractMetadataRegistry implements AppMetadataRegistry {
	protected List<AppNamespace> namespaces;
	protected Map<AppNamespace, List<AppModule>> namespaceModuleMap;

	protected List<AppNamespace> createNamespaces(){
		return new ArrayList<AppNamespace>();
	}
	
	protected Map<AppNamespace, List<AppModule>> createNamespaceModuleMap(){
		Map<AppNamespace, List<AppModule>> retval = new HashMap<AppNamespace, List<AppModule>>();
		return retval;
	}
	
	@Override
	public List<AppNamespace> getNamespaces() {
		if(namespaces == null){
			namespaces = createNamespaces();
		}
		return namespaces;
	}

	public void setNamespaces(List<AppNamespace> namespaces) {
		this.namespaces = namespaces;
	}

	public Map<AppNamespace, List<AppModule>> getNamespaceModuleMap() {
		if(namespaceModuleMap == null){
			namespaceModuleMap = createNamespaceModuleMap();
		}
		return namespaceModuleMap;
	}

	public void setNamespaceModuleMap(
			Map<AppNamespace, List<AppModule>> namespaceModuleMap) {
		this.namespaceModuleMap = namespaceModuleMap;
	}

	@Override
	public AppNamespace getNamespace(String namespace) {
		AppNamespace retval = null;
		if(namespace == null){
			return retval;
		}
		List<AppNamespace> nsList = getNamespaces();
		for (AppNamespace appNamespace : nsList) {
			if(namespace.equals(appNamespace.getName())){
				retval = appNamespace;
				return retval;
			}
		}
		return retval;
	}

	@Override
	public List<AppModule> getModules(AppNamespace namespace) {
		return getNamespaceModuleMap().get(namespace);
	}

	@Override
	public AppModule getModule(AppNamespace namespace, String moduleName) {
		AppModule retval = null;
		if(namespace == null || moduleName == null){
			return retval;
		}
		List<AppModule> moduleList = getModules(namespace);
		for (AppModule appModule : moduleList) {
			if(moduleName.equals(appModule.getName())){
				retval = appModule;
				return retval;
			}
		}
		return retval;
	}
	
	@Override
	public AppModule getModule(String namespace, String moduleName){
		AppModule retval = null;
		if(namespace == null || moduleName == null){
			return retval;
		}
		AppNamespace ns = getNamespace(namespace);
		if(ns==null){
			return retval;
		}
		retval = getModule(ns, moduleName);
		return retval;
	}

	@Override
	public List<AppProperty> getProperties(String namespace, String moduleName) {
		List<AppProperty> retval = null;
		if(namespace == null || moduleName == null){
			return retval;
		}
		AppNamespace ns = getNamespace(namespace);
		if(ns == null){
			return retval;
		}
		AppModule appModule = getModule(ns, moduleName);
		if(appModule == null){
			return retval;
		}
		retval = appModule.getProperties();
		return retval;
	}

	@Override
	public AppModule getModuleFromPathName(String pathName) {
		AppModule retval = null;
		if(pathName == null || "".equals(pathName) ){
			return retval;
		}
		String moduleName = null;
		String namespace = null;
		int moduleStartIdx = pathName.lastIndexOf(".");
		if(moduleStartIdx<=0){
			moduleName = pathName;
			namespace = "";
		}else{
			moduleName = pathName.substring(moduleStartIdx+1);
			namespace = pathName.substring(0, moduleStartIdx);
		}
		
		if(moduleName == null || "".equals(moduleName)){
			return retval;
		}
		retval = getModule(namespace, moduleName);
		return retval;
	}
}
