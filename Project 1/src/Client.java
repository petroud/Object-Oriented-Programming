import java.util.Vector;

public class Client {
    
	private String firstName;
	private String lastName;
	private String LicenseNumber;
	private int YearsOfExperience;
	private String Country;
	
	
	private Vector<Rental> clientRentals;
	
	/****************** Class Constructors ********************/
	
	public Client() {
		this.clientRentals = new Vector<Rental>();
	}
	
	public Client(String fName, String lsName, String LNumber, int YOE, String country) {
		firstName = fName;
		lastName = lsName;
		this.LicenseNumber = LNumber;
		YearsOfExperience = YOE;
		Country = country;
        
		clientRentals = new Vector<Rental>();
	}
	
	//
	//
	//
	//
	/*******Getters for the variables********/	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLicenseNumber() {
		return LicenseNumber;
	}
	
	public int getYearsOfExperience() {
		return YearsOfExperience;
	}

	public String getCountry() {
		return Country;
	}

	public Vector<Rental> getClientRentals() {
		return clientRentals;
	}
	
    /*-------End of Getters-------*/
	
	//
	//
	//
	//
	/*******Setters for the variables********/	
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		YearsOfExperience = yearsOfExperience;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
	/*---------End of Setters----------*/
	
	public void addRental(Rental r) {
		clientRentals.add(r);
	}
	
	/*-------------Methods for printing and getting Client info--------------*/
	
	public void ClientPrint() {
		System.out.println("First Name: " +this.firstName);
		System.out.println("Last Name: " +this.lastName);
		System.out.println("License Number: " +this.LicenseNumber);
		System.out.println("Country of origin: " +this.Country);	
	}
	
	public String getClientInfo() {
		return this.firstName + ", " + this.lastName + " [" +this.LicenseNumber + "]";
	}
	
	public String getClientLicense() {
		return this.LicenseNumber;
	}
	
}
