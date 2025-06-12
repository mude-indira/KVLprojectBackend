package com.studio.demo.dto;

public class KvlDto1 {
	private String username;
	private String eventLocation;
    private String eventName;
    private String eventTime;
    private String eventDate;
    private String contactnumber;
    private String email;
    
    public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String Contactnumber) {
		this.contactnumber = Contactnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventTime() {
		return eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
    
    

}
