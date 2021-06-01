package project.Items;

import project.Company.Rental;
import project.List.Item;
import project.Utilities.DatePeriod;

public class RentalItem extends Item {
	
	private Rental rental;
   
	public RentalItem(Rental ren) {
		this.rental = ren;
	}
	
	public Object key() {
		return rental.getPeriod();
	}
	
	public Object key2() {
		return rental.getVehicle();
	}
	
	public Object key3() {
		return rental.getClient();
	}
	
	public DatePeriod key4() {
		return rental.getPeriod();
	}
	
	public boolean equals(Item o) {
		return key().equals(o.key());
	}
	
	public boolean less(Item o) {
		if (((Integer) key()).compareTo((Integer) o.key()) < 0)
			return true;
		return false;

	}
	
	public String toString() {
		return rental.toString();
	}
	
	public void print() {
		rental.rentalPrint();
	}
	
	public Object getData() {
		return this.rental;
	}
	
	

}
