package mtcls.common.event;

import java.util.ArrayList;
import java.util.List;

public class TopicGroup {
	protected List<EventTopic> topicList;
	public TopicGroup(){
		setTopicList(null);
	}
	
	public TopicGroup(List<EventTopic> topicList){
		setTopicList(topicList);
	}
	
	public TopicGroup(EventTopic[] topics){
		this(fromArray(topics));
	}

	/**
	 * @return the topicList
	 */
	public List<EventTopic> getTopicList() {
		return topicList;
	}

	/**
	 * @param topicList the topicList to set
	 */
	public void setTopicList(List<EventTopic> topicList) {
		this.topicList = topicList;
	}
	
	public static List<EventTopic> fromArray(EventTopic[] topics){
		List<EventTopic> retval = null;
		if(topics == null){
			return retval;
		}
		retval = new ArrayList<EventTopic>();
		for (int i = 0; i < topics.length; i++) {
			EventTopic topic = topics[i];
			retval.add(topic);
		}
		return retval;
	}
}
