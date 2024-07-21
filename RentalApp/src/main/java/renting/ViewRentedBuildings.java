package renting;

import java.util.ArrayList;
import java.util.List;

public class ViewRentedBuildings {

	public List<Customer> customers = new ArrayList<>();

	public void viewRentedBuildings(Customer[] customers) {
		System.out.println("\n"+"Rented Buildings: ");
		for (Customer c : customers) {
			if (c.getRentedBuildings() != null) {
				c.printRentedBuildings();
			}
		}
	}

}
