package project.Company;

import project.Utilities.StandardInputRead;


public class CompanyConsole {
	
	private Company company;
	
	public Company getCompany() {
		return company;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public CompanyConsole() {
		company = new Company();
	}
	

	public static void main(String[] args) {
		
		
		//Creating a unique, new company console
		CompanyConsole cc = new CompanyConsole();
		
				
		// ------------------------- User Menu ------------------------- //
		
		int userOption = 0;
		StandardInputRead reader1 = new StandardInputRead();
		int code = 120; 
		
		
		while (userOption!=12) {
			printMenu();
			String userInput = reader1.readString("Please choose an option from the menu above: ");
			if (userInput == null) {
				continue;
			} else {
				try {
					userOption = Integer.parseInt(userInput);
				} catch (NumberFormatException ex) {
					userOption = 0;
				}
			}
			
			switch (userOption) {
				case 0:
					continue;
				case 1: 
					String Plate = reader1.readString("Enter vehicle Number Plate: ");
					cc.getCompany().searchVehiclePrint(Plate);
					reader1.readString("Press any key to return to the menu...\n");
					break;
				case 2:
					cc.getCompany().deleteVehicle();
					reader1.readString("Press any key to return to the menu...\n");
					break;
				case 3:
					cc.getCompany().printFleet();	
					reader1.readString("\nPress any key to return to the menu...\n");
					break;
				case 4:
				    cc.getCompany().printVehiclesByCategory();
					reader1.readString("Press any key to return to the menu...\n");
					break;
				case 5:
					String VAT = reader1.readString("Enter Client VAT: ");
					cc.getCompany().searchClientPrint(VAT);
					reader1.readString("Press any key to return to the menu...\n");
					break;
				case 6:
					cc.getCompany().deleteClient();
					reader1.readString("Press any key to return to the menu...\n");
					break;
				case 7:
					cc.getCompany().addNewRental(code);
					code++;
					reader1.readString("Press any key to return to the menu...\n");
					break;
				case 8:
					printMenuForSearch();
	            	int searchChoice=0;
	            	StandardInputRead reader3 = new StandardInputRead();
	                searchChoice = reader3.readPositiveInt("\nSelect an option from the menu above: ");
	            	switch(searchChoice) {
	            	      case 1:
	            	    	  String nbrPlt = reader3.readString("\nEnter Vehicle's number plate: ");
	            	    	  cc.getCompany().searchRentalsByVehicle(nbrPlt);
	            	    	  break;
	            	      case 2:
	            	    	  String vat = reader3.readString("Enter Client's VAT: ");
	            	    	  cc.getCompany().searchRentalsByClient(vat);
	            	    	  break;
	            	      case 3:
	            	    	  cc.getCompany().searchRentalsByDatePeriod();
	            	    	  break;
	            	}
					reader1.readString("Press any key to return to the menu...\n");
					break;
				case 9:
					cc.getCompany().addNewVehicle();
					reader1.readString("Press any key to return to the menu...\n");
					break;
				case 10:
					cc.getCompany().addNewClient();
					reader1.readString("Press any key to return to the menu...\n");
					break;
				case 11:
					cc.getCompany().rentals.print();
					reader1.readString("Press any key to return to the menu...\n");
					break;
				case 12:
					System.out.println("Thank you for using the Car Rental Console \n           Console Terminated");
                    break;
				default:
					System.out.println("Error," +userOption+" is not an option"+  "| Selection ignored\n\n");
					continue;
			}
		
		}

	}
	
	// Menu printing method //

	public static void printMenu() {
        System.out.println("                   Car Rental Console                  ");
        System.out.println("=======================================================");
        System.out.println("1. Search for specific Vehicle by Number Plate ........");
        System.out.println("2. Delete a Vehicle from the database .................");
        System.out.println("3. Print the whole fleet of Vehicles ..................");
        System.out.println("4. Search for vehicles of a specific category .........");
        System.out.println("5. Search for specific Client by VAT ..................");
        System.out.println("6. Delete a Client from the database ..................");
        System.out.println("7. Create new Rental ..................................");
        System.out.println("8. Print Rentals by Criteria ..........................");
        System.out.println("9. Add new vehicle in database ........................");
        System.out.println("10. Add new client in database ........................");
        System.out.println("11. Print all active and inactive rentals .............");
        System.out.println("12. Exit ..............................................");
        System.out.println("=======================================================");        
    }
	
	public static void printMenuForSearch() {
		System.out.println("\n1. Search for Rentals by Vehicle's Number Plate .......");
        System.out.println("2. Search for Rentals by Client's VAT .................");
        System.out.println("3. Search for Rentals by Date Period ..................");
	}
	
	
		
}
