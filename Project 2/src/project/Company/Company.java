package project.Company;

import project.Client.Client;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import project.Client.Business;
import project.Client.Individual;
import project.Utilities.StandardInputRead;
import project.Vehicle.Bike;
import project.Vehicle.BikeType;
import project.Vehicle.Car;
import project.Vehicle.FuelSource;
import project.Vehicle.Truck;
import project.Vehicle.Vehicle;
import project.Items.ClientItem;
import project.Items.RentalItem;
import project.Items.VehicleItem;
import project.Utilities.DatePeriod;


public class Company {
	private String BrandName;
	private float VAT;
	private String Location;
	
	//Sorted Lists of the Company
	
	public CompanySortedList vehicles;
	public CompanySortedList clients;
	public CompanySortedList rentals;	
 	//------------------------ Class Constructors -------------------------//
 	
 	//--VOID Constructor--//
 	public Company() {
 		
 		BrandName = "TUC Car Rental";
 		VAT = 913024034.0f;
 		Location = "Chania, Greece";
 		vehicles = new CompanySortedList();
 		clients = new CompanySortedList();
 		rentals = new CompanySortedList();
 		
 	
 		//Populating Company's catalogs
 		
 		  //Clients
 		clients.insert(new ClientItem(new Individual("Nikos Arabatzis", "123456789", "3028210373", "Chania", "Greece" )));
		clients.insert(new ClientItem(new Individual("Johanes Stevenson", "987456321", "4621097275", "Stockholm", "Sweden" )));
		clients.insert(new ClientItem(new Business("Nick Malone", "741258963", "353675589", "Dublin", "Ireland", 10.0f )));
		clients.insert(new ClientItem(new Business("Tim Roberg", "258963147", "3265738648", "Brussels", "Belgium", 20.0f )));
		
		 //Vehicles
		  //Cars
		vehicles.insert(new VehicleItem(new Car("XNK5544", "Mercedes C200", "2012", "120000",  50.0f, 5, 1800, 4, FuelSource.Battery)));
		vehicles.insert(new VehicleItem(new Car("XNA1204", "Honda Pilot", "2019", "5000",  70.0f, 7, 3000, 5, FuelSource.Diesel)));
		vehicles.insert(new VehicleItem(new Car("XNM1345", "Mercedes MiniXBS", "2018", "6000",  100.0f, 12, 3000, 4, FuelSource.Diesel)));
		  //Bikes
		vehicles.insert(new VehicleItem(new Bike("XNO1706", "Yamaha YZF-R3", "2015", "60500", 45.0f, 2, 600, BikeType.Touring)));
		vehicles.insert(new VehicleItem(new Bike("XNX9901", "Kawasaki Ninja 300", "2012", "32000", 30.0f, 2, 300, BikeType.Cruiser )));
		  //Trucks
		vehicles.insert(new VehicleItem(new Truck("XNA1207","Volvo FH16", "2017", "90000", 250.0f, 20000.0f, 3.0f,4.0f)));
		vehicles.insert(new VehicleItem(new Truck("XNA1208","Scania XD1", "2018", "80000", 300.0f, 25000.0f, 3.0f,3.0f)));
 		
		 //Rentals
		Date dateRent1 = StringToDate("2019-04-03");
		Date dateRetu1 = StringToDate("2019-04-22");
		rentals.insert(new RentalItem(new Rental(100, findClient("123456789"), findVehicle("XNK5544"), dateRent1,dateRetu1, 950.0f )));
		
		Date dateRent2 = StringToDate("2019-04-05");
		Date dateRetu2 = StringToDate("2019-04-08");
		rentals.insert(new RentalItem(new Rental(101, findClient("987456321"), findVehicle("XNA1204"), dateRent2,dateRetu2, 210.0f )));
		
		Date dateRent3 = StringToDate("2019-06-05");
		Date dateRetu3 = StringToDate("2019-06-15");
		rentals.insert(new RentalItem(new Rental(102, findClient("741258963"), findVehicle("XNO1706"), dateRent3,dateRetu3, 405.0f )));
		
		Date dateRent4 = StringToDate("2019-06-05");
		Date dateRetu4 = StringToDate("2019-06-15");
		rentals.insert(new RentalItem(new Rental(103, findClient("258963147"), findVehicle("XNX9901"), dateRent4,dateRetu4, 240.0f )));
		
		Date dateRent5 = StringToDate("2019-06-05");
		Date dateRetu5 = StringToDate("2019-06-14");
		rentals.insert(new RentalItem(new Rental(104, findClient("123456789"), findVehicle("XNA1207"), dateRent5,dateRetu5, 2250.0f )));
		
		Date dateRent6 = StringToDate("2019-06-07");
		Date dateRetu6 = StringToDate("2019-06-15");
		rentals.insert(new RentalItem(new Rental(105, findClient("987456321"), findVehicle("XNA1208"), dateRent6,dateRetu6, 2400.0f )));
		
		Date dateRent7 = StringToDate("2019-06-05");
		Date dateRetu7 = StringToDate("2019-06-15");
		rentals.insert(new RentalItem(new Rental(106, findClient("741258963"), findVehicle("XNK5544"), dateRent7,dateRetu7, 450.0f )));
		
		Date dateRent8 = StringToDate("2019-08-05");
		Date dateRetu8 = StringToDate("2019-08-15");
		rentals.insert(new RentalItem(new Rental(107, findClient("258963147"), findVehicle("XNM1345"), dateRent8,dateRetu8, 800.0f )));
		
		
		//
		// End of Populating
 	}
 	

 	
 	//----Getters for the variables----//
	public float getVAT() {
		return VAT;
	}
	
