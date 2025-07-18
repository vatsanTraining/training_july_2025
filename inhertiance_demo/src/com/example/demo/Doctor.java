package com.example.demo;

/**
 * doctorName String
 * doctorId int
 * specialization[] string
 * gender String
 */
public class Doctor {

	private int doctorId;
	private String doctorName;
	private String gender;

	public Doctor() {
		super();
	}
	public Doctor(int doctorId, String doctorName, String gender) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.gender = gender;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		return this.doctorId +";"+this.doctorName +";"+this.gender;
	}
	
	
}
