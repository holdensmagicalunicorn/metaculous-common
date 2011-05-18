package mtcls.common.event.remote;

import mtcls.common.event.EventTopic;
import mtcls.common.event.TopicGroup;
import mtcls.common.event.TopicGroups;

public abstract class RemoteCallTopicGroups extends TopicGroups{
	
	public static final TopicGroup RemoteCallSuccess 
		= new TopicGroup(new EventTopic[]{
							RemoteCallTopics.RemoteCallSuccess});
	
	public static final TopicGroup RemoteCallFailed 
		= new TopicGroup(new EventTopic[]{
							RemoteCallTopics.RemoteCallFailed});
	
	public static final TopicGroup RemoteCallSuccessOrFailed 
		= new TopicGroup(new EventTopic[]{
							RemoteCallTopics.RemoteCallSuccess, 
							RemoteCallTopics.RemoteCallFailed});

	public static final TopicGroup RemoteCallAllTopics 
	= new TopicGroup(new EventTopic[]{
						RemoteCallTopics.RemoteCallIn,
						RemoteCallTopics.RemoteCallOut, 
						RemoteCallTopics.RemoteCallSuccess, 
						RemoteCallTopics.RemoteCallFailed});
}
