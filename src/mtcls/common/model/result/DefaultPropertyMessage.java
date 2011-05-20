package mtcls.common.model.result;

import mtcls.common.model.PropertyMessage;

@SuppressWarnings("serial")
public class DefaultPropertyMessage implements PropertyMessage{
    protected String fieldName;
	protected String label;
    protected Boolean warning;
    protected Boolean error;
    protected Integer index;
    
    public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Boolean getWarning() {
		return warning;
	}
	public void setWarning(Boolean warning) {
		this.warning = warning;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
}
