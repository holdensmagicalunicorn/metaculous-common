package mtcls.common.model;

import java.util.List;

public interface AppModule {
	public long getId();
	
	public AppModule getParentModule();
	public void setParentModule(AppModule parentModule);
	
	public AppNamespace getAppNamespace();
	public void setAppNamespace(AppNamespace appNamespace);
	
	public String getName();	
	public void setName(String name);
	
	public String getLabel();
	public void setLabel(String label);
	
	public String getGroupName();
	public void setGroupName(String groupName);
	
	public String getGroupLabel();
	public void setGroupLabel(String groupLabel);
	
	public String getRepository();
	public void setRepository(String repository);
	
	public String getModuleWidget();
	public void setModuleWidget(String moduleWidget);
	
	public String getSearchWidget();
	public void setSearchWidget(String searchWidget);
	
	public String getListWidget();
	public void setListWidget(String listWidget);
		
	public String getDetailWidget();
	public void setDetailWidget(String detailWidget);
	
	public boolean isEditable();
	public void setEditable(boolean editable);
	
	public boolean isUpdatable();
	public void setUpdatable(boolean updatable);
	
	public boolean isCreateable();
	public void setCreateable(boolean createable);
	
	public boolean isDuplicatable();
	public void setDuplicatable(boolean duplicatable);
	
	public boolean isRemovable();
	public void setRemovable(boolean removable);
	
	public boolean isAuditable();
	public void setAuditable(boolean auditable);
	
	public boolean isNavigatable();
	public void setNavigatable(boolean navigatable);
	
	public boolean isSearchable();
	public void setSearchable(boolean searchable);
	
	public boolean isAdvancedSearchable();
	public void setAdvancedSearchable(boolean advancedSearchable);
	
	public boolean isListable();
	public void setListable(boolean listable);
	
	public boolean isDetailable();
	public void setDetailable(boolean detailable);
	
	public List<AppModule> getChildModules();
	public void setChildModules(List<AppModule> childModules);
	
	public List<AppProperty> getProperties();
	public void setProperties(List<AppProperty> properties);
}
