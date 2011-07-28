package mtcls.common.model.service;

import java.util.List;


import com.extjs.gxt.ui.client.data.BaseListLoadResult;

@SuppressWarnings("serial")
public class BaseServiceListLoadResult<Data> extends BaseListLoadResult<Data>
	implements ServiceListLoadResult<Data>{
	
	protected String serviceName;
	
	public BaseServiceListLoadResult(){
		this(null);
	}
	public BaseServiceListLoadResult(String serviceName){
		this(null, null);
	}
	public BaseServiceListLoadResult(String serviceName, List<Data> list) {
		super(list);
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

