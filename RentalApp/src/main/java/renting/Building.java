package renting;

public abstract class Building {
	private String address;
	private String name;
	private double size;
	private double price;
	private int year;
	private boolean isRented;

	protected Building(String address, String name, double size, double price, int year) {
		this.address = address;
		this.name = name;
		this.size = size;
		this.price = price;
		this.year = year;
		this.isRented = false;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBuildingName() {
		return name;
	}

	public void setBuildingName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isRented() {
		return isRented; // to check the state
	}

	public void rent() {
		this.isRented = true; // to set a new state
	}
	public String toString() {
		return this.getBuildingName();
	}

}
