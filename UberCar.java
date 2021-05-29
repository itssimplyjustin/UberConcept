public class UberCar {

	//declares method variables
	private String name; 
	private String currentLocation;
	public boolean available;

	//ubercar method with three parameters
	public UberCar(String n, String currentLocation, boolean available) {
		this.name = n;
		this.currentLocation = currentLocation;
		this.available = available;
	}
	//location method
	public String getCurrentLocation() { 
		return currentLocation; 
	}
	//getName method
	public String getName() { 
		return name; 
	}
	//if-else statement to determine availability in getAvailible method
	public boolean getAvailible() {
		if(available == true) {
			return true;
		}
		return false;
	}
	//boolean getAvailable method
	public boolean getAvailible(int s) { 
		return available; 
	}
	//setName method
	public void setName(String n) { 
		name = n; 
	}
	//avilivility method
		public void setAvailability(boolean a) { 
			available = a; 
		}
	//setCurrentLocation method
	public void setCurrentLocation(String l){ 
		currentLocation = l; 
	}
	
	//hasArrived method with parameter
	public void hasArrived(UberRider r) {
		this.currentLocation = r.getDest();
		available = true;
	}
}



