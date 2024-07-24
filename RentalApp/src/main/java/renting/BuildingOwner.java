package renting;

import java.util.Objects;

public class BuildingOwner extends Person {
	public BuildingOwner() {
	}

	public BuildingOwner(String name, String email) {
		super(name, email);
	}

	public Building addBuilding(Building building) {
		buildings.add(building);
		return building;

	}

	public void viewRentedBuildings(Customer[] customers) {
		System.out.println("\n" + "Rented Buildings: ");
		for (Customer c : customers) {
			if (c.getBuildings() != null && Objects.equals(this.getName(), this.name));

		}
		System.out.println("Buildings name: " + buildings + ", Owner name: " + this.getName());

	}

	public void viewContractsList(Contract[] contracts) {
		for (Contract c : contracts) {
			if (Objects.equals(c.owner.name, name)) {

				System.out.println(c.printContract());
			}
		}
	}

}
