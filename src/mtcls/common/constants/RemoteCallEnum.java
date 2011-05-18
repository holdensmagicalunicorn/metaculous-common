package mtcls.common.constants;

public enum RemoteCallEnum {
	AuthExpired("auth_expired");
	private final String name;

	private RemoteCallEnum(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}
