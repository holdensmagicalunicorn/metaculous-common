package mtcls.common.helper;

import java.util.List;

import mtcls.common.model.AppModule;
import mtcls.common.model.AppNamespace;
import mtcls.common.model.AppProperty;
import mtcls.common.model.app.DataTypeEnum;
import mtcls.common.model.dto.AppModuleDto;
import mtcls.common.model.dto.AppNamespaceDto;
import mtcls.common.model.dto.AppPropertyDto;

public class MetadataHelper {
	public static final long 	ID_UNDEFINED = -1;
	public static final String 	AM_LABEL_DEFAULT = ""; 
	public static final String 	AM_GROUP_NAME_DEFAULT = ""; 
	public static final String 	AM_GROUP_LABEL_DEFAULT = "";
	public static final String 	AM_REPOSITORY_DEFAULT = "RepositoryWidget"; 
	public static final String 	AM_MODULE_WIDGET_DEFAULT = "ModuleWidget"; 
	public static final String 	AM_SEARCH_WIDGET_DEFAULT = "SearchWidget";
	public static final String 	AM_LIST_WIDGET_DEFAULT = "ListWidget"; 
	public static final String 	AM_DETAIL_WIDGET_DEFAULT = "DetailWidget"; 
	public static final boolean AM_EDITABLE_DEFAULT = true;
	public static final boolean AM_UPDATABLE_DEFAULT = true; 
	public static final boolean AM_CREATEABLE_DEFAULT = true; 
	public static final boolean AM_DUPLICATABLE_DEFAULT = true;
	public static final boolean AM_REMOVABLE_DEFAULT = true; 
	public static final boolean AM_AUDITABLE_DEFAULT = true; 
	public static final boolean AM_NAVIGATABLE_DEFAULT = true;
	public static final boolean AM_SEARCHABLE_DEFAULT = true; 
	public static final boolean AM_ADVANCED_SEARCHABLE_DEFAULT = true; 
	public static final boolean AM_LISTABLE_DEFAULT = true;
	public static final boolean AM_DETAILABLE_DEFAULT = true; 
	public static final String 	AP_GROUP_NAME_DEFAULT = ""; 
	public static final String 	AP_GROUP_LABEL_DEFAULT = ""; 
	public static final Object 	AP_VALUE_DEFAULT = null; 
	public static final String 	AP_SAVE_PARAMETERTYPE_DEFAULT = null;
	public static final Integer AP_WIDTH_DEFAULT = Integer.valueOf(50);
	public static final Double 	AP_MIN_VALUE_DEFAULT = null; 
	public static final Double 	AP_MAX_VALUE_DEFAULT = null; 
	public static final String 	AP_REGEX_PATTERN_DEFAULT = null;
	public static final String 	AP_ADD_DEFAULT_VALUE_DEFAULT = null; 
	public static final String 	AP_EDIT_DEFAULT_VALUE_DEFAULT = null;
	public static final String 	AP_SEARCH_DEFAULT_VALUE_DEFAULT = null; 
	public static final String 	AP_LOOKUP_NAME_DEFAULT = null; 
	public static final String 	AP_LOOKUP_PAIR_DEFAULT = null;
	public static final String 	AP_LOOKUP_SERVICE_NAME_DEFAULT = null; 
	public static final Integer	AP_DECIMAL_PRECISION_DEFAULT = null;
	public static final boolean AP_SORT_DESC_DEFAULT = false; 
	public static final boolean AP_KEY_DEFAULT = false; 
	public static final boolean AP_LOOKUP_DEFAULT = false; 
	public static final boolean AP_REQUIRED_DEFAULT = false;
	public static final boolean AP_SEARCHABLE_DEFAULT = false; 
	public static final boolean AP_SEARCH_RANGE_DEFAULT = false; 
	public static final boolean AP_SEARCH_PARTICIPATE_DEFAULT = true;
	public static final boolean AP_SEARCH_SHOW_ON_EMPTY_DEFAULT = true; 
	public static final boolean AP_LISTABLE_DEFAULT = true; 
	public static final boolean AP_DETAILABLE_DEFAULT = true;
	public static final boolean AP_ADVANCED_SEARCH_DEFAULT = true; 
	public static final boolean AP_EDITABLE_DEFAULT = true; 
	public static final boolean AP_EDITABLE_ON_ADD_DEFAULT = true;
	public static final boolean AP_EDITABLE_ON_SEARCH_DEFAULT = true; 
	public static final boolean AP_UPDATABLE_DEFAULT = true; 
	public static final boolean AP_DUPLICATABLE_DEFAULT = true;
	public static final boolean AP_HIDDEN_DEFAULT = false; 
	public static final boolean AP_UNIQUE_DEFAULT = false;
	
