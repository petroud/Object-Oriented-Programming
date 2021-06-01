package project.Client;


public abstract class Client {
     
	protected String Name;
	protected String VAT;
	protected String PhoneNumber;
	protected String City;
	protected String Country;
	
	
	//----Class Constructors----//
	public Client() {
		Name = null;
		VAT = null;
		PhoneNumber = null;
		City = null;
		Country = null;
	}
	
	public Client(String Name, String VAT, String PhoneNumber, String City, String Country) {
		this.Name = Name;
		this.VAT = VAT;
		this.PhoneNumber = PhoneNumber;
		this.City = City;
		this.Country = Country; 
	}
	
	//
	//
	//----Getters and Setters for the Variables----//

	public String getName() {
		return Name;
	}

	public String getVAT() {
		return VAT;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public String getCity() {
		return City;
	}

	public String getCountry() {
		return Country;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setVAT(String vAT) {
		VAT = vAT;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public void setCity(String city) {
		City = city;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
	
	
	//Printing method for client info
	
    public abstract void ClientPrint();
	
	
	//Abstract Methods to get object specifications according to Client type

	public abstract String getClientVAT(); // Used for getting Client VAT despite of its Type
                                    // Used mainly for searching and linking to rentals
	
	public abstract String getClientInfo();
	
		
}
