package mtcls.common.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Criteria implements Serializable {
	protected String name;
	protected String operator;
	protected String value;
	
	public Criteria() {
		this(null, null, null);
	}
	
	public Criteria(String name, String operator, String value){
		setName(name);
		setOperator(operator);
		setValue(value);
	}
	
	public Criteria(String name, String value){
		this(name, null, value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
