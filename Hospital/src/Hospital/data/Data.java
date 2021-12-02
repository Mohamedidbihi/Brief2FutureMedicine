package Hospital.data;

import java.util.ArrayList;
import java.util.List;

import com.hospital.models.Doctor;
import com.hospital.models.Infirmiere;
import com.hospital.models.Operation;
import com.hospital.models.Patient;
import com.hospital.models.Room;
import com.hospital.models.TimeSlot;

public class Data {
    private ArrayList<Doctor> doctors;
    private ArrayList<Infirmiere> infirmieres;
    private ArrayList<Room> rooms;
    private ArrayList<Operation> operation;
	
	//List<Doctor> doctors = new ArrayList<Doctor>();
	//List<Infirmiere> infirmieres = new ArrayList<Infirmiere>();
	//List<Room> rooms = new ArrayList<Room>();
	//List<Patient> patients = new ArrayList<Patient>();
	
    
    
    
    	TimeSlot matin  = new TimeSlot(6,12);
    	TimeSlot soir   = new TimeSlot(12 , 18);
    	TimeSlot nuit   = new TimeSlot(18 , 0);
	    TimeSlot minuit = new TimeSlot(0 , 6);
	    public ArrayList<Operation> operation(){
	    	return operation;
	    } 
	    public ArrayList<Operation> operation(Operation op){
	    	operation.add(op);
	    	return operation;
	    }
	    
	    
	    public ArrayList<Infirmiere> infirmiere(){

	    	Infirmiere I1 = new Infirmiere("Ali", "Med", "0664128652", "Safi", "AM657", matin, 2000);
	    	Infirmiere I2 = new Infirmiere("YASSIN", "HOUPPY", "0664128652", "Safi", "YH56", soir, 2000);
	    	Infirmiere I3 = new Infirmiere("OTMANE ", "MAACHA", "0664128652", "Safi", "OM656", nuit, 2000);
	    	Infirmiere I4 = new Infirmiere("ANASS", "ELMESKINE", "0664128652", "Safi", "AE654", matin, 2000);
	    	Infirmiere I5 = new Infirmiere("OUSSAMA", "FILANI", "0664128652", "Safi", "OF653", minuit, 2000);
	    	infirmieres = new ArrayList<>();

	    	infirmieres.add(I1);
	    	infirmieres.add(I2);
	    	infirmieres.add(I3);
	    	infirmieres.add(I4);
	    	infirmieres.add(I5);

	        return infirmieres;
	    }
	
	 public ArrayList<Doctor> doctors(){

			Doctor D1 = new Doctor("Ali", "Med", "0664128652", "Safi", "AM65929244", matin, 12000,"chirurgien");
			Doctor D2 = new Doctor("IDBIHI", "Med", "0664128652", "Safi", "AM654322112", soir, 20000,"chirurgien");
			Doctor D3 = new Doctor("hakim", "yassin", "0664128652", "Safi", "AM654122132", soir, 180000,"chirurgien");
			Doctor D4 = new Doctor("ibrahimi", "oualid", "0664128652", "Safi", "AM6541221", soir, 190000,"chirurgien");
			Doctor D5 = new Doctor("maaloul", "yasin", "0664128652", "Safi", "AM65432", soir, 21000,"chirurgien");

			doctors = new ArrayList<>();
			
			doctors.add(D1);
			doctors.add(D2);
			doctors.add(D3);
			doctors.add(D4);
			doctors.add(D5);
			


	        return doctors;
	    }


	    public ArrayList<Room> rooms(){

	    	Room r0 = new Room(1,0);
	    	Room r1 = new Room(2,0);
	    	Room r2 = new Room(3,0);
	    	Room r3 = new Room(4,0);
	    	Room r4 = new Room(5,1);
	    	Room r5 = new Room(6,1);Room r6 = new Room(7,1);Room r7 = new Room(7,1);

	        rooms = new ArrayList<>();
	        
	        rooms.add(r0);rooms.add(r1);rooms.add(r2);rooms.add(r3);rooms.add(r4);rooms.add(r5);rooms.add(r6);rooms.add(r7);
	    	
	        return rooms;
	    }
	

}
