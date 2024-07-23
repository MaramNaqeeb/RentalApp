package renting;

import java.util.List;

class Customer extends Person {

	public Customer(String name, String email) {
		super(name, email);
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
		return buildings;
	}

	public void printRentedBuildings() {
		System.out.println(buildings.toString() + " rented by: " + name + "\n");
	}

	public void rentBuilding(Building building) {
		if (!building.isRented()) {
			building.rent();
			buildings.add(building);

		} else {
			buildings = null;

		}

	}

	@Override
	public void viewBuildings(Building[] buildings) {

		System.out.println("\n" + "Available Unrented Buildings: ");
		for (Building b : buildings) {
			if (!b.isRented()) {
				System.out.println(b);
			}
		}
	}

	public void viewBuildings() {
		System.out.println("\n" + "My Rented Buildings: ");

		if (this.getRentedBuildings() != null) {
			this.printRentedBuildings();
		}

	}

}
