package mtcls.common.model;

import java.io.Serializable;

public interface PagingInfo extends Serializable {
	public Long getPageSize();
	public Long getOffset();
	public Long getTotalSize();
	
}
