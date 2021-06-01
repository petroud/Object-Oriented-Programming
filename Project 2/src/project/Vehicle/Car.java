package project.Vehicle;

public final class Car extends Passenger{
	protected int NumOfDoors;
	protected FuelSource Fuel;
	
	public Car(String NumberPlate, String Model, String Year, String Kilom, float PPD, int Pas, int Cubic, int NOD, FuelSource FL) {
		super(NumberPlate, Model, Year, Kilom, PPD, Pas, Cubic);
		this.NumOfDoors = NOD;
		this.Fuel = FL;
	}
	
	public Car() {
		NumberPlate = null;
		Model = null;
		YearOfManufacture = null;
		Kilometers = null;
		PricePerDay = 0;
		MaxPassengers = 0;
		CubicCentimeters = 0;
		NumOfDoors = 0;
		Fuel = null;
	}

	//
	//
	// Getters and Setters for the non inherited variables 
	
	public int getNumOfDoors() {
		return NumOfDoors;
	}

	public FuelSource getFuel() {
		return Fuel;
	}

	public void setNumOfDoors(int numOfDoors) {
		NumOfDoors = numOfDoors;
	}

	public void setFuel(FuelSource fuel) {
		Fuel = fuel;
	}
	
	//End of Getters and Setters 
	
	
	//Code for the abstract methods declared in abstract Class Passenger and Vehicle
	
	public void printVehicle() {
		System.out.println("\n------------- Vehicle Info -------------");
		System.out.println("--------- Type: Passenger, Car ---------");
		System.out.println("Number Plate: " +this.NumberPlate);
		System.out.println("Brand and Model: " +this.Model);
		System.out.println("Year Of Manfacture: " +this.YearOfManufacture);
		System.out.println("Kilometers: " +this.Kilometers);
		System.out.println("Price Per Day: " +this.PricePerDay +" €");
		System.out.println("Max Passengers: " +this.MaxPassengers );
		System.out.println("Cubic Capicity: " +this.CubicCentimeters +" ccm");
		System.out.println("Type Of Fuel: " +this.Fuel);
		System.out.println("Number Of Doors: " +this.NumOfDoors +" doors");
		System.out.println("========================================\n");
	}
	
	public String getVehicleNumberPlate() {
		return this.NumberPlate;
	}
	
	public void setMaxPassengers(int MaxPass){
			MaxPassengers = MaxPass;
	}
	public String getVehicleInfo() {
		return this.NumberPlate +" | " +this.Model + " | Passenger, Car";
	}

}
