package mtcls.common.model.service;

import java.util.List;


import com.extjs.gxt.ui.client.data.BasePagingLoadResult;

@SuppressWarnings("serial")
public class BaseServicePagingLoadResult<Data> extends BasePagingLoadResult<Data>
	implements ServicePagingLoadResult<Data>{

	protected String serviceName;
	
	public BaseServicePagingLoadResult(){
		this(null);
	}
	public BaseServicePagingLoadResult(String serviceName){
		this(null, null);
	}
	public BaseServicePagingLoadResult(String serviceName, List<Data> list) {
		super(list);
		setServiceName(serviceName);
	}
	
	public BaseServicePagingLoadResult(String serviceName, List<Data> data, int offset, int totalLength) {
		super(data, offset, totalLength);
		setServiceName(serviceName);
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
}