	public static AppNamespace createAppNamespace(String name){
		return new AppNamespaceDto(ID_UNDEFINED, name);
	}
	public static AppModule createAppModule(AppModule parentModule, 
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
							List<AppProperty> properties){
		return new AppModuleDto(ID_UNDEFINED, 
								parentModule, 
								appNamespace, 
								name, 
								label, 
								groupName, 
								groupLabel, 
								repository, 
								moduleWidget, 
								searchWidget, 
								listWidget, 
								detailWidget, 
								editable, 
								updatable, 
								createable, 
								duplicatable, 
								removable, 
								auditable, 
								navigatable, 
								searchable, 
								advancedSearchable, 
								listable, 
								detailable, 
								childModules, 
								properties);
	}
	
	public static AppModule createDefaultModule(String namespace, String name){
		AppNamespace ns = createAppNamespace(namespace);
		return createDefaultModule(null, ns, name, AM_REPOSITORY_DEFAULT, AM_LABEL_DEFAULT, AM_GROUP_NAME_DEFAULT, AM_GROUP_LABEL_DEFAULT, null, null);
	}
	
	public static AppModule createDefaultModule(AppModule parentModule, 
							AppNamespace appNamespace, 
							String name,
							String label, 
							String groupName, 
							String groupLabel,
							String repository, 
							List<AppModule> childModules,
							List<AppProperty> properties){
		return createAppModule(parentModule, 
							appNamespace, 
							name, 
							label, 
							groupName, 
							groupLabel, 
							repository, 
							AM_MODULE_WIDGET_DEFAULT, 
							AM_SEARCH_WIDGET_DEFAULT, 
							AM_LIST_WIDGET_DEFAULT, 
							AM_DETAIL_WIDGET_DEFAULT, 
							AM_EDITABLE_DEFAULT, 
							AM_UPDATABLE_DEFAULT, 
							AM_CREATEABLE_DEFAULT, 
							AM_DUPLICATABLE_DEFAULT, 
							AM_REMOVABLE_DEFAULT, 
							AM_AUDITABLE_DEFAULT, 
							AM_NAVIGATABLE_DEFAULT, 
							AM_SEARCHABLE_DEFAULT, 
							AM_ADVANCED_SEARCHABLE_DEFAULT, 
							AM_LISTABLE_DEFAULT, 
							AM_DETAILABLE_DEFAULT, 
							childModules, 
							properties);
	}
	
