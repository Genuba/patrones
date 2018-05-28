/*
 * MIT License 
 * 
 * Copyright (c) 2018 ADA
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package com.ada.builder;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * <h1>Appointment</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class Appointment {
	
	private Date stardDate;
	private Date endDate;
	private String description;
	private ArrayList attendees = new ArrayList();
	private Location location;
	
	public static final String EOL_STRING = System.getProperty("line.separator");
	
	public Date getStardDate() {
		return stardDate;
	}

	public void setStardDate(Date stardDate) {
		this.stardDate = stardDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList getAttendees() {
		return attendees;
	}

	public void setAttendees(ArrayList attendees) {
		if(attendees != null) {
			this.attendees = attendees;
		}
	}
	
	public void addAttendees(Contact attendee) {
		attendees.add(attendee);
	}
	public void removeAttendees(Contact attendee) {
		attendees.remove(attendee);
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	public String toString() {
		return " Description: " + description + EOL_STRING +
			   " Stard Date: " + stardDate + EOL_STRING +
			   " End Date: " + endDate + EOL_STRING +
			   " Location: " + location + EOL_STRING +
			   " Attendees: " + attendees;
	}
}	