	public String getBrandName() {
		return BrandName;
	}
	
	public String getLocation() {
		return Location;
	}
	
	
	//----End of getters----//
	//
	//
	//----Setters for the variables----//
	
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public void setVAT(float vAT) {
		VAT = vAT;
	}

	public void setLocation(String location) {
		Location = location;
	}
	
	//----End of Setters----//
	
	
	//------------------------Methods-------------------------//
	
	public void addVehicle(Vehicle veh) {
		vehicles.insert(new VehicleItem(veh));
	}
	
	public void addClient(Client cl) {
		clients.insert(new ClientItem(cl));
	}
	
	public void addRental(Rental ren) {
		rentals.insert(new RentalItem(ren));
	}
	
	
	//Search for Client according to his VAT number
	//Used for linking clients with rentals 
	public Client findClient(String VAT) {
		ClientItem sItem = (ClientItem)clients.searchString(VAT);
		if(sItem==null) {
			return null;
		}
		else {
			return (Client)sItem.getData();
		}
	}
	
	//Search for Vehicle according to its NumberPlate
	//Used for linking vehicles with rentals
	public Vehicle findVehicle(String Plate) {
		VehicleItem sItem = (VehicleItem)vehicles.searchString(Plate);
		if(sItem==null) {
			return null;
		}
		else {
			return (Vehicle)sItem.getData();
		}
	}
	
	//Search for certain category vehicles and print them
	//"4)ANAZITISI OXHMATWN KATHGORIAS"
	public void printVehiclesByCategory() {
		System.out.println("\nChoose one of the following categories: \n1)Car \n2)Bike \n3)Truck \n4)Passenger");
		StandardInputRead reader2 = new StandardInputRead();
		int userSelection = reader2.readPositiveInt("Your selection: ");
		
		switch(userSelection) {
		  case 1:
			  String userFinal_01 = "project.Vehicle.Car";
			  vehicles.printAllInHierarchy(userFinal_01);
		      break;
		  case 2:
			  String userFinal_02 = "project.Vehicle.Bike";
			  vehicles.printAllInHierarchy(userFinal_02);
			  break;
		  case 3:
			  String userFinal_03 = "project.Vehicle.Truck";
			  vehicles.printAllInHierarchy(userFinal_03);
			  break;
		  case 4:
			  String userFinal_04 = "project.Vehicle.Passenger";
			  vehicles.printAllInHierarchy(userFinal_04);
			  break;
		  default:
			  System.out.println("Error | " +userSelection+ " is not an option");
		}
	}
	
	
	//Search for specific vehicle according to its Number plate and print it
	//"1) ANAZITISI OXHMATOS"
	public void searchVehiclePrint(String Plate) {
		VehicleItem vItem = (VehicleItem)vehicles.searchString(Plate);
		if(vItem==null) {
			System.out.println("Search Error | Vehicle not found | Try again");
		}
		else {
		   vItem.print();
		}
	}
	
	//Search for specific client according to his VAT and print info
	//"5) ANAZITISI PELATH"
	public void searchClientPrint(String VAT) {
		ClientItem cItem = (ClientItem)clients.searchString(VAT);
		if(cItem==null) {
			System.out.println("Search Error | Client not found | Try again");
		}
		else {
		   cItem.print();
		}
	}
	
