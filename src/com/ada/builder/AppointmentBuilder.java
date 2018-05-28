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
 * <h1>AppointmentBuilder</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class AppointmentBuilder {
	public static final int START_DATE_REQUIRED = 1;
	public static final int END_DATE_REQUIRED = 2;
	public static final int DESCRIPTION_REQUIRED = 4;
	public static final int ATTEND_REQUIRED = 8;
	public static final int LOCATION_REQUIRED = 16;

	protected Appointment appointment;
	protected int requiredElements;

	public void buildAppointment(){
		appointment = new Appointment();
	}
	public void buildDates(Date stardDate, Date endDate) {
		Date currentDate = new Date();
		if((stardDate != null) && (stardDate.after(currentDate))) {
			appointment.setStardDate(stardDate);
		}
		if((endDate != null) && (endDate.after(stardDate))) {
			appointment.setEndDate(endDate);
		}
	}
	public void buildDescription(String description) {
		appointment.setDescription(description);
	}
	public void buildAttendees(ArrayList attendees) {
		if((attendees != null) && (!attendees.isEmpty())) {
			appointment.setAttendees(attendees);
		}
	}
	public Appointment getAppointment() throws InformationRequiredException{
		requiredElements = 0;
		if (appointment.getStardDate() == null) {
			requiredElements += START_DATE_REQUIRED;
		}
		if (appointment.getLocation() == null) {
			requiredElements += DESCRIPTION_REQUIRED;
		}
		if (appointment.getAttendees().isEmpty()) {
			requiredElements += ATTEND_REQUIRED;
		}
		if (requiredElements > 0) {
			throw new InformationRequiredException(requiredElements);
		}
		return appointment;
	}
	public int getRequiredElements() {	return requiredElements;}
}
