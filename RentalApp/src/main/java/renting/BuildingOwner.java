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

	public void viewMyBuildings() {
		System.out.println("\n" + "My Buildings: ");

		System.out.println("Owner name: " + this.getName() + ", Buildings name: " + this.getBuildings());

	}

	public void viewContractsList(Contract[] contracts) {
		System.out.println("\n" + "My Contracts list: ");
		for (Contract c : contracts) {
			if (Objects.equals(c.owner.name, this.name)) {

				System.out.println(c.printContract());
			}
		}
	}

}