	public void printFleet() {
		System.out.println("-----------------The fleet of cars owned by the company-----------------");
		System.out.println("------------------------------------------------------------------------");	
		vehicles.print();
		System.out.println("------------------------------------------------------------------------");
	}
	
	//Search for a specific vehicle and then delete it from the database
	public void deleteVehicle() {
		StandardInputRead reader3 = new StandardInputRead();
		String toDelete = reader3.readString("Enter the number plate of the vehicle you want to delete: ");
		VehicleItem vItem = (VehicleItem)vehicles.searchString(toDelete);
		if(vItem==null) {
			System.out.println("Search Error | Vehicle not found | Try again");
		}
		else {
		   vehicles.delete(vItem);
		   System.out.println("Success | Vehicle Deleted");
		}
	}
	
	
	//Search for a specific client and then delete him from the database
	public void deleteClient() {
		StandardInputRead reader3 = new StandardInputRead();
		String toDelete = reader3.readString("Enter the VAT of the client you want to delete: ");
		ClientItem cItem = (ClientItem)clients.searchString(toDelete);
		if(cItem==null) {
			System.out.println("Search Error | Client not found | Try again");
		}
		else {
		   clients.delete(cItem);
		   System.out.println("Success | Client Deleted");
		}
	}
	
	
	//Add new Vehicle in the database method
	
	public void addNewVehicle(){
		System.out.println("\n--------------- New Vehicle Tab ---------------");
		System.out.println("-----------------------------------------------");
		StandardInputRead reader = new StandardInputRead();
		int userOption = 0;
		
		while(userOption>4 || userOption<1) {
			System.out.println("-Choose one category from those given below: ");
			System.out.println("1)  Car");
			System.out.println("2)  Bike");
			System.out.println("3)  Truck");
			System.out.println("4)  Cancel");
			userOption = reader.readPositiveInt("Selection:");			
		}
		
		String NumberPlate, Model, YoM, Kilom;
		float ppd, weidth, height, uLoad;
		int pas, cubic, nod;
		FuelSource fuel;
		BikeType bType;		
		
		switch(userOption) {
		    
		 	case 1: //CAR
		 		NumberPlate =  reader.readString("\nNumber Plate: ");
		 		Model = reader.readString("Brand and Model: ");
	            YoM = reader.readString("Year Of Manufacture: ");
	            Kilom = reader.readString("Kilometers: ");
	            ppd = reader.readPositiveFloat("Price per Day (€): ");
	            pas = reader.readPositiveInt("Max Passengers: ");
	            cubic = reader.readPositiveInt("Cubic capacity(ccm): ");
	            nod = reader.readPositiveInt("Number of doors: ");	
	            fuel = getUserFuelSourceChoice();
	            Vehicle veh = new Car(NumberPlate, Model, YoM, Kilom, ppd, pas, cubic, nod, fuel);
	            vehicles.insert(new VehicleItem (veh));
	            System.out.println("Success | Vehicle added");
			    break;
			case 2: //BIKE
		 		NumberPlate =  reader.readString("\nNumber Plate: ");
		 		Model = reader.readString("Brand and Model: ");
		        YoM = reader.readString("Year Of Manufacture: ");
		        Kilom = reader.readString("Kilometers: ");
		        ppd = reader.readPositiveFloat("Price per Day (€): ");
		        pas = 0;
		        while(pas>2) {
		        pas = reader.readPositiveInt("Max Passengers: ");
		        }
		        cubic = reader.readPositiveInt("Cubic capacity(ccm): ");	
		        bType = getUserBikeTypeChoice();
		        Vehicle veh2 = new Bike(NumberPlate, Model, YoM, Kilom, ppd, pas, cubic, bType);
		        vehicles.insert(new VehicleItem (veh2));
		        System.out.println("Success | Vehicle added");
		        break;
		        
			case 3: //Truck
		 		NumberPlate =  reader.readString("\nNumber Plate: ");
		 		Model = reader.readString("Brand and Model: ");
	            YoM = reader.readString("Year Of Manufacture: ");
	            Kilom = reader.readString("Kilometers: ");
	            ppd = reader.readPositiveFloat("Price per Day (€): ");
	            weidth = reader.readPositiveFloat("Weidth(m): ");
	            height = reader.readPositiveFloat("Height(m): ");
	            uLoad = reader.readPositiveFloat("Usefull Load(kg): ");
	            Vehicle veh3 = new Truck(NumberPlate, Model, YoM, Kilom, ppd, uLoad, weidth, height);
	            vehicles.insert(new VehicleItem (veh3));
	            System.out.println("Success | Vehicle added");
	            break;
	        default:
	        	System.out.println("Process canceled...\n");
		}
	}

	
	//Selecting FUELSOURCE from the enumeration method
	
