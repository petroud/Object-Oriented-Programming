package project.Vehicle;

public abstract class Passenger extends Vehicle {
	protected int MaxPassengers;
	protected int CubicCentimeters;
	
	public Passenger(String NumberPlate, String Model, String Year, String Kilom, float PPD, int Pas, int Cubic) {
		super(NumberPlate, Model, Year, Kilom, PPD);
		this.MaxPassengers = Pas;
		this.CubicCentimeters = Cubic;
	}
	
	public Passenger() {
		NumberPlate = null;
		Model = null;
		YearOfManufacture = null;
		Kilometers = null;
		PricePerDay = 0;
		MaxPassengers = 0;
		CubicCentimeters = 0;
	}
	

	//
	//
	//-----Getters and Setters for the non inherited variables-----//
	
	public int getMaxPassengers() {
		return MaxPassengers;
	}

	public int getCubicCentimeters() {
		return CubicCentimeters;
	}

	public abstract void setMaxPassengers(int MaxPass);  // Abstract method, because for the bikes we need to check 
                                                         // if the max passengers are less than 3, for cars we don't
	
	public void setCubicCentimeters(int cubicCentimeters) {
		CubicCentimeters = cubicCentimeters;
	}
	
	// End of Getters and Setters//
	

	// Declaration of the abstract methods // 
	
	public abstract void printVehicle();
	
	public abstract String getVehicleNumberPlate();
	
	
	

}
