import java.util.ArrayList;
import java.util.List; //imports necessary methods
public class UberTester{
	
	public static void main(String [] args) {
		
		//declares UberCar objects
		UberCar c1 = new UberCar("Williams", "Main St", true); 
		UberCar c2 = new UberCar("Thomas", "Broadway", true);
		
		//declares UberRider objects
		UberRider r1 = new UberRider("Main St", "Broadway");
		UberRider r2 = new UberRider("Broadway", "Fifth Ave");
		UberRider r3 = new UberRider("Fifth Ave", "Main St");

		
		//declares ArrayLists for uberriders and ubercars
		List<UberRider> uberriders = new ArrayList<UberRider>();
		ArrayList<UberCar> ubercars = new ArrayList<UberCar>();
		
		//adds uberriders to arraylist
		uberriders.add(r1);
		uberriders.add(r2);
		uberriders.add(r3);
		
		//adds ubercars to arraylist
		ubercars.add(c1);
		ubercars.add(c2);

		//nested loop to print out the results to the following console
		for (int i = 0; i < uberriders.size(); i++){
			for (int j = 0; j < ubercars.size(); j++){
				if (ubercars.get(i).getAvailible() && uberriders.get(i).requestRide(ubercars.get(j))){
					ubercars.get(j).hasArrived(uberriders.get(i));
					System.out.println("The Ubercar driver" + " has arrived.");
					System.out.println(ubercars.get(j).getName() + " has arrived.");
					if(j == ubercars.size() - 1) {
						System.exit(1);
					}
				}	
			}
		}	
	}
}