	public FuelSource getUserFuelSourceChoice(){
		System.out.println("\n---- Fuel Source ----");
		System.out.println("1. Diesel");
		System.out.println("2. Gas");
		System.out.println("3. Battery");
		
		StandardInputRead choice = new StandardInputRead();
		int userChoice = choice.readPositiveInt("Choose a fuel source from the menu above: ");
		switch(userChoice) {
			case 1:
				return FuelSource.Diesel;
			case 2:
				return FuelSource.Gas;
			case 3: 
				return FuelSource.Battery;
			default:
				return null;
		}
	}
	
	//Selecting BIKETYPE from the enumeration method
	public BikeType getUserBikeTypeChoice(){
		System.out.println("\n---- Bike Type ----");
		System.out.println("1. Touring");
		System.out.println("2. Cruiser");
		System.out.println("3. Sport");
		System.out.println("4. ON-OFF");
		
		StandardInputRead choice = new StandardInputRead();
		int userChoice = choice.readPositiveInt("Choose a bike type from the menu above: ");
		switch(userChoice) {
			case 1:
				return BikeType.Touring;
			case 2:
				return BikeType.Cruiser;
			case 3: 
				return BikeType.Sport;
			case 4:
				return BikeType.ON_OFF;
			default:
				return null;
		}
	}
	
	//Add new Client in the database method
	
	public void addNewClient() {
		System.out.println("\n--------------- New Client Tab ---------------");
		System.out.println("-----------------------------------------------");
		StandardInputRead reader = new StandardInputRead();
		int userOption = 0;
		
		while(userOption>3 || userOption<1) {
			System.out.println("-Choose one category from those given below: ");
			System.out.println("1)  Individual");
			System.out.println("2)  Business");
			System.out.println("3)  Cancel");
			userOption = reader.readPositiveInt("Selection: ");			
		}
		
		String name ,vat, phone, city, country;
		float discount;
		
		switch(userOption) {
			case 1: //Individual
			    name = reader.readString("\nName: ");
			    vat = reader.readString("VAT: ");
			    phone = reader.readString("Phone number: ");
			    city = reader.readString("City: ");
			    country = reader.readString("Country of Origin: ");
			    Client cli1 = new Individual(name, vat, phone, city, country);
			    clients.insert(new ClientItem(cli1));
			    System.out.println("Success | Client Added");
			    break;
			case 2: 
				name = reader.readString("\nName: ");
				vat = reader.readString("VAT: ");
			    phone = reader.readString("Phone number: ");
			    city = reader.readString("City: ");
			    country = reader.readString("Country of Origin: ");
			    discount = reader.readPositiveFloat("Agreed Discount Percentage(%): ");
			    Client cli2 = new Business(name, vat, phone, city, country, discount);
			    clients.insert(new ClientItem(cli2));
			    System.out.println("Success | Client Added");
			    break;
			default:
				System.out.println("Process canceled...");
		}
	}
	