	public static AppProperty createAppProperty(String name, 
								String label, 
								Integer sequence,
								String groupName, 
								String groupLabel, 
								Integer sortPriority,
								String dataType, 
								String displayType, 
								String daoPropertyName,
								Object value, 
								String saveParameterType, 
								Integer width,
								Double minValue, 
								Double maxValue, 
								String regexPattern,
								String addDefaultValue, 
								String editDefaultValue,
								String searchDefaultValue, 
								String lookupName, 
								String lookupPair,
								String lookupServiceName, 
								Integer decimalPrecision,
								boolean sortDesc, 
								boolean key, 
								boolean lookup, 
								boolean required,
								boolean searchable, 
								boolean searchRange, 
								boolean searchParticipate,
								boolean searchShowOnEmpty, 
								boolean listable, 
								boolean detailable,
								boolean advancedSearch, 
								boolean editable, 
								boolean editableOnAdd,
								boolean editableOnSearch, 
								boolean updatable, 
								boolean duplicatable,
								boolean hidden, 
								boolean unique){
		AppPropertyDto retval = new AppPropertyDto();
		retval.setId(ID_UNDEFINED);
		retval.setName(name);
		retval.setLabel(label); 
		retval.setSequence(sequence);
		retval.setGroupName(groupName); 
		retval.setGroupLabel(groupLabel); 
		retval.setSortPriority(sortPriority); 
		retval.setDataType(dataType); 
		retval.setDisplayType(displayType); 
		retval.setDaoPropertyName(daoPropertyName); 
		retval.setValue(value); 
		retval.setSaveParameterType(saveParameterType); 
		retval.setWidth(width); 
		retval.setMinValue(minValue); 
		retval.setMaxValue(maxValue); 
		retval.setRegexPattern(regexPattern); 
		retval.setAddDefaultValue(addDefaultValue); 
		retval.setEditDefaultValue(editDefaultValue); 
		retval.setSearchDefaultValue(searchDefaultValue); 
		retval.setLookupName(lookupName); 
		retval.setLookupPair(lookupPair); 
		retval.setLookupServiceName(lookupServiceName); 
		retval.setDecimalPrecision(decimalPrecision); 
		retval.setSortDesc(sortDesc); 
		retval.setKey(key); 
		retval.setLookup(lookup); 
		retval.setRequired(required); 
		retval.setSearchable(searchable); 
		retval.setSearchRange(searchRange); 
		retval.setSearchParticipate(searchParticipate); 
		retval.setSearchShowOnEmpty(searchShowOnEmpty); 
		retval.setListable(listable); 
		retval.setDetailable(detailable); 
		retval.setAdvancedSearch(advancedSearch); 
		retval.setEditable(editable); 
		retval.setEditableOnAdd(editableOnAdd); 
		retval.setEditableOnSearch(editableOnSearch); 
		retval.setUpdatable(updatable); 
		retval.setDuplicatable(duplicatable); 
		retval.setHidden(hidden); 
		retval.setUnique(unique);
		return retval;
	}
	
