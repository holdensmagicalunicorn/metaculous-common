package mtcls.common.model.app;

public enum FormModeEnum {
	SEARCH("search"), SEARCH_ADVANCED("search_advanced"), EDIT("edit");
	
	protected String mode;
	FormModeEnum(String formMode){
		setMode(formMode);
	}
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}	
}
