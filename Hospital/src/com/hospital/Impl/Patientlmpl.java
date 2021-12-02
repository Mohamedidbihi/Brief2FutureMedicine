package com.hospital.Impl;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.hospital.enumerations.InsuranceType;
import com.hospital.errors.ErrorConstants;
import com.hospital.interfaces.PatientInterface;
import com.hospital.models.Patient;

public class Patientlmpl implements PatientInterface {
	Scanner reader = new Scanner(System.in);
	@Override

	public Patient addPatient(){
		boolean a =true;
		System.out.println("Entrez le Nom : ");
	    String nom=reader.nextLine();
		System.out.println("Entrez le prenom ");
		String prenom=reader.nextLine();
		System.out.println("Entrez le Telephone ");
		String tele=reader.nextLine();
		System.out.println("Entrez l'adresse ");
		String adresse=reader.nextLine();
		System.out.println("Entrez le numéro d'affiliation  ");
		String num=reader.nextLine();
		//SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		InsuranceType type = InsuranceType.CNOPS;
		
	 do {		 
		 try {	
			 
			 System.out.println("Selection le type inssurance  ");
			 for (int i = 0; i < InsuranceType.values().length; i++) {
				 System.out.println(i + 1 + ") " + InsuranceType.values()[i].getValue());
			 }
			 
			 int n=reader.nextInt();
			 type =  InsuranceType.values()[n-1];
			 a=true;
		 }
		 catch (Exception e){
			 a=false;
			 System.out.println("Attention" + ErrorConstants.ERR_TYPE_NOT_FOUND );
			 
		 }
	 }while(!a);
		
		
		System.out.println("Votre portefeuille ");
		  double pf=reader.nextInt();
	      Patient p =  new Patient(nom, prenom, tele, adresse, date, num, type,pf);
	      return p;
	}

	
}
