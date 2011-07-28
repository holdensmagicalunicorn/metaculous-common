package mtcls.common.model.service;

import com.extjs.gxt.ui.client.data.ListLoadResult;

public interface ServiceListLoadResult<Data> extends ListLoadResult<Data> {
	public String getServiceName();
	public void setServiceName(String serviceName);
}