package com.hospital.models;

public class Infirmiere extends Person {
	private String professionNumber;
	private TimeSlot shiftSlot;
	private double salary;
	
	public Infirmiere() {}
	public Infirmiere(String firstname,String lastname,String phone,String address,String professionNumber,TimeSlot shiftSlot,double salary) {
		super(firstname, lastname, phone, address);
		this.professionNumber = professionNumber;
		this.shiftSlot = shiftSlot;
		this.salary = salary;
	
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
	
	
}
