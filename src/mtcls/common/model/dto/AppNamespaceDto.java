package mtcls.common.model.dto;

import mtcls.common.model.AppNamespace;

public class AppNamespaceDto implements AppNamespace{
	protected long id;
	protected String name;
	public AppNamespaceDto(long id, String name){
		setId(id);
		setName(name);
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
}
