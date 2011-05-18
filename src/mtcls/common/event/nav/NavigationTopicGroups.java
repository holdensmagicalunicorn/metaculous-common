package mtcls.common.event.nav;

import mtcls.common.event.EventTopic;
import mtcls.common.event.TopicGroup;

public class NavigationTopicGroups {
	public static final TopicGroup NavigateRootView 
		= new TopicGroup(new EventTopic[]{
						NavigationTopics.NavigateRoot});
	/**
	 * root view navigation cannot be cancelled
	 */
	public static final TopicGroup NavigateRootLifecycle 
		= new TopicGroup(new EventTopic[]{
				NavigationTopics.BeforeNavigateRoot, 
				NavigationTopics.NavigateRoot
		});
	
	public static final TopicGroup NavigateViewLifecycle 
		= new TopicGroup(new EventTopic[]{
			NavigationTopics.NavigateCancelled, 
			NavigationTopics.BeforeNavigateView, 
			NavigationTopics.NavigateView
		});
	
	public static final TopicGroup NavigateView 
		= new TopicGroup(new EventTopic[] {
			NavigationTopics.NavigateView	
		});
	
	public static final TopicGroup NavigateOrCancelView 
	= new TopicGroup(new EventTopic[] {
		NavigationTopics.NavigateView, 
		NavigationTopics.NavigateCancelled
	});
}
