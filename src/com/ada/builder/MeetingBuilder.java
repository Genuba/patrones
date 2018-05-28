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

/**
 *
 * <h1>MeetingBuilder</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class MeetingBuilder extends AppointmentBuilder{
	public Appointment getAppointment() throws InformationRequiredException {
		try {
			super.getAppointment();
		} finally {
			if (appointment.getEndDate() == null) {
				requiredElements += END_DATE_REQUIRED;
			}
			if (requiredElements > 0) {
				throw new InformationRequiredException(requiredElements);
			}
		}
		return appointment;
	}
}
