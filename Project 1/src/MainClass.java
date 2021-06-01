import tuc.ece.cs102.util.StandardInputRead;

import java.util.Date;




public class MainClass {

	public static void main(String[] args) {
		
		//Creating New Company//
		Company comp = new Company("TUC Car-Rental", 190034024, "Chania Airport");
		
		//Populate the Company's Catalogs//
		
		comp.addClient(new Client("Nikos", "Arabatzis", "RPS442", 3, "Greece"));
		comp.addClient(new Client("Johanes", "Stevenson", "RFF839", 12, "Sweden"));
		comp.addClient(new Client("Katerina", "Mpampinioti", "HK6689", 2, "Greece"));
		comp.addClient(new Client("Marilena", "Karopoulou", "PK0967", 5, "Greece"));
		comp.addClient(new Client("Nick", "Malone", "JFK8FR", 14, "Ireland"));
		comp.addClient(new Client("Tim", "Roberg", "HJK31F", 9, "Belgium"));
		comp.addClient(new Client("Mario", "Marcelano", "ITF934", 6, "Italy"));
		comp.addClient(new Client("Mantalena", "Paliarini", "itj798", 3, "Italy"));
		comp.addClient(new Client("Klaus", "Regling", "DEF987", 18, "Germany"));
		comp.addClient(new Client("Manousos", "Manousakis", "GR0912", 20, "Greece"));
		
		comp.addCar(new Car("Ford Fiesta", "XNK5544", 2012, 6.4f, 120000.0f, 33.0f, Features.Air_Condition, Features.Diesel ));
		comp.addCar(new Car("Opel Corsa", "XNA1204", 2015, 4.7f, 80000.0f, 45.0f, Features.Air_Condition, Features.Diesel, Features.Leather_Seats ));
		comp.addCar(new Car("Nissan Micra", "XNO1706", 2015, 5.0f, 60500.0f, 45.0f, Features.Diesel, Features.Cabriolet, Features.Leather_Seats ));
		comp.addCar(new Car("Lancia Ypsilon", "XNX9901", 2012, 3.5f, 32000.0f, 30.0f, Features.Air_Condition, Features.Diesel, Features.Automatic ));
		comp.addCar(new Car("Toyota Yaris", "XNA1207", 2017, 2.7f, 17000.0f, 50.0f, Features.Air_Condition, Features.Hybrid, Features.Automatic ));
		comp.addCar(new Car("Nissan Qashqai", "XNA1208", 2015, 6.8f, 80000.0f, 60.0f, Features.SevenSeat, Features.Diesel, Features.Four_Wheel_Drive ));
		comp.addCar(new Car("Ford Mustang", "XNA1209", 2015, 4.7f, 80000.0f, 45.0f, Features.Air_Condition, Features.Automatic, Features.Leather_Seats ));
		comp.addCar(new Car("Opel Corsa", "XNH1210", 2018, 3.6f, 500.0f, 80.0f, Features.Automatic, Features.Air_Condition, Features.Leather_Seats ));
		comp.addCar(new Car("Toyota Aygo", "HKZ1211", 2018, 3.2f, 6000.0f, 45.0f, Features.Air_Condition, Features.Diesel, Features.Automatic ));
		comp.addCar(new Car("Audi A3", "MH01212", 2015, 6.1f, 33000.0f, 58.0f, Features.Air_Condition, Features.Automatic, Features.Leather_Seats ));
		
		Date dateRent1 = comp.StringToDate("2019-04-03");
		Date dateRent2 = comp.StringToDate("2019-04-05");
		Date dateRent3 = comp.StringToDate("2019-06-05");
		Date dateRent4 = comp.StringToDate("2019-06-05");
		Date dateRent5 = comp.StringToDate("2019-06-05");
		Date dateRent6 = comp.StringToDate("2019-06-07");
		Date dateRent7 = comp.StringToDate("2019-06-05");
		Date dateRent8 = comp.StringToDate("2019-05-03");
		Date dateRent9 = comp.StringToDate("2019-07-07");
		Date dateRent10 = comp.StringToDate("2019-06-07");
		Date dateReturn1 = comp.StringToDate("2019-04-22");
		Date dateReturn2 = comp.StringToDate("2019-04-08");
		Date dateReturn3 = comp.StringToDate("2019-04-15");
		Date dateReturn4 = comp.StringToDate("2019-06-15");
		Date dateReturn5 = comp.StringToDate("2019-06-15");
		Date dateReturn6 = comp.StringToDate("2019-06-04");
		Date dateReturn7 = comp.StringToDate("2019-06-15");
		Date dateReturn8 = comp.StringToDate("2019-07-19");
		Date dateReturn9 = comp.StringToDate("2019-07-12");
		Date dateReturn10 = comp.StringToDate("2019-06-15");

		
		comp.addRental(new Rental (100,dateRent1, dateReturn1, comp.findClientByLicense("RPS442"), comp.findCarByNumberPlate("XNX9901"),  570.0f));
		comp.addRental(new Rental (101,dateRent2, dateReturn2, comp.findClientByLicense("RFF839"), comp.findCarByNumberPlate("XNA1207"),  150.0f));
		comp.addRental(new Rental (102,dateRent3, dateReturn3, comp.findClientByLicense("HK6689"), comp.findCarByNumberPlate("XNA1208"),  600.0f));
		comp.addRental(new Rental (103,dateRent4, dateReturn4, comp.findClientByLicense("PK0967"), comp.findCarByNumberPlate("XNA1209"),  450.0f));
		comp.addRental(new Rental (104,dateRent5, dateReturn5, comp.findClientByLicense("JFK8FR"), comp.findCarByNumberPlate("XNH1210"),  720.0f));
		comp.addRental(new Rental (105,dateRent6, dateReturn6, comp.findClientByLicense("HJK31F"), comp.findCarByNumberPlate("HKZ1211"),  360.0f));
		comp.addRental(new Rental (106,dateRent7, dateReturn7, comp.findClientByLicense("ITF934"), comp.findCarByNumberPlate("MHO1212"),  464.0f));
		comp.addRental(new Rental (107,dateRent8, dateReturn8, comp.findClientByLicense("RPS442"), comp.findCarByNumberPlate("XNX9901"),  384.0f));
		comp.addRental(new Rental (108,dateRent9, dateReturn9, comp.findClientByLicense("PK0967"), comp.findCarByNumberPlate("XNA1207"),  225.0f));
		comp.addRental(new Rental (109,dateRent10, dateReturn10, comp.findClientByLicense("PK0967"), comp.findCarByNumberPlate("XNX9901"),  192.0f));
		
		
		//------------------------------ User Menu -------------------------//
		int userOption=0;
		String CarPlate, ClientLicense;
		StandardInputRead reader1 = new StandardInputRead();

        printMenu();
     
        while (userOption!=6){ 
        	String userInput = reader1.readString("What would you like to do? ");
            if (userInput == null) {
                continue;
            } else {
                try {
                    userOption = Integer.parseInt(userInput);
                } catch (NumberFormatException ex) {
                    userOption = 0;
                }
            }
        	
        	
        	
         switch(userOption) {
            case 0:
            	continue;
            case 1:
            	comp.addNewCar();
            	reader1.readString("Press any key to continue...");
            	break;
            case 2:
            	System.out.println("The fleet of Cars owned by the Company");
            	System.out.println("______________________________________");
            	comp.printListOfCars();
            	reader1.readString("Press any key to continue...");
            	break;
            case 3:
            	System.out.println("\nNew Client Entry Tab");
            	System.out.println("____________________");
            	comp.addNewClient();
            	reader1.readString("Press any key to continue...");
            	break;
            case 4:
            	System.out.println("New Rental Entry Tab");
            	System.out.println("____________________");
            	
            	StandardInputRead reader = new StandardInputRead();
            	ClientLicense = reader.readString("\nPlease give Client's License number: ");
                Client CLNT = comp.findClientByLicense(ClientLicense);
                
                CarPlate = reader.readString("\nPlease give Car's Number Plate: ");
                Car CAR = comp.findCarByNumberPlate(CarPlate);
                
                comp.addNewRental(CLNT, CAR);  
                reader1.readString("Press any key to continue...");
                break;               
            case 5:
            	printMenuForSearch();
            	int searchChoice=0;
            	StandardInputRead reader3 = new StandardInputRead();
                searchChoice = reader3.readPositiveInt("\nSelect an option from the menu above: ");
            	switch(searchChoice) {
            	      case 1:
            	    	  String nbrPlt = reader3.readString("\nEnter Car's number plate: ");
            	    	  comp.findRentalByNumberPlate(comp.findCarByNumberPlate(nbrPlt));
            	      case 2:
            	    	  String license = reader3.readString("\nEnter Driver's license number: ");
            	    	  comp.findRentalByLicense(comp.findClientByLicense(license));
            	    	  break;
            	      case 3:
            	    	  Date dateRentalSearch = reader3.readDate("\nEnter Date of Rental to search: ");
            	    	  Date dateReturnSearch = reader3.readDate("\nEnter Date of Return to search: ");
            	    	  DatePeriod datePeriodSearch = new DatePeriod (dateRentalSearch, dateReturnSearch);
            	    	  comp.findRentalByDatePeriod(datePeriodSearch);
            	    	  break;
            	}
            default:
            	System.out.println("User option ignored...");
            	continue;
         }
        }
  
	}
	
	//----------------------Methods for printing User Menus ----------------------//
	
	public static void printMenu() {
        System.out.println("                   Car Rental Console");
        System.out.println("=======================================================");
        System.out.println("1. Add New Car to Database.............................");
        System.out.println("2. Print the Database of Cars .........................");
        System.out.println("3. Add New Client to Database .........................");
        System.out.println("4. Create New Rental ..................................");
        System.out.println("5. Search Rentals based on Criteria ...................");
        System.out.println("6. Exit................................................"); 
        System.out.println("=======================================================");        
    }
	
	public static void printMenuForSearch() {
		System.out.println("1. Search for Rentals by Car's Number Plate ............");
        System.out.println("2. Search for Rentals by Driver's Licence ..............");
        System.out.println("3. Search for Rentals by Date Period ...................");
	}

}
