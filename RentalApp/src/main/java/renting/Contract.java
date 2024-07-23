package renting;

import java.nio.ByteBuffer;
import java.util.UUID;

class Contract {

	public Customer customer;
	public Building building;
	public PaymentMethod paymentMethod;

	public Contract(Customer customer, Building building, PaymentMethod paymentMethod) {
		this.customer = customer;
		this.building = building;
		this.paymentMethod = paymentMethod;

	}

	public static String contractNum() {
		UUID uuid = UUID.randomUUID();
		long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
		return Long.toString(l, Character.MAX_RADIX);
	}

	public String printContract() {
		if (customer.getRentedBuildings() != null) {

			return "Rental Contract " + contractNum() + ":" + "\n" + "Customer name:" + customer.getCustomerName() + ','
					+ " Email:" + customer.getCustomerEmail() + ", Building name:" + building.getBuildingName()
					+ ", Building size: " + building.getSize() + " square meters" + ", RentalPeriod:'"
					+ building.getYear() + "'" + ", Price:" + paymentMethod.getAmount() + "$" + "\n";

		}

		return "No contract as the building is already rented";

	}

}
