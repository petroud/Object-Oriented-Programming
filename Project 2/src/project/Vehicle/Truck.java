package project.Vehicle;

public final class Truck extends Vehicle {
	
	protected float UsefulLoad;
	protected float Weidth;
	protected float Height;
	
	//----Class Constructor----// 
	
	public Truck(String NBRPL, String Model, String YearOfManufacture, String Kilometers, float PricePerDay, float UsefulLoad, float Weidth, float Height) {
		super(NBRPL, Model, YearOfManufacture, Kilometers, PricePerDay);
		this.UsefulLoad = UsefulLoad;
		this.Weidth = Weidth;
		this.Height = Height;
	}
	public Truck() {
		this.UsefulLoad = 0;
		this.Weidth = 0;
		this.Height = 0;
		
	}
	
	//
	//
	//----Getters and Setter for the non inherited variables----//

	public float getUsefulLoad() {
		return UsefulLoad;
	}

	public float getWeidth() {
		return Weidth;
	}

	public float getHeight() {
		return Height;
	}

	public void setUsefulLoad(float usefulLoad) {
		UsefulLoad = usefulLoad;
	}

	public void setWeidth(float weidth) {
		Weidth = weidth;
	}

	public void setHeight(float height) {
		Height = height;
	}
	
	// End of Getters and Setters // 
	
	
	
	// Declaration of the abstract methods // 
	
	public void printVehicle() {
		System.out.println("\n----------------- Vehicle Info ----------------");
		System.out.println("------------------ Type:Truck -----------------");
		System.out.println("Number Plate: " +this.NumberPlate);
		System.out.println("Brand and Model: " +this.Model);
		System.out.println("Year Of Manufacture: " +this.YearOfManufacture);
		System.out.println("Kilometers: " +this.Kilometers);
		System.out.println("Price Per Day: " +this.PricePerDay +" €");
		System.out.println("Max Useful Load: " +this.UsefulLoad +" kg");
		System.out.println("Dimensions -  Weidth: "+this.Weidth+" m"+"  Height: " +this.Height+" m");	
		System.out.println("===============================================\n");
	}
	
	public String getVehicleNumberPlate() {
		return this.NumberPlate;
	}
	
	public String getVehicleInfo() {
		return this.NumberPlate +" | " +this.Model + " | Truck";
	}

}
