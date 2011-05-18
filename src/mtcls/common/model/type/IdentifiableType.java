package mtcls.common.model.type;

import java.io.Serializable;

@SuppressWarnings("serial")
public class IdentifiableType implements HasIdentifier, Serializable {
	private static int count = 0;
	final String id;

	protected IdentifiableType() {
		id = String.valueOf(count++);
	}

	public String getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object other) {
		boolean retval = false;
		if (other == null) {
			return retval;
		}
		if (other instanceof IdentifiableType) {
			IdentifiableType obj = (IdentifiableType) other;
			retval = obj.getId().equals(id);
		}
		return retval;
	}
}
