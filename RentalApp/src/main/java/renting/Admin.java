package renting;

public class Admin extends Person {

	public Admin() {

	}

	public Admin(String name, String email) {
		super(name, email);
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

	public void viewRentedBuildings(Customer[] customers) {
		System.out.println("\n" + "Rented Buildings: ");
		for (Customer c : customers) {
			if (c.getRentedBuildings() != null) {
				c.printRentedBuildings();
			}
		}
	}

	public void viewContractsList(Contract[] contracts) {
		System.out.println("\n" + "Contracts list: ");
		for (Contract c : contracts) {
			System.out.println(c.printContract());
		}
	}

}
