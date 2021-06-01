package project.Client;

public class Individual extends Client {

	
	//----Class Constructor inheriting variables from Client----//

	public Individual(String Name, String VAT, String PhoneNumber, String City, String Country) {
		super(Name, VAT, PhoneNumber, City, Country);
	}
	
    //---- Declaration of the abstract ClientPrint info printing method ----// 

	public void ClientPrint() {
		System.out.println("------- Client Info | Type: Individual -------");
		System.out.println("Name: " +this.Name);
		System.out.println("VAT: " +this.VAT);
		System.out.println("Phone Number: " +this.PhoneNumber);
		System.out.println("City: " +this.City);
		System.out.println("Country: " +this.Country);
		System.out.println("----------------------------------------------\n");
	}

	//---- Method to give the Client VAT ----//

	public String getClientVAT() {
		return this.VAT;
	}
	
	public String getClientInfo() {
		return this.VAT +" | " +this.Name + " | Individual ";
	}

}
