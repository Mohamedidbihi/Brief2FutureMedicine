package com.hospital.app;

import java.util.Date;
import java.util.Scanner;

import com.hospital.Impl.OperationImpl;
import com.hospital.interfaces.OperationInterface;

import Hospital.data.Data;


public class Main {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		OperationInterface p = new OperationImpl();
		Data d = new Data();
	 System.out.println("-------------------Bienvenue a l'hopital MED5------------------------");
	 System.out.println(">>>>>>>>>>>>>>>>>>>>> Choisir une option :");
	 System.out.println("1 - Nouvelle operation ");
	 System.out.println("2 - Liste des docteurs ");
	 System.out.println("3 - Liste des Infirmiers ");
	 System.out.println("4 - Liste des operations ");
	 System.out.println("---------------------------------------------------------------------");
	 int choix = reader.nextInt();
	 do
	 {
	 switch(choix) {
	 case 1:  p.addOperation();
	          break;
	 case 2:  System.out.println( d.operation());
	          break;
	 case 3:  break;
	 case 4:  break;
	 default : System.out.println("------Option invalide-------");
	
	 }
	 }
		while(true);
	 
	
	}

}
