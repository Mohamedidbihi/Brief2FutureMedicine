package com.hospital.models;

import java.util.Date;

public class Transaction {
	
	private int ref ;
	private String nomPatient;
	private Date date;
	private double montant;
	
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getNomPatient() {
		return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	@Override
	public String toString() {
		return "Transaction [ref=" + ref + ", nomPatient=" + nomPatient + ", date=" + date + ", montant=" + montant
				+ "]";
	}
	
	
	
	
	
	



}
