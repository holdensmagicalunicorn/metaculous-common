package mtcls.common.service;

import java.util.List;

import mtcls.common.model.AppModule;
import mtcls.common.model.Criteria;
import mtcls.common.model.RemoteCallResult;

public interface BusinessService extends MetadataService{
    public RemoteCallResult submit(AppModule module, List<Criteria> criteria);
    public RemoteCallResult fetch(AppModule module, List<Criteria> criteria);
}
