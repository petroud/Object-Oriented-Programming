package project.Items;

import project.List.Item;
import project.Client.Client;
import project.Utilities.DatePeriod;

public class ClientItem extends Item{

	private Client client;
	
	public ClientItem(Client cl) {
		this.client = cl;
	}
	
	public Object key() {
		return client.getVAT();
	}
	
	public Object key2() {
		return client.getName();
	}
	
	public Object key3() {
		return client.getPhoneNumber();
	}
	
	public DatePeriod key4() {
		return null;
	}
	public boolean equals(Item it) {
		return key().equals(it.key());
	}
	
	public boolean less(Item o) {
		if (((Integer) key()).compareTo((Integer) o.key()) < 0)
			return true;
		return false;

	}
	
	public String toString() {
		return client.toString();
	}
	
	public void print() {
		client.ClientPrint();
	}
	
	public Object getData() {
		return this.client;
	}
}
