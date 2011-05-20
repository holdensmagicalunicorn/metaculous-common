package mtcls.common.model;

public interface AppProperty {
	public long getId();
	public String getName();
	public String getLabel();
	public Integer getSequence();
	public String getGroupName();
	public String getGroupLabel();
	public Integer getSortPriority();
	public String getDataType();
	public String getDisplayType();
	public String getDaoPropertyName();
	public Object getValue();
    public String getSaveParameterType();
    public Integer getWidth();
    public Double getMinValue();
    public Double getMaxValue();
    public String getRegexPattern();
    public String getAddDefaultValue();
    public String getEditDefaultValue();
    public String getSearchDefaultValue();
    public String getLookupName();
    public String getLookupPair();
    public String getLookupServiceName();
    public Integer getDecimalPrecision();
    public boolean isSortDesc();    
	public boolean isKey();
	public boolean isLookup();
	public boolean isRequired();
	public boolean isSearchable();
	public boolean isSearchRange();
	public boolean isSearchParticipate();
	public boolean isSearchShowOnEmpty();
	public boolean isListable();
	public boolean isDetailable();
	public boolean isAdvancedSearch();
	public boolean isEditable();
    public boolean isEditableOnAdd();
    public boolean isEditableOnSearch();
    public boolean isUpdatable();
    public boolean isDuplicatable();
    public boolean isHidden();
    public boolean isUnique();

}
