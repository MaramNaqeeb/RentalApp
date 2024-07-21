package renting;

import java.util.ArrayList;
import java.util.List;

public class ViewContracts {
	public List<Contract> contracts = new ArrayList<>();

	public void view(Contract[] contracts) {
		System.out.println("\n"+"Contracts list: ");
		for (Contract c : contracts) {
			System.out.println(c.PrintContract());
		}
	}

}
