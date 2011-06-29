package mtcls.common.model.type;

import java.io.Serializable;


@SuppressWarnings("serial")
public class NamedType extends IdentifiableType implements HasIdAndName, Serializable {
	private String name;

	public NamedType() {
		super();
	}

	public NamedType(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object other) {
		boolean retval = false;
		if (other == null) {
			return retval;
		}
		retval = super.equals(other);
		if (retval && other instanceof NamedType) {
			NamedType obj = (NamedType) other;
			if (obj.getName() == null && name == null) {
				return retval;
			}
			retval = obj.getName().equalsIgnoreCase(name);
		}
		return retval;
	}
	
	public boolean equals(NamedType other){
		return equals(other);
	}
	
	public boolean equals(HasIdAndName other){
		return equals((NamedType)other);
	}
}
