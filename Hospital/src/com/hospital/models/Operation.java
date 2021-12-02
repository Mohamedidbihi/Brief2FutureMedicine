package com.hospital.models;

import com.hospital.enumerations.Resultatoperation;

public class Operation {

	private String op;
	private Doctor doctor ;
	private Patient patient;
	private Infirmiere infirmiere ;
	private Room room;
	private double prix;
	private Resultatoperation status;

	
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public Resultatoperation getStatus() {
		return status;
	}
	public void setStatus(Resultatoperation status) {
		this.status = status;
	}
	public Infirmiere getInfirmiere() {
		return infirmiere;
	}
	public void setInfirmiere(Infirmiere infirmiere) {
		this.infirmiere = infirmiere;
	}
	@Override
	public String toString() {
		return "Operation [ op=" + op + ", doctor=" + doctor + ", patient=" + patient + ", infirmiere="
				+ infirmiere + ", room=" + room + ", prix=" + prix + ", status=" + status + "]";
	}
	

	

	// Une op�ration sera dans un hopital, dans une salle sp�cifique, et g�r� par un m�decin X qui fait partie de l'hopital :)
	
	// Il faut v�rifier l'assurance du patient avant de passer l'op�ration
	
	// Ajouter une classe infirmi�re pour aider le m�decin dans son travail
	
	// l'assurance rembourse un pourcentage de 70% si c'est CNSS et 80% pour RAMED et 100% pour CNOPS 
	
	// chaque op�ration a un prix, le patient doit payer le montant et apr�s l'hopital va lui remboursser (le cas du CNSS et CNOPS) , si RAMED le patient va juste 
	// payer la diff�rence d�s le d�but (20%)
	
	// Proposition : Ajouter un attribut portefeuille � la classe Patient pour g�rer le solde du patient, et du coup il faut avoir aussi une classe transaction qui tra�e les 
	// actions de payments avec la date...
	
	// Essayer de structurer votre travail avec la cr�ation des interfaces qui vous permettez d'impl�menter les m�thodes n�cessaires.
	
	// Apr�s le payement d'une op�ration et si c'est pass� avec succ�s le programme est termin�, sinon il faut renvoyer le montant vers la portefeuille patient
	// et dans ce cas son dossier est en stand by pour le discuter au tribunal. (vous devez g�rer les status de chaque op�ration)
}