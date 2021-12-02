package com.hospital.interfaces;

import com.hospital.enumerations.InsuranceType;
import com.hospital.enumerations.Resultatoperation;
import com.hospital.models.Doctor;
import com.hospital.models.Infirmiere;
import com.hospital.models.Operation;
import com.hospital.models.Room;

import java.util.Optional;



public interface OperationInterface {


	
	
	public Operation addOperation();
	
	public void resteInsurrance(double prix, InsuranceType i);
	
	public void genererRapport(Operation op);
	
	public Doctor getDoc();
	
	public Infirmiere getInf();
	
	public Room getRoom();
    
	public void changeStatut(Operation op , Resultatoperation r);
}