	//Add new Rental in the database
	public void addNewRental(int code) {
		
		Client cli;
	    Vehicle veh;
	    
	    Date dos;
	    Date doe;
	    
	    String sDOS;
	    String sDOE;
	    
	    float cost;
	    
	    String clVat=null;
	    String nbrPl=null;
	    
	    StandardInputRead reader = new StandardInputRead();
		System.out.println("\n---------------- New Rental Tab ----------------");
		System.out.println("------------------------------------------------");
		
		while(clVat==null) {
			clVat = reader.readString("Enter the client's VAT: ");
		}
		while(nbrPl==null) {
			nbrPl = reader.readString("Enter the vehicle number plate: ");
		}
		cli = findClient(clVat);
		veh = findVehicle(nbrPl);
		
		if (cli!=null && veh!=null) {
		    System.out.println("\nVehicle: FOUND |  Client: FOUND");
			
			// Check if the user is trying to create a rental with an individual Client and a public use vehicle
			if((cli instanceof project.Client.Individual)&&(veh instanceof project.Vehicle.Car)){
	            int Passengers =  ((Car)veh).getMaxPassengers();
	            if(Passengers>7) {
	           	     System.out.println("The client is type of individual and he can't rent a Public Use vehicle");
	           	     System.exit(0);
	            }
			}		
			System.out.println("\nSuccess | Process continues");
			
			sDOS = reader.readString("\nEnter the date of rental (YYYY-MM-DD): ");
			sDOE = reader.readString("Enter the date of return (YYYY-MM-DD): ");
			 
			dos = StringToDate(sDOS);
			doe = StringToDate(sDOE);
			
			System.out.println("Please wait for date validity test...\n");
			DatePeriod DatesToRent = new DatePeriod(dos, doe);
			
			Rental otherRental = new Rental();
			
			//Getting old rentals to compare date periods and find potential overlaps
			
			otherRental = findVehicleRentals(veh);
			
			Date oldDateRental = otherRental.getDateOfRental();
			Date oldDateReturn = otherRental.getDateOfReturn();
			
			DatePeriod toCheck = new DatePeriod(dos, doe);
			DatePeriod oldPeriod = new DatePeriod(oldDateRental, oldDateReturn);
			
			if(toCheck.overlaps(oldPeriod)) {
				System.out.println("The car is not available for the selected dates please different period");
			}
			else {	
				float Price = veh.getPricePerDay();
				int DaysOfRent = DatesToRent.toDays();
				
				//If the type of client is business calculate cost upon the agreed discount, if not then calculate the cost upon the normal way
				if(cli instanceof project.Client.Business) {
				   float disc = ((Business)cli).getDiscountPercentage();
				   cost = (Price*DaysOfRent)-((Price*DaysOfRent)*(disc/100));
				}
				else {
				   cost = (Price*DaysOfRent);
				}
				Rental rent = new Rental(code, cli, veh, dos, doe, cost);
				rentals.insert(new RentalItem(rent));
				System.out.println("Success | Rental added as below: \n");
				rent.rentalPrint();
			}		
		}
		else {
			System.out.println("Error | Client or Vehicle not found");
		}
	}
	
	// Method to find rentals containing a specific car to check DatePeriod Overlaps
	public Rental findVehicleRentals(Vehicle v) {
		RentalItem rItem = (RentalItem)rentals.searchVehicle(v);	
		if (rItem == null) {
			return null;
		}
		else {
			return (Rental)rItem.getData();
		}
	}
	
	//Method to search for rentals according ClientName;
	public void searchRentalsByClient(String VAT) {
		Client client;
		CompanySortedList clientsCriteria = new CompanySortedList();
				
		if (VAT!=null) {
    		client = findClient(VAT);
    		System.out.println("Client: FOUND");
		}else {
			client = null;
			System.out.println("Error | VAT field is empty");
			return;
		}
		
		if (client != null) {
		   clientsCriteria = rentals.searchClientRentals(client);
		   if(clientsCriteria == null) {
			   System.out.println("Database Error");
			   return;
		   }
		   else {
			   clientsCriteria.print();
		   }
		}	
	}
	
    //Method to search for rentals according to Vehicle VAT
	public void searchRentalsByVehicle(String Plate) {
		Vehicle vehicle;
		CompanySortedList vehiclesCriteria = new CompanySortedList();
		
		if(Plate!=null) {
			vehicle = findVehicle(Plate);
			System.out.println("Vehicle: FOUND");
		}else {
			vehicle = null;
			System.out.println("Error | Number Plate field is empty");
			return;
		}
		
		if (vehicle!= null) {
			vehiclesCriteria = rentals.searchVehicleRentals(vehicle);
			if(vehiclesCriteria == null) {
				System.out.println("Database Error");
				return;
			}
			else {
				vehiclesCriteria.print();
			}
		}
		
	}
	
	//Method to search for rentals according to Date Period
	public void searchRentalsByDatePeriod() {
		CompanySortedList  dateperiodCriteria = new CompanySortedList();
		StandardInputRead reader6 = new StandardInputRead();	
		String dos = reader6.readString("Starting Date (YYYY-MM-DD): ");
		String doe = reader6.readString("Ending Date (YYYY-MM-DD): ");
		
		Date start = StringToDate(dos);
		Date end = StringToDate(doe);
		DatePeriod periodOrigin = new DatePeriod (start,end);
		
		if(periodOrigin!=null) {
			dateperiodCriteria = rentals.searchDatesRentals(periodOrigin);
			if(dateperiodCriteria == null) {
				System.out.println("Database Error");
				return;
			}
			else {
				dateperiodCriteria.print();
			}
		}
	}
	
	//Method used for parsing date from "String" type to "Date" type 
	/** @author DimitrisPetrou */
	public Date StringToDate(String s){
	   Date result = null;
	   try{
	       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	       result  = dateFormat.parse(s);
	   } catch(ParseException e){
	       e.printStackTrace();
	   }
	   return result;
	}	
}