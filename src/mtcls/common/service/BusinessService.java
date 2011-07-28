package mtcls.common.service;

import java.io.Serializable;

import mtcls.common.model.service.ServiceListLoadResult;

import com.extjs.gxt.ui.client.data.ModelData;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("business.service")
public interface BusinessService extends RemoteService {
	
	public ServiceListLoadResult<Serializable> fetch(ModelData config);

	public ServiceListLoadResult<Serializable> submit(ModelData config);	
}