	public static AppProperty createDefaultAppProperty(String name, 
			String label, 
			Integer sequence,
			String groupName, 
			String groupLabel, 
			Integer sortPriority,
			String dataType, 
			String displayType, 
			String daoPropertyName, 
			Integer width,
			Double minValue, 
			Double maxValue, 
			String regexPattern,
			String addDefaultValue, 
			String editDefaultValue,
			String searchDefaultValue, 
			String lookupName, 
			String lookupPair,
			String lookupServiceName, 
			Integer decimalPrecision,
			boolean sortDesc, 
			boolean key, 
			boolean lookup, 
			boolean required,
			boolean searchable, 
			boolean searchRange, 
			boolean isListable, 
			boolean advancedSearch, 
			boolean hidden, 
			boolean unique){
//		return new AppPropertyDto(ID_UNDEFINED,
		return createAppProperty(
				name, 	
				label, 
				sequence, 
				groupName, 
				groupLabel, 
				sortPriority, 
				dataType, 
				displayType, 
				daoPropertyName, 
				AP_VALUE_DEFAULT, 
				AP_SAVE_PARAMETERTYPE_DEFAULT,
				width, 
				minValue, 
				maxValue, 
				regexPattern, 
				addDefaultValue, 
				editDefaultValue, 
				searchDefaultValue, 
				lookupName, 
				lookupPair, 
				lookupServiceName, 
				decimalPrecision, 
				sortDesc, 
				key, 
				lookup, 
				required, 
				searchable, 
				searchRange, 
				AP_SEARCH_PARTICIPATE_DEFAULT, 
				AP_SEARCH_SHOW_ON_EMPTY_DEFAULT, 
				isListable, 
				AP_DETAILABLE_DEFAULT, 
				advancedSearch, 
				AP_EDITABLE_DEFAULT, 
				AP_EDITABLE_ON_ADD_DEFAULT, 
				AP_EDITABLE_ON_SEARCH_DEFAULT, 
				AP_UPDATABLE_DEFAULT, 
				AP_DUPLICATABLE_DEFAULT, 
				hidden, 
				unique);
	}
	public static AppProperty createDefaultHiddenStringProperty(String name, 
			String label, 
			Integer sequence,
			String groupName, 
			String groupLabel, 
			Integer sortPriority, 
			String daoPropertyName,
			Integer width,
			String regexPattern,
			String addDefaultValue, 
			String editDefaultValue,
			String searchDefaultValue, 
			boolean sortDesc, 
			boolean key, 
			boolean required, 
			boolean listable, 
			boolean advancedSearch, 
			boolean unique){	
		return createDefaultStringProperty(name, label, sequence, groupName, groupLabel, sortPriority, daoPropertyName, width, regexPattern, addDefaultValue, editDefaultValue, searchDefaultValue, sortDesc, key, required, listable, advancedSearch, true, unique);
	}
	public static AppProperty createDefaultStringProperty(String name, 
			String label, 
			Integer sequence,
			String groupName, 
			String groupLabel, 
			Integer sortPriority, 
			String daoPropertyName,
			Integer width,
			String regexPattern,
			String addDefaultValue, 
			String editDefaultValue,
			String searchDefaultValue, 
			boolean sortDesc, 
			boolean key, 
			boolean required, 
			boolean advancedSearch, 
			boolean unique){
		return createDefaultStringProperty(name, label, sequence, groupName, groupLabel, sortPriority, daoPropertyName, width, regexPattern, addDefaultValue, editDefaultValue, searchDefaultValue, sortDesc, key, required, AP_LISTABLE_DEFAULT, advancedSearch, AP_HIDDEN_DEFAULT, unique);
	}
	public static AppProperty createDefaultStringProperty(String name, 
			String label, 
			Integer sequence,
			String groupName, 
			String groupLabel, 
			Integer sortPriority, 
			String daoPropertyName,
			Integer width,
			String regexPattern,
			String addDefaultValue, 
			String editDefaultValue,
			String searchDefaultValue, 
			boolean sortDesc, 
			boolean key, 
			boolean required, 
			boolean listable, 
			boolean advancedSearch, 
			boolean unique){
		return createDefaultStringProperty(name, label, sequence, groupName, groupLabel, sortPriority, daoPropertyName, width, regexPattern, addDefaultValue, editDefaultValue, searchDefaultValue, sortDesc, key, required, listable, advancedSearch, AP_HIDDEN_DEFAULT, unique);
	}
	public static AppProperty createDefaultStringProperty(String name, 
								String label, 
								Integer sequence,
								String groupName, 
								String groupLabel, 
								Integer sortPriority, 
								String daoPropertyName,
								Integer width,
								String regexPattern,
								String addDefaultValue, 
								String editDefaultValue,
								String searchDefaultValue, 
								boolean sortDesc, 
								boolean key, 
								boolean required, 
								boolean listable, 
								boolean advancedSearch, 
								boolean hidden, 
								boolean unique){
		if(width==null || width.intValue()<=0){
			width = Integer.valueOf(50);
		}
		return createDefaultAppProperty(name, 
				label, 
				sequence,
				groupName, 
				groupLabel, 
				sortPriority,
				DataTypeEnum.STRING.asString(), 
				"Text", 
				daoPropertyName,
				width,
				AP_MIN_VALUE_DEFAULT, 
				AP_MAX_VALUE_DEFAULT, 
				regexPattern,
				addDefaultValue, 
				editDefaultValue,
				searchDefaultValue, 
				AP_LOOKUP_NAME_DEFAULT, 
				AP_LOOKUP_PAIR_DEFAULT, 
				AP_LOOKUP_SERVICE_NAME_DEFAULT, 
				AP_DECIMAL_PRECISION_DEFAULT, 
				sortDesc, 
				key, 
				false, 
				required,
				true, 
				false, 
				listable, 
				advancedSearch, 
				hidden, 
				unique);
	}
	
