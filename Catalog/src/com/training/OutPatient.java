package com.training;

import java.time.*;

public class OutPatient extends Patient {

	private LocalDateTime appointment_time;

	public OutPatient(long patientId, String patientName, long mobileNumber, LocalDateTime appointment_time) {
		super(patientId, patientName, mobileNumber);
		//super();
		this.appointment_time = appointment_time;
	}

	public OutPatient(long patientId, String patientName, long mobileNumber) {
		super(patientId, patientName, mobileNumber);
	}

	public LocalDateTime getAppointment_time() {
		return appointment_time;
	}

	public void setAppointment_time(LocalDateTime appointment_time) {
		this.appointment_time = appointment_time;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +"Appoinment Time :=" +this.appointment_time;
	}
	
	
	
}
