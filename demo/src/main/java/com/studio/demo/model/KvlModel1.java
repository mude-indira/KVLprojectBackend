package com.studio.demo.model;
import jakarta.persistence.UniqueConstraint;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
	    name = "Booking",
	    uniqueConstraints = @UniqueConstraint(columnNames = {"eventName", "eventDate"})
	)
public class KvlModel1 {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String contactnumber;

	private String username;
	private String eventLocation;
    private String eventName;
    private String eventTime;
    private String eventDate;
    
    public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String Contactnumber) {
		this.contactnumber = Contactnumber;
	}
	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
