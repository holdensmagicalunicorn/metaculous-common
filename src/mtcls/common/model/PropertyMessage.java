package mtcls.common.model;

import java.io.Serializable;

public interface PropertyMessage extends Serializable{
    public String getFieldName();
    public String getLabel();
    public Boolean getWarning();
    public Boolean getError();
    public Integer getIndex();
}
