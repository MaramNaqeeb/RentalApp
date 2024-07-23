package renting;

import java.util.List;

public class BuildingOwner extends Person {

	public BuildingOwner() {
	}

	public BuildingOwner(String name, String email) {
		super(name, email);
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public Building addBuilding(Building building) {
		buildings.add(building);
		return building;

	}

}
