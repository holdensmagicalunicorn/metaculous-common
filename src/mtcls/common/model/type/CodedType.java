package mtcls.common.model.type;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CodedType extends IdentifiableType implements HasIdAndIntCode, Serializable{
	public static final int NO_CODE = -1;
	protected int code = NO_CODE;
	public CodedType(){
		super();
	}
	
	public CodedType(int code){
		this();
		this.code = code;
	}
	
	public int getCode(){
		return code;
	}
	
	@Override
	public boolean equals(Object other) {
		boolean retval = false;
		if (other == null) {
			return retval;
		}
		retval = super.equals(other);
		if (retval && other instanceof CodedType) {
//		if(other instanceof CodedType){
			CodedType obj = (CodedType) other;
			retval = obj.getCode() == code;
		}
		return retval;
	}
	
//	public boolean equals(CodedType other){
//		return equals(other);
//	}
	
//	public boolean equals(HasIdAndIntCode other){
//		return equals((CodedType)other);
//	}
}
