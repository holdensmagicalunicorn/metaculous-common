package mtcls.common.model.app;

public enum ServiceActionEnum {
	FETCH("fetch"), SUBMIT("submit");
	
	protected String name;
	ServiceActionEnum(String actionName){
		setName(actionName);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
