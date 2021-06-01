package project.Vehicle;

public final class Bike extends Passenger {
	protected BikeType Type;
	
	public Bike(String NumberPlate, String Model, String Year, String Kilom, float PPD, int Pas, int Cubic, BikeType TP) {
		super(NumberPlate, Model, Year, Kilom, PPD, Pas, Cubic);
		this.Type = TP;		
	}
	public Bike() {
		NumberPlate = null;
		Model = null;
		YearOfManufacture = null;
		Kilometers = null;
		PricePerDay = 0 ;
		MaxPassengers = 0;
		CubicCentimeters = 0;
		Type = null;
	}
	
	//Getter and Setters for the BikeType thing //
	
	public BikeType getType() {
		return Type;
	}
	public void setType(BikeType type) {
		Type = type;
	}
	
	// End of Getter and Setter //
	
	//Code of the abstract methods
	
	
	public void printVehicle() {
		System.out.println("\n------------- Vehicle Info -------------");
		System.out.println("-------- Type: Passenger, Bike ---------");
		System.out.println("Number Plate: " +this.NumberPlate);
		System.out.println("Brand and Model: " +this.Model);
		System.out.println("Year Of Manfacture: " +this.YearOfManufacture);
		System.out.println("Kilometers: " +this.Kilometers);
		System.out.println("Price Per Day: " +this.PricePerDay +" €");
		System.out.println("Max Passengers: " +this.MaxPassengers );
		System.out.println("Cubic Capicity: " +this.CubicCentimeters +" ccm");
		System.out.println("Type of Bike: " +this.Type);
		System.out.println("========================================\n");
	}
	
	
	public String getVehicleNumberPlate() {
		return this.NumberPlate;
	}
	
	
	public void setMaxPassengers(int MaxPass){
		if(MaxPass<3) {
			MaxPassengers = MaxPass;
		} 
		else {
			System.out.println("Passengers cannot be more than 2!");
			System.exit(0);
		}	
	}
	
	public String getVehicleInfo() {
		return this.NumberPlate +" | " +this.Model + " | Passenger, Bike";
	}
	
}
