package project.Company;

import project.Client.Client;
import project.Utilities.DatePeriod;
import project.Vehicle.Vehicle;

import java.util.Date;

public class Rental {
	private int Code;
	private Client Client;
	private Vehicle Vehicle;
	private Date dateOfRental;
	private Date dateOfReturn;
	private float totalCost;
	
	//--------------------------- Class Constructors -----------------------------//
	
	public Rental(int CD, Client CL, Vehicle VEH, Date doRen, Date doRet, float ttlCst) {
		this.Code = CD;
		this.Client = CL;
		this.Vehicle = VEH;
		this.dateOfRental = doRen;
		this.dateOfReturn = doRet;
		this.totalCost = ttlCst;
	}
	
	public Rental() {
		
	}
	
	//
	//
	//Getters and Setters for the variables //
	
	public int getCode() {
		return Code;
	}
	public Client getClient() {
		return Client;
	}
	public Vehicle getVehicle() {
		return Vehicle;
	}
	public Date getDateOfRental() {
		return dateOfRental;
	}
	public Date getDateOfReturn() {
		return dateOfReturn;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setCode(int code) {
		Code = code;
	}
	public void setClient(Client client) {
		Client = client;
	}
	public void setVehicle(Vehicle vehicle) {
		Vehicle = vehicle;
	}
	public void setDateOfRental(Date dateOfRental) {
		this.dateOfRental = dateOfRental;
	}
	public void setDateOfReturn(Date dateOfReturn) {
		this.dateOfReturn = dateOfReturn;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	
	//
	//End of Getters and Setters//
	
	
	//--------------------Methods of the class Rental---------------------//
	
	public void rentalPrint() {	
		Date dos = this.dateOfRental;
		Date doe = this.dateOfReturn;
		DatePeriod period = new DatePeriod(dos, doe);
		
		
		System.out.println("------------------ Rental | Code: "+this.Code+" ------------------");
		System.out.println("Vehicle: " +this.Vehicle.getVehicleInfo());
		System.out.println("Client: " +this.Client.getClientInfo());
		System.out.println("Date of Rental: " +this.dateOfRental.toString());
		System.out.println("Date of Return : " +this.dateOfReturn.toString());
		System.out.println("Total Days calculated: " +period.toDays());
		System.out.println("Total Cost: " +this.totalCost +" €");
		System.out.println("--------------------------------------------------------");
	}
	
	public DatePeriod getPeriod() {
		DatePeriod dt = new DatePeriod(this.dateOfRental, this.dateOfReturn);
		return dt;
	}
	
	
	

	
}
