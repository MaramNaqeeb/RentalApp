package renting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentalAppApplication.class, args);

		Building apartment = new Apartment("87 rdt St", "White Apartments", 200, 1000, 2003);
		Building house = new House("965 Sun St", "Holiday House", 300, 2800, 2008);
		Building shop = new Shop("563 Noe St", "Book Shop", 500, 800, 2005);

		Customer customer1 = new Customer("Liam Thomas", "liam.Thom@gmail.com");
		Customer customer2 = new Customer("James Charlie", "James.char@gmail.com");
		Customer customer3 = new Customer("Sophie	Jones", "Sophie.j@gmail.com");

		customer1.rentBuilding(apartment);
		customer1.rentBuilding(shop);
		customer2.rentBuilding(house);
		customer3.rentBuilding(apartment);
		Customer customers[]= {customer1,customer2,customer3};
		
		ViewRentedBuildings vr= new ViewRentedBuildings();
		vr.viewRentedBuildings(customers);

		PaymentMethod paymentMethod1 = new PayPal(customer1.getCustomerEmail());
		PaymentMethod paymentMethod2 = new MasterCard("5361 7890 2987 0651");
		PaymentMethod paymentMethod3 = new Visa("1389 8326 0152 8953");
		PaymentMethod paymentMethod4 = new PayPal(customer3.getCustomerEmail());

		paymentMethod1.pay(1000);
		paymentMethod2.pay(800);
		paymentMethod3.pay(2800);
		paymentMethod4.pay(1000);

		Contract contract1 = new Contract(customer1, apartment, paymentMethod1);
		Contract contract2 = new Contract(customer1, shop, paymentMethod2);
		Contract contract3 = new Contract(customer2, house, paymentMethod3);
		Contract contract4 = new Contract(customer3, apartment, paymentMethod4);

		Contract contracts[] = { contract1, contract2, contract3, contract4 };

		ViewContracts v = new ViewContracts();
		v.view(contracts);

	}

}
