package mtcls.common.model.app;

public enum DataTypeEnum {
	STRING("String"), 
	NUMBER("Number"), 
	FLOAT("Float"), 
	DATE("Date"), 
	TIMESTAMP("Timestamp");
	protected String typeName;
	DataTypeEnum(String dataTypeName){
		setTypeName(dataTypeName);
	}
	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}
	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String asString(){
		return getTypeName();
	}
	
	public static DataTypeEnum fromString(String typeName){
		DataTypeEnum retval = null;
		if(typeName == null || "".equals(typeName)){
			return retval;
		}
		DataTypeEnum [] values = DataTypeEnum.values();
		for (DataTypeEnum dataTypeEnum : values) {
			if(dataTypeEnum.getTypeName().equalsIgnoreCase(typeName)){
				retval = dataTypeEnum;
				return retval;
			}
		}
		return retval;
	}
	
}
