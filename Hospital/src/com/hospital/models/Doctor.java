package com.hospital.models;

public class Doctor extends Person{

	private String professionNumber;
	private TimeSlot shiftSlot;
	private double salary;
	private String specialite;

	
	
	public Doctor(String firstname,String lastname,String phone,String address, String professionNumber,TimeSlot shiftSlot,double salary,String specialite) {
		super(firstname, lastname, phone, address);
		this.professionNumber = professionNumber;
		this.shiftSlot = shiftSlot;
		this.salary = salary;
		this.specialite = specialite;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getProfessionNumber() {
		return professionNumber;
	}

	public void setProfessionNumber(String professionNumber) {
		this.professionNumber = professionNumber;
	}

	public TimeSlot getShiftSlot() {
		return shiftSlot;
	}

	public void setShiftSlot(TimeSlot shiftSlot) {
		this.shiftSlot = shiftSlot;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Doctor [professionNumber=" + professionNumber + ", shiftSlot=" + shiftSlot + ", salary=" + salary
				+ ", specialite=" + specialite + "]";
	}
	
	
}
