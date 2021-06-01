
import java.util.Vector;

public class Car {
	private String BrandAndModel;
	private String NumberPlate;
	private int YearOfManufacture;
	private float ConsumptionPer100;
	private float Kilometers;
	private float PricePerDay;
	private Features Feature1; //First Feature out of Enumeration
	private Features Feature2; //Second Feature out of Enumeration
	private Features Feature3; //Third Feature out of Enumeration
	private Vector<Rental> CarRentals;



 /******************** Class Constructors ********************/
    
	public Car() {
		this.CarRentals = new Vector<Rental>();	
    }
	
	public Car(String BAN, String NBRPL, int YROM, float CSN100, float KLM, float PRPD) {
		this.BrandAndModel = BAN;
		this.NumberPlate = NBRPL;
		this.YearOfManufacture = YROM;
		this.ConsumptionPer100 = CSN100;
		this.Kilometers = KLM;
	    this.PricePerDay = PRPD;
	    this.CarRentals = new Vector<Rental>();
	}
	
	public Car(String BAN, String NBRPL, int YROM, float CSN100, float KLM, float PRPD, Features F1, Features F2, Features F3) {
		this(BAN, NBRPL, YROM, CSN100, KLM, PRPD);
		this.Feature1 = F1;
	    this.Feature2 = F2;
	    this.Feature3 = F3;
	}
	
	
	
	public Car(String BAN, String NBRPL, int YROM, float CSN100, float KLM, float PRPD, Features F1, Features F2) {
		this(BAN, NBRPL, YROM, CSN100, KLM, PRPD);
		this.Feature1 = F1;
	    this.Feature2 = F2;
	}
	
	//
	//
	//
	//
	/*******Getters for the variables********/	


	public String getBrandAndModel() {
		return BrandAndModel;
	}

	public String getNumberPlate() {
		return NumberPlate;
	}

	public int getYearOfManufacture() {
		return YearOfManufacture;
	}

	public float getConsumptionPer100() {
		return ConsumptionPer100;
	}

	public float getKilometers() {
		return Kilometers;
	}

	public float getPricePerDay() {
		return PricePerDay;
	}

	public Features getFeature1() {
		return Feature1;
	}

	public Features getFeature2() {
		return Feature2;
	}

	public Features getFeature3() {
		return Feature3;
	}

	public Vector<Rental> getCarRentals() {
		return CarRentals;
	}
	
	/*-------End of Getters-------*/
	
	//
	//
	//
	//
	/*******Setters for the variables********/	
	

	public void setBrandAndModel(String brandAndModel) {
		BrandAndModel = brandAndModel;
	}

	public void setNumberPlate(String numberPlate) {
		NumberPlate = numberPlate;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		YearOfManufacture = yearOfManufacture;
	}

	public void setConsumptionPer100(float consumptionPer100) {
		ConsumptionPer100 = consumptionPer100;
	}

	public void setKilometers(float kilometers) {
		Kilometers = kilometers;
	}

	public void setPricePerDay(float pricePerDay) {
		PricePerDay = pricePerDay;
	}

	public void setFeature1(Features feature1) {
		Feature1 = feature1;
	}

	public void setFeature2(Features feature2) {
		Feature2 = feature2;
	}

	public void setFeature3(Features feature3) {
		Feature3 = feature3;
	}
	
	/*---------End of Setters----------*/
	
	
	/************* Methods for printing different information about the cars ***************/
	
	public void CarPrint() {
		System.out.println("_____________________________________");
		System.out.println("Brand and Model: " + this.BrandAndModel);
		System.out.println("Number Plate:" + this.NumberPlate);
		System.out.println("Year of Manufacture: " +this.YearOfManufacture);
		System.out.println("Consumption(L) per 100km: " + this.ConsumptionPer100);
		System.out.println("Kilometers Driven: " +this.Kilometers);
		System.out.println("Price of Rental per Day: " +this.PricePerDay+" €");
		System.out.println("Features or Special Specs: " +this.Feature1+ ", " +this.Feature2+ ", "+this.Feature3);
		System.out.println("_____________________________________");
	}
	
	/*Method used to get some of the CAR info*/
	public String getCarInfo(){
		return this.NumberPlate + " / " +this.BrandAndModel;
	}
	
	/*Method used to get the price per day of the CAR*/
	public float getCarPrice() {
		return this.PricePerDay;
	}
	
	public String getCarNumberPlate() {
		return this.NumberPlate;
	}
	
	

}

