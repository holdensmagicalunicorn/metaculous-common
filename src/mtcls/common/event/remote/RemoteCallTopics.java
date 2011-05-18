package mtcls.common.event.remote;

import mtcls.common.event.EventTopic;
import mtcls.common.event.EventTopics;

/**
 * remote call event topics
 * @author josgraha
 *
 */
public abstract class RemoteCallTopics extends EventTopics {
	/**
	 * RemoteCallFailed event type
	 */	
	public static final EventTopic RemoteCallFailed = new EventTopic();
	
	/**
	 * RemoteCallIn event topic
	 */
	public static final EventTopic RemoteCallIn = new EventTopic();
	/**
	 * RemoteCallOut event topic
	 */
	public static final EventTopic RemoteCallOut = new EventTopic();
	/**
	 * RemoteCallSuccess event topic
	 */
	public static final EventTopic RemoteCallSuccess = new EventTopic();

}
