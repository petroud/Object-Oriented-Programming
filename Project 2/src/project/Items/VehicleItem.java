package project.Items;

import project.List.Item;
import project.Utilities.DatePeriod;
import project.Vehicle.Vehicle;

public class VehicleItem extends Item {
	private Vehicle vehicle;
	
	
	public VehicleItem(Vehicle veh) {
		this.vehicle = veh;
	}
	
	public Object key() {
		return vehicle.getNumberPlate();
	}
	
	public Object key2() {
		return vehicle.getModel();
	}
	
	public Object key3() {
		return vehicle.getPricePerDay();
	}
	
	public DatePeriod key4() {
		return null;
	}
	public boolean equals(Item it) {
		return key().equals(it.key());
	}
	
	public boolean less(Item it) {
		if (((Integer) key()).compareTo((Integer) it.key()) < 0)
			return true;
		return false;
	}
	
	public String toString() {
		return vehicle.toString();
	}
	
	public void print() {
		vehicle.printVehicle();
	}
	
	public Object getData() {
		return this.vehicle;
	}

}
