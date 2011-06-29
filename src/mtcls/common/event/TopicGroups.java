package mtcls.common.event;

/**
 * logical grouping of commonly used event topics
 * @author josgraha
 *
 */
public abstract class TopicGroups {
	public static final TopicGroup AllTopics = new TopicGroup(new EventTopic[]{EventTopics.AllTopics});
}
