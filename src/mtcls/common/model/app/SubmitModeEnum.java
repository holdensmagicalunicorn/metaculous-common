package mtcls.common.model.app;

public enum SubmitModeEnum {
	NEW("new"), 
	EDIT("edit"), 
	DELETE("delete");
	protected String mode;
	SubmitModeEnum(String modeName){
		setMode(modeName);
	}
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}	
}
