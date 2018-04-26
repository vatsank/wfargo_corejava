package com.training;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Appointments {

	private Patient[] patientList = null;  // Has List of Patient - Has a Relationship

	public Appointments() {
		super();
        
		this.patientList = new Patient[3];
        
	}
	
	public void init(){
	
		 this.patientList[0] = new OutPatient(101,"Shyam Lal",7883868L);
		 this.patientList[1] = new OutPatient(102,"Ram Lal",5886828L);
		 this.patientList[2] = new OutPatient(102,"Ganesh",4886861L);
		 
	}
	
	public void printAppointments(){
		LocalDateTime startTime =LocalDateTime.of(2018, 4, 5, 9, 30);			
		for(Patient eachPatient:patientList)
		{

			((OutPatient)eachPatient).setAppointment_time(startTime);
			 startTime =startTime.plusMinutes(15);			

			System.out.println(eachPatient);
            
		}
	}
}