	public static AppProperty createDefaultHiddenDateProperty(String name, 
			String label, 
			Integer sequence,
			String groupName, 
			String groupLabel, 
			Integer sortPriority, 
			String daoPropertyName,
			Integer width, 
			String regexPattern,
			String addDefaultValue, 
			String editDefaultValue,
			String searchDefaultValue, 
			boolean sortDesc, 
			boolean key, 
			boolean required,
			boolean searchRange, 
			boolean advancedSearch, 
			boolean unique){
		return createDefaultDateProperty(name, label, sequence, groupName, groupLabel, sortPriority, daoPropertyName, width, regexPattern, addDefaultValue, editDefaultValue, searchDefaultValue, sortDesc, key, required, searchRange, advancedSearch, unique, AP_LISTABLE_DEFAULT, true);
	}
	public static AppProperty createDefaultDateProperty(String name, 
			String label, 
			Integer sequence,
			String groupName, 
			String groupLabel, 
			Integer sortPriority, 
			String daoPropertyName,
			Integer width, 
			String regexPattern,
			String addDefaultValue, 
			String editDefaultValue,
			String searchDefaultValue, 
			boolean sortDesc, 
			boolean key, 
			boolean required,
			boolean searchRange, 
			boolean advancedSearch, 
			boolean unique){
		return createDefaultDateProperty(name, label, sequence, groupName, groupLabel, sortPriority, daoPropertyName, width, regexPattern, addDefaultValue, editDefaultValue, searchDefaultValue, sortDesc, key, required, searchRange, advancedSearch, unique, AP_LISTABLE_DEFAULT, AP_HIDDEN_DEFAULT);
	}
	public static AppProperty createDefaultDateProperty(String name, 
			String label, 
			Integer sequence,
			String groupName, 
			String groupLabel, 
			Integer sortPriority, 
			String daoPropertyName,
			Integer width, 
			String regexPattern,
			String addDefaultValue, 
			String editDefaultValue,
			String searchDefaultValue, 
			boolean sortDesc, 
			boolean key, 
			boolean required,
			boolean searchRange, 
			boolean advancedSearch, 
			boolean unique, 
			boolean listable, 
			boolean hidden){
		width = (width==null && regexPattern!=null) ? Integer.valueOf(regexPattern.length()) : null;
		return createDefaultAppProperty(name, 
				label, 
				sequence,
				groupName, 
				groupLabel, 
				sortPriority,
				DataTypeEnum.DATE.asString(), 
				"Date", 
				daoPropertyName,
				width,
				AP_MIN_VALUE_DEFAULT, 
				AP_MAX_VALUE_DEFAULT, 
				regexPattern,
				addDefaultValue, 
				editDefaultValue,
				searchDefaultValue, 
				AP_LOOKUP_NAME_DEFAULT, 
				AP_LOOKUP_PAIR_DEFAULT, 
				AP_LOOKUP_SERVICE_NAME_DEFAULT, 
				AP_DECIMAL_PRECISION_DEFAULT, 
				sortDesc, 
				key, 
				false, 
				required,
				true, 
				searchRange, 
				listable, 
				advancedSearch, 
				hidden, 
				unique);
	}
	public static AppProperty createDefaultIdProperty(String name){
		return createDefaultIdProperty(name, name, null);
	}
	
	public static AppProperty createDefaultIdProperty(String name, String daoPropertyName, Integer sequence){
		AppProperty retval = createDefaultRealNumberProperty(name, 
				name, 
				sequence, 
				AP_GROUP_NAME_DEFAULT, 
				AP_GROUP_LABEL_DEFAULT, 
				null, 
				daoPropertyName, 
				AP_WIDTH_DEFAULT, 
				AP_MIN_VALUE_DEFAULT, 
				AP_MAX_VALUE_DEFAULT, 
				AP_REGEX_PATTERN_DEFAULT, 
				AP_ADD_DEFAULT_VALUE_DEFAULT, 
				AP_EDIT_DEFAULT_VALUE_DEFAULT, 
				AP_SEARCH_DEFAULT_VALUE_DEFAULT, 
				AP_SORT_DESC_DEFAULT, 
				true, 
				true, 
				true, 
				AP_SEARCH_RANGE_DEFAULT, 
				AP_LISTABLE_DEFAULT, 
				true, 
				true);
		AppPropertyDto dto = (AppPropertyDto)retval;
		dto.setHidden(true);
		retval = dto;
		return retval;
	}
	public static AppProperty createDefaultRealNumberProperty(String name, 
			String label, 
			Integer sequence,
			String groupName, 
			String groupLabel, 
			Integer sortPriority, 
			String daoPropertyName, 
			Integer width,
			Double minValue, 
			Double maxValue, 
			String regexPattern,
			String addDefaultValue, 
			String editDefaultValue,
			String searchDefaultValue, 
			boolean sortDesc, 
			boolean key, 
			boolean required,
			boolean searchable, 
			boolean searchRange, 
			boolean listable, 
			boolean advancedSearch, 
			boolean unique){
		return createDefaultAppProperty(name, 
				label, 
				sequence,
				groupName, 
				groupLabel, 
				sortPriority,
				DataTypeEnum.NUMBER.asString(), 
				"Text", 
				daoPropertyName,
				width,
				minValue, 
				maxValue, 
				regexPattern,
				addDefaultValue, 
				editDefaultValue,
				searchDefaultValue,  
				AP_LOOKUP_NAME_DEFAULT, 
				AP_LOOKUP_PAIR_DEFAULT, 
				AP_LOOKUP_SERVICE_NAME_DEFAULT, 
				AP_DECIMAL_PRECISION_DEFAULT, 
				sortDesc, 
				key, 
				false, 
				required,
				searchable, 
				searchRange, 
				listable, 
				advancedSearch, 
				false, 
				unique);
	}
	
