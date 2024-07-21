package renting;

import java.util.ArrayList;
import java.util.List;

class Customer {
	private String name;
	private String email;
	private List<Building> rentedBuildings = new ArrayList<>();

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getCustomerName() {
		return name;
	}

	public void setCustomerName(String name) {
		this.name = name;
	}

	public String getCustomerEmail() {
		return email;
	}

	public void setCustomerEmail(String email) {
		this.email = email;
	}

	public List<Building> getRentedBuildings() {
		return rentedBuildings;
	}

	public void printRentedBuildings() {
		System.out.println(rentedBuildings.toString()+" rented by: "+name+"\n");
	}

	public void rentBuilding(Building building) {
		if (!building.isRented()) {
			building.rent();
			rentedBuildings.add(building);

		} else {
			rentedBuildings = null;

		}

	}

}
