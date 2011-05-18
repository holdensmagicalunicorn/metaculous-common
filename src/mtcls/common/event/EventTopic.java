package mtcls.common.event;

import mtcls.common.model.type.CodedType;

@SuppressWarnings("serial")
public class EventTopic extends CodedType{
	public EventTopic(){
		super();
	}
	
	public EventTopic(int code){
		super(code);
	}
	
//	public boolean equals(EventTopic other){
//		return super.equals((CodedType)other);
//	}
}
