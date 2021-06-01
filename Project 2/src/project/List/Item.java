package project.List;
import project.Utilities.DatePeriod;

public abstract class Item {
	
	abstract public boolean equals(Item k);

	abstract public boolean less(Item k);

	abstract public Object key();
	
	abstract public Object key2();
	
	abstract public Object key3();
	
	abstract public DatePeriod key4(); //datePeriod returning method for the criteria search, works only for RentalItems

	abstract public void print();
	
	abstract public Object getData();
}