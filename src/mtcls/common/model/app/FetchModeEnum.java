package mtcls.common.model.app;

public enum FetchModeEnum {
	LIST("list"), 
	VIEW("view");
	protected String mode;
	FetchModeEnum(String modeName){
		setMode(modeName);
	}
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}	
}
