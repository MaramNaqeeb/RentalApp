package renting;

class Contract {

	public Customer customer;
	public Building building;
	public PaymentMethod paymentMethod;
	public static int counter = 1;

	public Contract(Customer customer, Building building, PaymentMethod paymentMethod) {
		this.customer = customer;
		this.building = building;
		this.paymentMethod = paymentMethod;

	}

	public static int contractNum() {
		return counter++;
	}

	public String PrintContract() {
		if (customer.getRentedBuildings() != null) {

			return "Rental Contract " + contractNum() + ":" + "\n" + "Customer name:" + customer.getCustomerName() + ','
					+ " Email:" + customer.getCustomerEmail() + ", Building name:" + building.getBuildingName()
					+ ", Building size: " + building.getSize() + " square meters" + ", RentalPeriod:'"
					+ building.getYear() + "'" + ", Price:" + paymentMethod.getAmount() + "$" + "\n";

		}

		return "No contract as the building is already rented";

	}
}
