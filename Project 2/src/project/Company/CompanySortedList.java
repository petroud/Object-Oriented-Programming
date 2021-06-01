package project.Company;

import project.List.Item;
import project.List.Node;
import project.List.EnhancedSortedList;
import project.Client.Client;
import project.Vehicle.Vehicle;
import project.Utilities.DatePeriod;

public class CompanySortedList extends EnhancedSortedList {
	
	public CompanySortedList() {
		super();
	}
	
	public Item search(int key){
		Node tmpNode = head;
		while (tmpNode != null){
			if (tmpNode.getValue().key().equals(new Integer(key))){
				return tmpNode.getValue();
			}
			tmpNode = tmpNode.getNext();
		}
		return null;
	}
	
	public void printAllInHierarchy(String className){
		Node tmp = head;
		try{
			while (tmp!=null){
				Item item = tmp.getValue();				
				if (Class.forName(className).isInstance(item.getData())){
					item.print();
				}
				tmp = tmp.getNext();
			}
		}catch (ClassNotFoundException ex){
			System.out.println("Class '"+className+"' does not exist!");
		}		
	}
	
	
	/** @author DimitrisPetrou */
	//Search by String key method used for linking objects to rentals
	public Item searchString(String key){
		Node tmpNode = head;
		while (tmpNode != null){
			if (tmpNode.getValue().key().equals(new String(key))){
				return tmpNode.getValue();
			}
			tmpNode = tmpNode.getNext();
		}
		return null;
	}
	
	
	/** @author DimitrisPetrou*/
	//Search by Vehicle key method used for finding old rentals of a specific car	
	public Item searchVehicle(Vehicle veh) {
		Node tmpNode = head;
		while (tmpNode != null) {
			if(tmpNode.getValue().key2().equals(veh)) {
				return tmpNode.getValue();
			}
			tmpNode = tmpNode.getNext();
		}
		return null;
	}
	
	/** @author DimitrisPetrou*/
	//Search by Client key method used for finding old rentals of a specific client and keeping track of them in a sorted list
	public CompanySortedList searchClientRentals(Client cli) {
		Node tmpNode = head;
		int meter = 0;
		CompanySortedList criteriaClient = new CompanySortedList();
		while (tmpNode != null) {
			if(tmpNode.getValue().key3().equals(cli)) {
				criteriaClient.insert(tmpNode.getValue());
				meter++;
			}
			tmpNode = tmpNode.getNext();
		}
		System.out.println("\n"+meter+" Rentals found for this specific Client: ");
		return criteriaClient;
	}
	
	/** @author DimitrisPetrou*/
	//Search by Vehicle key method used for finding old rentals of a specific vehicle and keeping track of them in a sorted list
	public CompanySortedList searchVehicleRentals(Vehicle veh) {
		Node tmpNode = head;
		int meter = 0;
		CompanySortedList criteriaVehicle = new CompanySortedList();
		while (tmpNode != null) {
			if(tmpNode.getValue().key2().equals(veh)) {
				criteriaVehicle.insert(tmpNode.getValue());
				meter++;
			}
			tmpNode = tmpNode.getNext();
		}
		System.out.println("\n"+meter+" Rentals found for this specific Vehicle: ");
		return criteriaVehicle;
	}
	
	/** @author DimitrisPetrou*/
	//Search by DatePeriod key method used for finding old rentals of a specific date period and keeping track of them in a sorted list
	public CompanySortedList searchDatesRentals(DatePeriod per) {
		Node tmpNode = head;
		int meter = 0;
		CompanySortedList criteriaPeriod = new CompanySortedList();
		while (tmpNode != null) {
			if(tmpNode.getValue().key4().overlaps(per)) {
				criteriaPeriod.insert(tmpNode.getValue());
				meter++;
			}
			tmpNode = tmpNode.getNext();
		}
		System.out.println("\n"+meter+" Rental/s found for this specific period of dates: ");
		return criteriaPeriod;
	}



}
