package mtcls.common.model.dto;

import mtcls.common.model.AppProperty;

public class AppPropertyDto implements AppProperty{
	protected long id;
	protected String name;
	protected String label;
	protected Integer sequence;
	protected String groupName;
	protected String groupLabel;
	protected Integer sortPriority;
	protected String dataType;
	protected String displayType;
	protected String daoPropertyName;
	protected Object value;
    protected String saveParameterType;
    protected Integer width;
    protected Double minValue;
    protected Double maxValue;
    protected String regexPattern;
    protected String addDefaultValue;
    protected String editDefaultValue;
    protected String searchDefaultValue;
    protected String lookupName;
    protected String lookupPair;
    protected String lookupServiceName;
    protected Integer decimalPrecision;
    protected boolean sortDesc;    
	protected boolean key;
	protected boolean lookup;
	protected boolean required;
	protected boolean searchable;
	protected boolean searchRange;
	protected boolean searchParticipate;
	protected boolean searchShowOnEmpty;
	protected boolean listable;
	protected boolean detailable;
	protected boolean advancedSearch;
	protected boolean editable;
    protected boolean editableOnAdd;
    protected boolean editableOnSearch;
    protected boolean updatable;
    protected boolean duplicatable;
    protected boolean hidden;
    protected boolean unique;
    
