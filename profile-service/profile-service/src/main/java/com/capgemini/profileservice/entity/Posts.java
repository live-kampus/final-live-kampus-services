package com.capgemini.profileservice.entity;

public class Posts {

	private String timelinePost;
	private String caption;
	private String tag;

	public Posts() {
		super();
	}

	public Posts(String timelinePost, String caption, String tag) {
		super();
		this.timelinePost = timelinePost;
		this.caption = caption;
		this.tag = tag;
	}

	public String getTimelinePost() {
		return timelinePost;
	}

	public void setTimelinePost(String timelinePost) {
		this.timelinePost = timelinePost;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;	
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	
	
}
