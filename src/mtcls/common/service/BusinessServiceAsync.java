package mtcls.common.service;

import java.io.Serializable;

import mtcls.common.model.service.ServiceListLoadResult;

import com.extjs.gxt.ui.client.data.ModelData;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BusinessServiceAsync {
	public void fetch(ModelData config,
			AsyncCallback<ServiceListLoadResult<Serializable>> callback);

	public void submit(ModelData config,
			AsyncCallback<ServiceListLoadResult<Serializable>> callback);
}
