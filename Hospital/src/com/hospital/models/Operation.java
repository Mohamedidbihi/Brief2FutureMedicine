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
	

	

	// Une opération sera dans un hopital, dans une salle spécifique, et géré par un médecin X qui fait partie de l'hopital :)
	
	// Il faut vérifier l'assurance du patient avant de passer l'opération
	
	// Ajouter une classe infirmière pour aider le médecin dans son travail
	
	// l'assurance rembourse un pourcentage de 70% si c'est CNSS et 80% pour RAMED et 100% pour CNOPS 
	
	// chaque opération a un prix, le patient doit payer le montant et après l'hopital va lui remboursser (le cas du CNSS et CNOPS) , si RAMED le patient va juste 
	// payer la différence dès le début (20%)
	
	// Proposition : Ajouter un attribut portefeuille à la classe Patient pour gérer le solde du patient, et du coup il faut avoir aussi une classe transaction qui traçe les 
	// actions de payments avec la date...
	
	// Essayer de structurer votre travail avec la création des interfaces qui vous permettez d'implémenter les méthodes nécessaires.
	
	// Après le payement d'une opération et si c'est passé avec succès le programme est terminé, sinon il faut renvoyer le montant vers la portefeuille patient
	// et dans ce cas son dossier est en stand by pour le discuter au tribunal. (vous devez gérer les status de chaque opération)
}