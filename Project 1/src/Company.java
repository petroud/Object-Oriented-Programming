import java.util.Vector;
import java.util.Scanner;
import tuc.ece.cs102.util.StandardInputRead;
import java.util.Date;
import java.lang.Math;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Company {
	private String BrandName;
	private float VAT;
	private String Location;
	
	/*Company's Cars Data*/
	private Vector<Car> listOfCars;
	
	/*Company's Clients Data*/
	private Vector<Client> listOfClients;
	
	/*Company's Rentals Data*/
	private Vector<Rental> listOfRentals;
	
	
	/*********************** Class Constructors ************************/
	
	public Company(){
		listOfCars = new Vector<Car>(); 
		listOfClients = new Vector<Client>();
		listOfRentals = new Vector<Rental>();
	}
	
	public Company(String BDN, float VT, String LOC) {
		BrandName = BDN;
		VAT = VT;
		Location = LOC;
		listOfCars = new Vector<Car>();
		listOfClients = new Vector<Client>();
		listOfRentals = new Vector<Rental>();
	}
	
	//
	//
	//
	//
	/*******Getters for the variables********/	
	

	public String getBrandName() {
		return BrandName;
	}

	public float getVAT() {
		return VAT;
	}

	public String getLocation() {
		return Location;
	}

	public Vector<Car> getListOfCars() {
		return listOfCars;
	}

	public Vector<Client> getListOfClients() {
		return listOfClients;
	}

	public Vector<Rental> getListOfRentals() {
		return listOfRentals;
	}
	
	 /*-------End of Getters-------*/
	
	//
	//
	//
	//
	/*******Setters for the variables********/	

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public void setVAT(float vAT) {
		VAT = vAT;
	}

	public void setLocation(String location) {
		Location = location;
	}
	
	/*---------End of Setters----------*/
	
	//---------------------Methods for adding objects in vectors-----------------------//
	
	public void addClient(Client C) {
		listOfClients.add(C);
	}
	
	public void addCar(Car cr) {
		listOfCars.add(cr);
	}
	
	public void addRental(Rental r) {
		listOfRentals.add(r);
	}
	
	
	
	//---------------------Method for creating New Rental----------------------//
	public void addNewRental(Client Clnt, Car car) {
		StandardInputRead reader = new StandardInputRead();
		if (Clnt!=null && car!=null) {
			System.out.println("Everything's okay, CAR: Found / CLIENT: Found, process continues");
			
			Rental searchPrevious = new Rental(); 
			searchPrevious = findRentalByCar(car); //Searching previous rentals to compare the dates with
			Date existingRentalDate = searchPrevious.getDateOfRental();
			Date existingReturnDate = searchPrevious.getDateOfReturn();
			DatePeriod PeriodExistingRental = new DatePeriod(existingRentalDate, existingReturnDate);
			
			String dateOfRent = reader.readString("What's the date of Rental? (YYYY-MM-DD) : ");		//Getting from the user the Date of Rental
			String dateOfRetu = reader.readString("What's the date of Return? (YYYY-MM-DD) : ");       //and the Date of Rent
			
			Date dateOfRental = StringToDate(dateOfRent);
			Date dateOfReturn = StringToDate(dateOfRetu);
			
			DatePeriod PeriodToCheck = new DatePeriod(dateOfRental, dateOfReturn);
			Rental rentalNew = new Rental();
					
			int daysOfRent = PeriodToCheck.toDays();
								
			if(PeriodToCheck.overlaps(PeriodExistingRental)) { 
				System.out.println("The car is not available in the selected dates. Please try a different date period...");
				return;
			}
			else {	
				//long Days = betweenDates(dateOfRental, dateOfReturn);
				float finalCost = car.getPricePerDay()*daysOfRent;
				StandardInputRead reader2 = new StandardInputRead();
				float discount = reader2.readPositiveFloat("Give percentage of discount(%): ");				
                
				finalCost = (finalCost)-(finalCost)*(discount/100);
				
				
                System.out.println("Total Cost of the Rental: " +finalCost+ "€"+"\nRental Added Successfuly");
                rentalNew.setCode(getCodeWithinRange(111, 199)); //assigning random number to code from 110-199
                rentalNew.setTotalCost(finalCost);
                rentalNew.setDateOfRental(dateOfRental);
                rentalNew.setDateOfReturn(dateOfReturn);
                rentalNew.setClient(Clnt);
                rentalNew.setCar(car);
                addRental(rentalNew);
			}
		}
		
		else {
			System.out.println("Error: Undefined Client or Car! Please try again!");
		}
	}
	
	//---------------------Method for adding New Client-----------------------//
	public void addNewClient() {
		
		StandardInputRead reader = new StandardInputRead();
		
		System.out.println("Please enter below client's personal data as asked: ");
		
		String firstName = reader.readString("First Name: ");
		
		String lastName = reader.readString("Last Name: ");
		
		String licnNumber = reader.readString("License Number: ");
		
		int YearsOfExpr = reader.readPositiveInt("Years of Experience: ");
		
		String Country = reader.readString("Country of Origin: ");
		
		addClient(new Client (firstName, lastName, licnNumber, YearsOfExpr, Country));		
	    
		System.out.print("\nSuccess! Client added.");
	}
	
	public Client findClientByLicense(String license) {
		for (int i=0; i<this.listOfClients.size(); i++) {
			Client clnt = this.listOfClients.get(i);
			if(clnt.getClientLicense().equals(license)) {
				return clnt;
			}
		}
		return null;
	}
	
	public Car findCarByNumberPlate(String nbrPlt) {
		for(int i=0; i<this.listOfCars.size(); i++) {
			Car car = this.listOfCars.get(i);
			if(car.getCarNumberPlate().equals(nbrPlt)) {
				return car;
			}
		}
		return null;
	}
	
	public Rental findRentalByCar(Car c) {
		for (int i=0; i<this.listOfRentals.size(); i++) {
			Rental rentCheck = this.listOfRentals.get(i);
			if(rentCheck.getCar().equals(c)){
				return rentCheck;
			}
		}
		return null;
		
	}
	
	//---------------------Method for adding New Car---------------------//
	
	public void addNewCar() {
		
		Features F1, F2, F3;		 
		Scanner userInput1 = new Scanner(System.in);
		
		System.out.println("Please enter below car's data as asked: ");
		System.out.print("\nBrand and Model: ");
		String bAndM = userInput1.nextLine();
		
		System.out.print("\nNumber Plate: ");
		String nbrPl = userInput1.nextLine();
		
		System.out.print("\nYear of manufacture: ");
		int yOfMan = userInput1.nextInt();
	
		StandardInputRead reader = new StandardInputRead();
        float Consum = reader.readPositiveFloat("\nConsumption(L) per 100km: ");
		
		System.out.print("\nKilometers: ");
		float kilm = userInput1.nextFloat();
		
		System.out.print("\nPrice per Day: ");
		float PpDay = userInput1.nextFloat();
		
		System.out.print("\nPlease choose three features from the following: ");
		printFeatures(); // Printing the menu that user chooses from
		System.out.print("\nIf you are satisfied with less than 3 features hit 0 for input"); // User is not obliged to fill in every feature
		
		System.out.print("\nFeature 1: ");
		int choice1 = userInput1.nextInt(); // Getting user choice and in the next line it's given to getUserFeatureChoice as argument
		F1 = getUserFeatureChoice(choice1); // The method returns the preferred feature from the menu printFeatures
		
		System.out.print("\nFeature 2: ");
		int choice2 = userInput1.nextInt(); // ->>-
		F2 = getUserFeatureChoice(choice2); // ->>-
		
		System.out.print("\nFeature 3: ");
		int choice3 = userInput1.nextInt(); // ->>-
		F3 = getUserFeatureChoice(choice3); // ->>-
			
		addCar(new Car(bAndM, nbrPl, yOfMan, Consum, kilm, PpDay, F1, F2, F3));
		
		userInput1.close();
		
		System.out.print("\nSuccess! Car added.");
	}	
	
	
	//-----------Method to print the available features-----------//
	
	public void printFeatures() {
		System.out.println("1.Hybrid");
		System.out.println("2.Seven Seat");
		System.out.println("3.Air Condition");
		System.out.println("4.Leather Seats");
		System.out.println("5.Four Wheel Drive");
		System.out.println("6.Diesel");
		System.out.println("7.Cabriolet");
		System.out.println("8.Automatic");
	}
	
	//--------------Method to return features according to user choice----------------//
	/*It takes as an input user choice according to the menu in printFeatures method and it returns the correct feature from the enumeration*/
	
	public Features getUserFeatureChoice(int choice){
		switch(choice) {
		
		case 1:
			return Features.Hybrid;
		case 2:
			return Features.SevenSeat;
		case 3: 
			return Features.Air_Condition;
		case 4:
			return Features.Leather_Seats;
		case 5:
			return Features.Four_Wheel_Drive;
		case 6:
			return Features.Diesel;
		case 7:
			return Features.Cabriolet;
		case 8:
			return Features.Automatic;
		default:
			return null;
		}
		
	}
	
	//Method for printing all Clients in the database//
	
	public void printListOfClients() {
		for (int i=0; i<this.listOfClients.size(); i++) {
			this.listOfClients.get(i).ClientPrint();
		}
	}
	
	//Method for printing all Cars in the database//
	
	public void printListOfCars() {
		for (int i=0; i<this.listOfCars.size(); i++) {
			this.listOfCars.get(i).CarPrint();
		}
	}
	
	//Method for printing all Rentals in the database//
	
	public void printListOfRentals() {
		for (int i=0; i<this.listOfRentals.size(); i++) {
			this.listOfRentals.get(i).RentalPrint();
		}
	}
	
	//-----------------Method Used to print rentals containing a specific client----------------------//

    public void findRentalByLicense(Client c) {
        for(int i=0;i<this.listOfRentals.size();i++) {
           Rental l = this.listOfRentals.get(i);
           if(l.getClient().equals(c)){
              this.listOfRentals.get(i).RentalPrint();
           }
        }
    }
    
    //------------------Method used to print rentals containing a specific car ---------------------//
	
    public void findRentalByNumberPlate(Car c) {
        for(int i=0;i<this.listOfRentals.size();i++) {
           Rental l = this.listOfRentals.get(i);
           if(l.getCar().equals(c)){
              this.listOfRentals.get(i).RentalPrint();
           }
        }
    }
    
    public void findRentalByDatePeriod(DatePeriod p) {
    	 for(int i=0;i<this.listOfRentals.size();i++) {
            Rental r = this.listOfRentals.get(i);
            if(r.convertToDatePeriod(r).equals(p)) {
              this.listOfRentals.get(i).RentalPrint();
             }
         }
    }
    

    public static int getCodeWithinRange(double min, double max){
          double x = (int)(Math.random()*((max-min)+1))+min;
          int y =(int)x;
          return y;
    }
    
    public Date StringToDate(String s){

    	   Date result = null;
    	   try{
    	       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	       result  = dateFormat.parse(s);
    	   }

    	   catch(ParseException e){
    	       e.printStackTrace();

    	   }
    	   return result ;
    }
   
}


