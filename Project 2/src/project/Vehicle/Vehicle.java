package project.Vehicle;

public abstract class Vehicle {

	protected String NumberPlate;
	protected String Model;
	protected String YearOfManufacture;
	protected String Kilometers;
	protected float PricePerDay;
	
	//----Class Constructors---//
	
	public Vehicle() {
		NumberPlate = null;
		Model = null;
		YearOfManufacture = null;
		Kilometers = null;
		PricePerDay = 0;
	}
	
	public Vehicle(String NumberPlate, String Model, String Year, String Kilom, float PPD) {
		this.NumberPlate = NumberPlate;
		this.Model = Model;
		this.YearOfManufacture = Year;
		this.Kilometers = Kilom;
		this.PricePerDay = PPD;
	}
	
	
	//
	//
	//-----Getters and Setters for the variables-----//


	public String getNumberPlate() {
		return NumberPlate;
	}

	public String getModel() {
		return Model;
	}

	public String getYearOfManufacture() {
		return YearOfManufacture;
	}

	public String getKilometers() {
		return Kilometers;
	}

	public float getPricePerDay() {
		return PricePerDay;
	}

	public void setNumberPlate(String numberPlate) {
		NumberPlate = numberPlate;
	}

	public void setModel(String model) {
		Model = model;
	}

	public void setYearOfManufacture(String yearOfManufacture) {
		YearOfManufacture = yearOfManufacture;
	}

	public void setKilometers(String kilometers) {
		Kilometers = kilometers;
	}

	public void setPricePerDay(float pricePerDay) {
		PricePerDay = pricePerDay;
	}
	
	// End of Getters and Setters //
	
	
	//
	//
	//Abstract Methods 
	
    public abstract void printVehicle(); //Used for printing Vehicle Data and Info
	
	public abstract String getVehicleNumberPlate(); // Used for getting Vehicle Number Plate despite of its Type
	                                         // Used mainly for searching and linking to rentals
	
  
	public abstract String getVehicleInfo();
	
}
