package mtcls.common.model.result;

import java.io.Serializable;
import java.util.List;

import mtcls.common.model.PagingInfo;
import mtcls.common.model.PropertyMessage;
import mtcls.common.model.RemoteCallResult;

@SuppressWarnings("serial")
public class DefaultRemoteCallResult implements RemoteCallResult, Serializable{
	protected List<Serializable> result;
	protected List<PropertyMessage> messages;
	public List<PropertyMessage> getMessages() {
		return messages;
	}
	public void setMessages(List<PropertyMessage> messages) {
		this.messages = messages;
	}
	protected List<Throwable> errors;
	protected PagingInfo pagingInfo;
	
	public DefaultRemoteCallResult(){
		this(null, null, null, null);
	}
	public DefaultRemoteCallResult(List<Serializable> result,
			List<PropertyMessage> messages, 
			List<Throwable> errors, 
			PagingInfo pagingInfo) {
		super();
		setResult(result);
		setMessages(messages);
		setErrors(errors);
		setPagingInfo(pagingInfo);
	}
	/**
	 * @return the result
	 */
	public List<Serializable> getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(List<Serializable> result) {
		this.result = result;
	}
	/**
	 * @return the pagingInfo
	 */
	public PagingInfo getPagingInfo() {
		return pagingInfo;
	}
	/**
	 * @param pagingInfo the pagingInfo to set
	 */
	public void setPagingInfo(PagingInfo pagingInfo) {
		this.pagingInfo = pagingInfo;
	}
	/**
	 * @return the errors
	 */
	public List<Throwable> getErrors() {
		return errors;
	}
	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<Throwable> errors) {
		this.errors = errors;
	}
}
