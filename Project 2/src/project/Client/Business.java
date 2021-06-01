package project.Client;

public class Business extends Client {
	
	protected float DiscountPercentage;

	
	//----Class Constructor inheriting variables from Client----//
	
	public Business(String Name, String VAT, String PhoneNumber, String City, String Country, float DiscPerc ) {
		super(Name, VAT, PhoneNumber, City, Country);
		this.DiscountPercentage = DiscPerc;
	}
	
	
	//---- Getter and Setter for non inherited variable DiscountPercentage ----//
	
	public float getDiscountPercentage() {
		return DiscountPercentage;
	}
	public void setDiscountPercentage(float discountPercentage) {
		DiscountPercentage = discountPercentage;
	}

    //---- Declaration of the abstract ClientPrint info printing method ----// 
	public void ClientPrint() {
		System.out.println("-------- Client Info | Type: Business --------");
		System.out.println("Name: " +this.Name);
		System.out.println("VAT: " +this.VAT);
		System.out.println("Phone Number: " +this.PhoneNumber);
		System.out.println("City: " +this.City);
		System.out.println("Country: " +this.Country);
		System.out.println("\nAgreed Discount Percentage: "+ this.DiscountPercentage +" %");
		System.out.println("----------------------------------------------\n");
	}
	
	//---- Method to give the Client VAT ----//
	public String getClientVAT() {
		return this.VAT;
	}
      
	public String getClientInfo() {
		return this.VAT +" | " +this.Name + " | Business ";
	}
}