    public AppPropertyDto(){
    	
    }
	/**
	 * @param id
	 * @param name
	 * @param label
	 * @param sequence
	 * @param groupName
	 * @param groupLabel
	 * @param sortPriority
	 * @param dataType
	 * @param displayType
	 * @param daoPropertyName
	 * @param value
	 * @param saveParameterType
	 * @param width
	 * @param minValue
	 * @param maxValue
	 * @param regexPattern
	 * @param addDefaultValue
	 * @param editDefaultValue
	 * @param searchDefaultValue
	 * @param lookupName
	 * @param lookupPair
	 * @param lookupServiceName
	 * @param decimalPrecision
	 * @param sortDesc
	 * @param key
	 * @param lookup
	 * @param required
	 * @param searchable
	 * @param searchRange
	 * @param searchParticipate
	 * @param searchShowOnEmpty
	 * @param listable
	 * @param detailable
	 * @param advancedSearch
	 * @param editable
	 * @param editableOnAdd
	 * @param editableOnSearch
	 * @param updatable
	 * @param duplicatable
	 * @param hidden
	 * @param unique
	 */
	public AppPropertyDto(long id, String name, String label, Integer sequence,
			String groupName, String groupLabel, Integer sortPriority,
			String dataType, String displayType, String daoPropertyName,
			Object value, String saveParameterType, Integer width,
			Double minValue, Double maxValue, String regexPattern,
			String addDefaultValue, String editDefaultValue,
			String searchDefaultValue, String lookupName, String lookupPair,
			String lookupServiceName, Integer decimalPrecision,
			boolean sortDesc, boolean key, boolean lookup, boolean required,
			boolean searchable, boolean searchRange, boolean searchParticipate,
			boolean searchShowOnEmpty, boolean listable, boolean detailable,
			boolean advancedSearch, boolean editable, boolean editableOnAdd,
			boolean editableOnSearch, boolean updatable, boolean duplicatable,
			boolean hidden, boolean unique) {
		super();
		setId(id);
		setName(name);
		setLabel(label);
		setSequence(sequence);
		setGroupName(groupName);
		setGroupLabel(groupLabel);
		setSortPriority(sortPriority);
		setDataType(dataType);
		setDisplayType(displayType);
		setDaoPropertyName(daoPropertyName);
		setValue(value);
		setSaveParameterType(saveParameterType);
		setWidth(width);
		setMinValue(minValue);
		setMaxValue(maxValue);
		setRegexPattern(regexPattern);
		setAddDefaultValue(addDefaultValue);
		setEditDefaultValue(editDefaultValue);
		setSearchDefaultValue(searchDefaultValue);
		setLookupName(lookupName);
		setLookupPair(lookupPair);
		setLookupServiceName(lookupServiceName);
		setDecimalPrecision(decimalPrecision);
		setSortDesc(sortDesc);
		setKey(key);
		setLookup(lookup);
		setRequired(required);
		setSearchable(searchable);
		setSearchRange(searchRange);
		setSearchParticipate(searchParticipate);
		setSearchShowOnEmpty(searchShowOnEmpty);
		setListable(listable);
		setDetailable(detailable);
		setAdvancedSearch(advancedSearch);
		setEditable(editable);
		setEditableOnAdd(editableOnAdd);
		setEditableOnSearch(editableOnSearch);
		setUpdatable(updatable);
		setDuplicatable(duplicatable);
		setHidden(hidden);
		setUnique(unique);
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
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
	public Integer getSortPriority() {
		return sortPriority;
	}
	public void setSortPriority(Integer sortPriority) {
		this.sortPriority = sortPriority;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getDaoPropertyName() {
		return daoPropertyName;
	}
	public void setDaoPropertyName(String daoPropertyName) {
		this.daoPropertyName = daoPropertyName;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getSaveParameterType() {
		return saveParameterType;
	}
	public void setSaveParameterType(String saveParameterType) {
		this.saveParameterType = saveParameterType;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Double getMinValue() {
		return minValue;
	}
	public void setMinValue(Double minValue) {
		this.minValue = minValue;
	}
	public Double getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(Double maxValue) {
		this.maxValue = maxValue;
	}
	public String getRegexPattern() {
		return regexPattern;
	}
	public void setRegexPattern(String regexPattern) {
		this.regexPattern = regexPattern;
	}
	public String getAddDefaultValue() {
		return addDefaultValue;
	}
	public void setAddDefaultValue(String addDefaultValue) {
		this.addDefaultValue = addDefaultValue;
	}
	public String getEditDefaultValue() {
		return editDefaultValue;
	}
	public void setEditDefaultValue(String editDefaultValue) {
		this.editDefaultValue = editDefaultValue;
	}
	public String getSearchDefaultValue() {
		return searchDefaultValue;
	}
	public void setSearchDefaultValue(String searchDefaultValue) {
		this.searchDefaultValue = searchDefaultValue;
	}
	public String getLookupName() {
		return lookupName;
	}
	public void setLookupName(String lookupName) {
		this.lookupName = lookupName;
	}
	public String getLookupPair() {
		return lookupPair;
	}
	public void setLookupPair(String lookupPair) {
		this.lookupPair = lookupPair;
	}
	public String getLookupServiceName() {
		return lookupServiceName;
	}
	public void setLookupServiceName(String lookupServiceName) {
		this.lookupServiceName = lookupServiceName;
	}
	public Integer getDecimalPrecision() {
		return decimalPrecision;
	}
	public void setDecimalPrecision(Integer decimalPrecision) {
		this.decimalPrecision = decimalPrecision;
	}
	public boolean isSortDesc() {
		return sortDesc;
	}
	public void setSortDesc(boolean sortDesc) {
		this.sortDesc = sortDesc;
	}
	public boolean isKey() {
		return key;
	}
	public void setKey(boolean key) {
		this.key = key;
	}
	public boolean isLookup() {
		return lookup;
	}
	public void setLookup(boolean lookup) {
		this.lookup = lookup;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public boolean isSearchable() {
		return searchable;
	}
	public void setSearchable(boolean searchable) {
		this.searchable = searchable;
	}
	public boolean isSearchRange() {
		return searchRange;
	}
	public void setSearchRange(boolean searchRange) {
		this.searchRange = searchRange;
	}
	public boolean isSearchParticipate() {
		return searchParticipate;
	}
	public void setSearchParticipate(boolean searchParticipate) {
		this.searchParticipate = searchParticipate;
	}
	public boolean isSearchShowOnEmpty() {
		return searchShowOnEmpty;
	}
	public void setSearchShowOnEmpty(boolean searchShowOnEmpty) {
		this.searchShowOnEmpty = searchShowOnEmpty;
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
	public boolean isAdvancedSearch() {
		return advancedSearch;
	}
	public void setAdvancedSearch(boolean advancedSearch) {
		this.advancedSearch = advancedSearch;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public boolean isEditableOnAdd() {
		return editableOnAdd;
	}
	public void setEditableOnAdd(boolean editableOnAdd) {
		this.editableOnAdd = editableOnAdd;
	}
	public boolean isEditableOnSearch() {
		return editableOnSearch;
	}
	public void setEditableOnSearch(boolean editableOnSearch) {
		this.editableOnSearch = editableOnSearch;
	}
	public boolean isUpdatable() {
		return updatable;
	}
	public void setUpdatable(boolean updatable) {
		this.updatable = updatable;
	}
	public boolean isDuplicatable() {
		return duplicatable;
	}
	public void setDuplicatable(boolean duplicatable) {
		this.duplicatable = duplicatable;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	public boolean isUnique() {
		return unique;
	}
	public void setUnique(boolean unique) {
		this.unique = unique;
	}	

}
