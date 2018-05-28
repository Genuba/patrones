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
 * <h1>Scheduler</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class Scheduler {
	public Appointment createAppointment(AppointmentBuilder builder,Date startDate,Date endDate, String description, Location location, ArrayList attendees) throws InformationRequiredException {
		if (builder == null) {
			builder = new AppointmentBuilder();
		}
		builder.buildAppointment();
		builder.buildAttendees(attendees);
		builder.buildDates(startDate, endDate);
		builder.buildDescription(description);
		builder.buildLocation(location);
		return builder.getAppointment();
	}

}
