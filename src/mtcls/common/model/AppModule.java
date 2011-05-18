package mtcls.common.model;

import java.util.List;

public interface AppModule {
	public long getId();
	public AppModule getParentModule();
	public AppNamespace getAppNamespace();
	public String getName();	
	public String getLabel();
	public String getGroupName();
	public String getGroupLabel();
	public String getRepository();
	public String getModuleWidget();
	public String getSearchWidget();
	public String getListWidget();
	public String getDetailWidget();
	public boolean isEditable();
	public boolean isUpdatable();
	public boolean isCreateable();
	public boolean isDuplicatable();
	public boolean isRemovable();
	public boolean isAuditable();
	public boolean isNavigatable();
	public boolean isSearchable();
	public boolean isAdvancedSearchable();
	public boolean isListable();
	public boolean isDetailable();
	public List<AppModule> getChildModules();
	public List<AppProperty> getProperties();
}
