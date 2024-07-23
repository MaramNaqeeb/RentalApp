package renting;

import java.util.ArrayList;
import java.util.List;

public class Person {
	protected String name;
	protected String email;
	protected List<Building> buildings = new ArrayList<>();

	public Person() {}
	
	public Person(String name,String email) {
		this.name=name;
		this.email=email;
	}

	public void viewBuildings(Building[] buildings) {

		System.out.println("\n" + "Available unrented Buildings: ");
		for (Building b : buildings) {
             if(b.isRented()==false) {
			System.out.println(b);
             }
		}
	}

}
