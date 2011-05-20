package mtcls.common.model;

import java.io.Serializable;
import java.util.List;

public interface RemoteCallResult extends Serializable {
	public List<Serializable> getResult();
	public List<PropertyMessage> getMessages();
	public List<Throwable> getErrors();
	public PagingInfo getPagingInfo();
}
