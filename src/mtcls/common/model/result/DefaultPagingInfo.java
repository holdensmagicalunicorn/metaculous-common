package mtcls.common.model.result;

import java.io.Serializable;

import mtcls.common.model.PagingInfo;

@SuppressWarnings("serial")
public class DefaultPagingInfo implements PagingInfo, Serializable {
	protected Long pageSize;
	protected Long offset;
	protected Long totalSize;
	public DefaultPagingInfo(){
		this(null, null, null);
	}
	
	public DefaultPagingInfo(Long pageSize, Long offset, Long totalSize){
		setPageSize(pageSize);
		setOffset(offset);
		setTotalSize(totalSize);
	}
	/**
	 * @return the pageSize
	 */
	public Long getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return the offset
	 */
	public Long getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(Long offset) {
		this.offset = offset;
	}
	/**
	 * @return the totalSize
	 */
	public Long getTotalSize() {
		return totalSize;
	}
	/**
	 * @param totalSize the totalSize to set
	 */
	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
}