	public static AppProperty createDefaultFloatNumberProperty(String name, 
			String label, 
			Integer sequence,
			String groupName, 
			String groupLabel, 
			Integer sortPriority,
			String daoPropertyName,
			Double minValue, 
			Double maxValue, 
			String regexPattern,
			String addDefaultValue, 
			String editDefaultValue,
			String searchDefaultValue, 
			Integer decimalPrecision,
			boolean sortDesc, 
			boolean key, 
			boolean required,
			boolean searchable, 
			boolean searchRange, 
			boolean isListable, 
			boolean advancedSearch, 
			boolean unique){
		return createDefaultAppProperty(name, 
				label, 
				sequence,
				groupName, 
				groupLabel, 
				sortPriority,
				DataTypeEnum.FLOAT.asString(), 
				"Text", 
				daoPropertyName,
				null,
				minValue, 
				maxValue, 
				regexPattern,
				addDefaultValue, 
				editDefaultValue,
				searchDefaultValue, 
				AP_LOOKUP_NAME_DEFAULT, 
				AP_LOOKUP_PAIR_DEFAULT, 
				AP_LOOKUP_SERVICE_NAME_DEFAULT, 
				decimalPrecision,
				sortDesc, 
				key, 
				false, 
				required,
				searchable, 
				searchRange, 
				isListable, 
				advancedSearch, 
				false, 
				unique);
	}
	
	public static AppProperty createDefaultLookupProperty(String name, 
			String label, 
			Integer sequence,
			String groupName, 
			String groupLabel, 
			Integer sortPriority,
			String dataType, 
			String displayType, 
			String daoPropertyName,
			Object value, 
			String saveParameterType, 
			Integer width,
			Double minValue, 
			Double maxValue, 
			String addDefaultValue, 
			String editDefaultValue,
			String searchDefaultValue, 
			String lookupName, 
			String lookupPair,
			String lookupServiceName, 
			boolean sortDesc, 
			boolean key, 
			boolean required,
			boolean searchable, 
			boolean searchParticipate,
			boolean searchShowOnEmpty, 
			boolean listable, 
			boolean detailable,
			boolean advancedSearch, 
			boolean editable, 
			boolean editableOnAdd,
			boolean editableOnSearch, 
			boolean updatable, 
			boolean duplicatable,
			boolean unique){
		return createDefaultAppProperty(name, 
				label, 
				sequence,
				groupName, 
				groupLabel, 
				sortPriority,
				dataType, 
				displayType, 
				daoPropertyName,
				width,
				minValue, 
				maxValue, 
				null,
				addDefaultValue, 
				editDefaultValue,
				searchDefaultValue, 
				lookupName, 
				lookupPair,
				lookupServiceName,
				AP_DECIMAL_PRECISION_DEFAULT, 
				sortDesc, 
				key, 
				true, 
				required,
				searchable, 
				false, 
				listable, 
				advancedSearch, 
				false, 
				unique);
	}
}
