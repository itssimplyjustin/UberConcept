public class UberRider {

	//declares private variables
	private String start; 
	private String destination; 

	//uberrider constructor
	public UberRider(String start, String destination) {
		this.start = start;
		this.destination = destination;
	}
	//getDest method
		public String getDest() { 
			return destination; 
	}
	//setDest method
	public void setDest(String d) { 
			destination = d; 
		}
	//getStart method
	public String getStart() { 
		return start; 
	}
	//setStart method
	public void setStart(String s) { 
		start = s; 
	}
	
	//requestRide method
	public boolean requestRide(UberCar c) {
		//if-else statement to determine availability
		if(c.getCurrentLocation() == this.start) {
			return true;
		}
		else {
			return false;
		}
	}
	//hasArrived method to determine arrival
	public void hasArrived(UberCar c) {
		c.setAvailability(true);
		c.setCurrentLocation(this.destination);
	}
}

