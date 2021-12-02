package com.hospital.Impl;


import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.hospital.enumerations.InsuranceType;
import com.hospital.enumerations.Resultatoperation;
import com.hospital.interfaces.OperationInterface;
import com.hospital.interfaces.PatientInterface;
import com.hospital.models.Doctor;
import com.hospital.models.Infirmiere;
import com.hospital.models.Operation;
import com.hospital.models.Patient;
import com.hospital.models.Room;

import Hospital.data.Data;

public class OperationImpl implements OperationInterface{
Scanner reader = new Scanner(System.in);
Data d = new Data();


	@Override
	public Operation addOperation() {
		
		PatientInterface p = new Patientlmpl();
		
		  
		Patient newp = p.addPatient();
	   System.out.println("Quelle operation");
	   String operation=reader.nextLine();
	   System.out.println("Le prix du operation");
	   double prix=reader.nextInt();
	   if(newp.getInsuranceType() == InsuranceType.RAMED) {

		      while(prix * 0.2 > newp.getPorteFeuille())
		      {
			  System.out.println("Ajouter plus d'argent pour passer operation !! ");
			  int Addcoins = reader.nextInt();
			  Addcoins += newp.getPorteFeuille();
			  newp.setPorteFeuille(Addcoins);
		      }
	         newp.setPorteFeuille(newp.getPorteFeuille()-(prix*0.2));
	         System.out.printf("Payement passe avec succee ,Le Reste : %s",newp.getPorteFeuille());
	   }
	   else { 
		   while(newp.getPorteFeuille() < prix) {
			   System.out.println("Ajouter plus d'argent pour passer operation");
			   int Addcoins=reader.nextInt(); 
			   Addcoins += newp.getPorteFeuille();
			   newp.setPorteFeuille(Addcoins);   
		     }  
		   newp.setPorteFeuille(newp.getPorteFeuille()-prix);
	         System.out.printf("Payement passe avec succee ,Le Reste : %s",newp.getPorteFeuille());   
	   }
	   
	   
	   Room r = getRoom(); 
	   Doctor d= getDoc();
	   Infirmiere i = getInf();
	  Operation op = new Operation();
	  op.setOp(operation);
	  op.setDoctor(d);
	  op.setInfirmiere(i);
	  op.setPrix(prix);
	  op.setRoom(r);
	  op.setStatus(Resultatoperation.ENCOURS);
	  op.setPatient(newp);
	  System.out.println("---------------------------Hopitale med 5------------------------------\n \n");
	  System.out.println("**** Operation bien Ajouter : Bon retablissement !! ***");
	  System.out.println("------------------------------------------------------------------------\n \n");
	  genererRapport(op);
	  return op;

	}

	@Override
	public void resteInsurrance(double prix, InsuranceType i) {
		// TODO Auto-generated method stub
		double res;

		System.out.println("-------------------------Rembourssemnt----------------------------\n");
		if(i == InsuranceType.CNOPS){
             System.out.println();
			 System.out.println("Votre Insurrance CNOPS va te remboursse 100%  :"+ prix +"DH");
			
		}else if( i == InsuranceType.CNSS) {
			 res = prix*0.7;
			 System.out.println("Votre Insurrance CNSS va te remboursse 70% :" + res + "DH");			 
		}	
		System.out.println("-----------------------------------------------------------------\n");
	
	}

	
	
	@Override
	public Doctor getDoc() {
		 List<Doctor> doctor = d.doctors();
		 System.out.println("-------------------------Docteurs----------------------------\n");
		 System.out.println("Choisissez un num pour selectioner docteur");
		 for (int i = 0; i < doctor.size(); i++) {
			 System.out.println(i+1 +")" + doctor.get(i).getFirstname() +"Les heures de travaille :\n **Debut :" +doctor.get(i).getShiftSlot().getStartTime()+ " :\n **Fin"+doctor.get(i).getShiftSlot().getEndTime());
		 }
		 System.out.println("-----------------------------------------------------------------\n \n");
		 int a = reader.nextInt();
		return doctor.get(a-1);
	}

	@Override
	public Infirmiere getInf() {
		 List<Infirmiere> infermiers = d.infirmiere();
		 System.out.println("-------------------------Infirmieres----------------------------\n");
		 System.out.println("Choisissez un num pour selectioner infirmiere");
		 for (int i = 0; i < infermiers.size(); i++) {
		      System.out.println(i+1 +")" + infermiers.get(i).getFirstname() +"Les heures de travaille :\n **Debut :" +infermiers.get(i).getShiftSlot().getStartTime()+ " :\n **Fin"+infermiers.get(i).getShiftSlot().getEndTime());
		 }
		 System.out.println("-----------------------------------------------------------------\n");
		 int a = reader.nextInt();
		return infermiers.get(a-1);
	}

	@Override
	public Room getRoom() {
		 List<Room> rooms = d.rooms();
		 System.out.println("Choisissez un num pour selectionner la chambre");
		 System.out.println("-------------------------Les chambres---------------------------- \n");
		 for (int i = 0; i < rooms.size(); i++) {
		      System.out.println(i+1 +") Numero de salle :" + rooms.get(i).getNumber() + "Etage :  " + rooms.get(i).getStage());
		 }
		 System.out.println("----------------------------------------------------------------- \n");
		 int a = reader.nextInt();
		return rooms.get(a-1);
	}

	@Override
	public void genererRapport(Operation op) {
		System.out.println("*********************** Rapport de operation *********************** ");
		System.out.println("*************************** Infos Patient ************************** ");
		System.out.println("Id du patient : " + op.getPatient().getId() +" Votre portfeuille :" +op.getPatient().getPorteFeuille() +"\n");
		System.out.println("Nom complete du patient : " + op.getPatient().getLastname() + " " +op.getPatient().getFirstname()+"\n");
		System.out.println("Adresse : " + op.getPatient().getAddress() + " Telephone :  " +op.getPatient().getPhone()+"\n");
		System.out.println("Date Hospitalisation : " + op.getPatient().getHospitalEntryDate() +"\n");
		System.out.println("Type  Inssurance : " + op.getPatient().getInsuranceType() + " Le numéro d'affiliation :  " +op.getPatient().getAffiliationNumber()+"\n");
		System.out.println("******************************************************************* \n");
		
		System.out.println("*************************** Infos Operation ************************** ");
		System.out.println("Operation  :" + op.getOp() +" Status : "+op.getStatus() +"\n" );
		System.out.println("Docteur : Mr/mm " + op.getDoctor().getFirstname() + " " +op.getDoctor().getLastname()+ "\n");
		System.out.println("Infirmier : Mr/mm " + op.getInfirmiere().getFirstname() + " " +op.getInfirmiere().getLastname()+ "\n");
		System.out.println("Chambre :  " + op.getRoom().getNumber()+ " Etage :  " +op.getRoom().getStage()+ "\n");
		System.out.println("Montant :" + op.getPrix() +"\n");
		System.out.println("******************************************************************* \n");
		
		resteInsurrance(op.getPrix(), op.getPatient().getInsuranceType());
		
	}

	@Override
	public void changeStatut(Operation op, Resultatoperation r) {
		
		op.setStatus(r);
		
	}




}
