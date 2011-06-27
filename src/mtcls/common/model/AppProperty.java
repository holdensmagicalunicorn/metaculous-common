package mtcls.common.model;

public interface AppProperty {
	public long getId();
	
	public String getName();
	public void setName(String name);
	
	public String getLabel();
	public void setLabel(String label);
	
	public Integer getSequence();
	public void setSequence(Integer sequence);
	
	public String getGroupName();
	public void setGroupName(String groupName);
	
	public String getGroupLabel();
	public void setGroupLabel(String groupLabel);
	
	public Integer getSortPriority();
	public void setSortPriority(Integer sortPriority);
	
	public String getDataType();
	public void setDataType(String dataType);
	
	public String getDisplayType();
	public void setDisplayType(String displayType);
	
	public String getDaoPropertyName();
	public void setDaoPropertyName(String daoPropertyName);
	
	public Object getValue();
	public void setValue(Object value);
	
    public String getSaveParameterType();
    public void setSaveParameterType(String saveParameterType);
    
    public Integer getWidth();
    public void setWidth(Integer width);
    
    public Double getMinValue();
    public void setMinValue(Double minValue);
    
    public Double getMaxValue();
    public void setMaxValue(Double maxValue);
    
    public String getRegexPattern();
    public void setRegexPattern(String regexPattern);
    
    public String getAddDefaultValue();
    public void setAddDefaultValue(String addDefaultValue);
    
    public String getEditDefaultValue();
    public void setEditDefaultValue(String editDefaultValue);
    
    public String getSearchDefaultValue();
    public void setSearchDefaultValue(String searchDefaultValue);
    
    public String getLookupName();
    public void setLookupName(String lookupName);
    
    public String getLookupPair();
    public void setLookupPair(String lookupPair);
    
    public String getLookupServiceName();
    public void setLookupServiceName(String lookupServiceName);
    
    public Integer getDecimalPrecision();
    public void setDecimalPrecision(Integer decimalPrecision);
    
    public boolean isSortDesc();
    public void setSortDesc(boolean sortDesc);
    
	public boolean isKey();
	public void setKey(boolean key);
	
	public boolean isLookup();
	public void setLookup(boolean lookup);
	
	public boolean isRequired();
	public void setRequired(boolean required);
	
	public boolean isSearchable();
	public void setSearchable(boolean searchable);
	
	public boolean isSearchRange();
	public void setSearchRange(boolean searchRange);
	
	public boolean isSearchParticipate();
	public void setSearchParticipate(boolean searchParticipate);
	
	public boolean isSearchShowOnEmpty();
	public void setSearchShowOnEmpty(boolean searchShowOnEmpty);
	
	public boolean isListable();
	public void setListable(boolean listable);
	
	public boolean isDetailable();
	public void setDetailable(boolean detailable);
	
	public boolean isAdvancedSearch();
	public void setAdvancedSearch(boolean advancedSearch);
	
	public boolean isEditable();
	public void setEditable(boolean editable);
	
    public boolean isEditableOnAdd();
    public void setEditableOnAdd(boolean editableOnAdd);
    
    public boolean isEditableOnSearch();
    public void setEditableOnSearch(boolean editableOnSearch);
    
    public boolean isUpdatable();
    public void setUpdatable(boolean updatable);
    
    public boolean isDuplicatable();
    public void setDuplicatable(boolean duplicatable);
    
    public boolean isHidden();
    public void setHidden(boolean hidden);
    
    public boolean isUnique();
    public void setUnique(boolean unique);
}
