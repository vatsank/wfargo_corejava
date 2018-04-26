package com.training;

public class Patient {

	
	private long patientId;
	private String patientName;
	private long mobileNumber;
	
	public Patient() {
		super();
	}

	public Patient(long patientId, String patientName, long mobileNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
	}

	
	public Patient(long patientId) {
	    this(patientId,"Guest",007);
		//this.patientId = patientId;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	public Integer purchaseMedicine(String medicine){
		
		return 200;
	}

	@Override
	public String toString() {

		return this.patientId + ":"+this.patientName + ":"+this.mobileNumber;
	}
	
	
}
