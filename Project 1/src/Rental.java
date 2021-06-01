import java.util.Date;


public class Rental {
	private int code;
	private Client client;
	private Car car;
	private Date DateOfRental;
	private Date DateOfReturn;
	private float totalCost;
	
	/*-----------Constructor of the Class------------*/
	public Rental() {
		
	}
	
	public Rental(int cd,Date rDate, Date retDate, Client cln, Car cr, float ttlcst) {
		code = cd;
		client = cln;
		car = cr;
		DateOfRental = rDate;
		DateOfReturn = retDate;
		totalCost = ttlcst;
	}
	
	//
	//
	//
	//
	/*******Getters for the variables********/	

	public int getCode() {
		return code;
	}

	public Client getClient() {
		return client;
	}

	public Car getCar() {
		return car;
	}
	

	public Date getDateOfRental() {
		return DateOfRental;
	}

	public Date getDateOfReturn() {
		return DateOfReturn;
	}

	public float getTotalCost() {
		return totalCost;
	}
	
    /*-------End of Getters-------*/
	
	//
	//
	//
	//
	/*******Setters for the variables********/	

	public void setCode(int code) {
		this.code = code;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void setDateOfRental(Date dateOfRental) {
		DateOfRental = dateOfRental;
	}

	public void setDateOfReturn(Date dateOfReturn) {
		DateOfReturn = dateOfReturn;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	
	/*---------End of Setters----------*/


	/*Method used to get get (as String) the Rental Period of a car*/	
	public String getRentalPeriod(){
		String result = "";
		result += "From: ";
		result += this.DateOfRental.toString();
		
		result += " Until: ";
		result += this.DateOfReturn.toString();
		
		return result;		
	}
	
	public DatePeriod convertToDatePeriod(Rental r) {
		DatePeriod retur = new DatePeriod(this.DateOfRental,this.DateOfReturn);
		return retur;
	}
	
	public void RentalPrint() {
		System.out.println("______________Rental "+this.code+"________________");
		System.out.println("Car: " +this.car.getCarInfo());
		System.out.println("Client : " +this.client.getClientLicense());
		System.out.println("Period of Rental: " +this.getRentalPeriod());
	    System.out.println("__________________________________________________");
	}
	

}
