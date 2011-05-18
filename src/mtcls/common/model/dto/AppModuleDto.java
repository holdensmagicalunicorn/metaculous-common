package mtcls.common.model.dto;

import java.util.List;

import mtcls.common.model.AppModule;
import mtcls.common.model.AppNamespace;
import mtcls.common.model.AppProperty;

public class AppModuleDto implements AppModule{
	protected long id;
	protected AppModule parentModule;
	protected AppNamespace appNamespace;
	protected String name;	
	protected String label;
	protected String groupName;
	protected String groupLabel;
	protected String repository;
	protected String moduleWidget;
	protected String searchWidget;
	protected String listWidget;
	protected String detailWidget;
	protected boolean editable;
	protected boolean updatable;
	protected boolean createable;
	protected boolean duplicatable;
	protected boolean removable;
	protected boolean auditable;
	protected boolean navigatable;
	protected boolean searchable;
	protected boolean advancedSearchable;
	protected boolean listable;
	protected boolean detailable;
	protected List<AppModule> childModules;
	protected List<AppProperty> properties;
	
	public AppModuleDto(){
		super();
	}
	
	/**
	 * @param id
	 * @param parentModule
	 * @param appNamespace
	 * @param name
	 * @param label
	 * @param groupName
	 * @param groupLabel
	 * @param repository
	 * @param moduleWidget
	 * @param searchWidget
	 * @param listWidget
	 * @param detailWidget
	 * @param editable
	 * @param updatable
	 * @param createable
	 * @param duplicatable
	 * @param removable
	 * @param auditable
	 * @param navigatable
	 * @param searchable
	 * @param advancedSearchable
	 * @param listable
	 * @param detailable
	 * @param childModules
	 * @param properties
	 */
	public AppModuleDto(long id, 
						AppModule parentModule, 
						AppNamespace appNamespace, 
						String name,
						String label, 
						String groupName, 
						String groupLabel,
						String repository, 
						String moduleWidget, 
						String searchWidget,
						String listWidget, 
						String detailWidget, 
						boolean editable,
						boolean updatable, 
						boolean createable, 
						boolean duplicatable,
						boolean removable, 
						boolean auditable, 
						boolean navigatable,
						boolean searchable, 
						boolean advancedSearchable, 
						boolean listable,
						boolean detailable, 
						List<AppModule> childModules,
						List<AppProperty> properties) {
		super();
		setId(id);
		setParentModule(parentModule);
		setAppNamespace(appNamespace);
		setName(name);
		setLabel(label);
		setGroupName(groupName);
		setGroupLabel(groupLabel);
		setRepository(repository);
		setModuleWidget(moduleWidget);
		setSearchWidget(searchWidget);
		setListWidget(listWidget);
		setDetailWidget(detailWidget);
		setEditable(editable);
		setUpdatable(updatable);
		setCreateable(createable);
		setDuplicatable(duplicatable);
		setRemovable(removable);
		setAuditable(auditable);
		setNavigatable(navigatable);
		setSearchable(searchable);
		setAdvancedSearchable(advancedSearchable);
		setListable(listable);
		setDetailable(detailable);
		setChildModules(childModules);
		setProperties(properties);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public AppModule getParentModule() {
		return parentModule;
	}
	public void setParentModule(AppModule parentModule) {
		this.parentModule = parentModule;
	}
	public AppNamespace getAppNamespace(){
		return appNamespace;
	}
	public void setAppNamespace(AppNamespace appNamespace){
		this.appNamespace = appNamespace;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupLabel() {
		return groupLabel;
	}
	public void setGroupLabel(String groupLabel) {
		this.groupLabel = groupLabel;
	}
	public String getRepository() {
		return repository;
	}
	public void setRepository(String repository) {
		this.repository = repository;
	}
	public String getModuleWidget() {
		return moduleWidget;
	}
	public void setModuleWidget(String moduleWidget) {
		this.moduleWidget = moduleWidget;
	}
	public String getSearchWidget() {
		return searchWidget;
	}
	public void setSearchWidget(String searchWidget) {
		this.searchWidget = searchWidget;
	}
	public String getListWidget() {
		return listWidget;
	}
	public void setListWidget(String listWidget) {
		this.listWidget = listWidget;
	}
	public String getDetailWidget() {
		return detailWidget;
	}
	public void setDetailWidget(String detailWidget) {
		this.detailWidget = detailWidget;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public boolean isUpdatable() {
		return updatable;
	}
	public void setUpdatable(boolean updatable) {
		this.updatable = updatable;
	}
	public boolean isCreateable() {
		return createable;
	}
	public void setCreateable(boolean createable) {
		this.createable = createable;
	}
	public boolean isDuplicatable() {
		return duplicatable;
	}
	public void setDuplicatable(boolean duplicatable) {
		this.duplicatable = duplicatable;
	}
	public boolean isRemovable() {
		return removable;
	}
	public void setRemovable(boolean removable) {
		this.removable = removable;
	}
	public boolean isAuditable() {
		return auditable;
	}
	public void setAuditable(boolean auditable) {
		this.auditable = auditable;
	}
	public boolean isNavigatable() {
		return navigatable;
	}
	public void setNavigatable(boolean navigatable) {
		this.navigatable = navigatable;
	}
	public boolean isSearchable() {
		return searchable;
	}
	public void setSearchable(boolean searchable) {
		this.searchable = searchable;
	}
	public boolean isAdvancedSearchable() {
		return advancedSearchable;
	}
	public void setAdvancedSearchable(boolean advancedSearchable) {
		this.advancedSearchable = advancedSearchable;
	}
	public boolean isListable() {
		return listable;
	}
	public void setListable(boolean listable) {
		this.listable = listable;
	}
	public boolean isDetailable() {
		return detailable;
	}
	public void setDetailable(boolean detailable) {
		this.detailable = detailable;
	}
	public List<AppModule> getChildModules() {
		return childModules;
	}
	public void setChildModules(List<AppModule> childModules) {
		this.childModules = childModules;
	}
	public List<AppProperty> getProperties() {
		return properties;
	}
	public void setProperties(List<AppProperty> properties) {
		this.properties = properties;
	}
}
