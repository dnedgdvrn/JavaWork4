package Abstract;

import Entites.Customer;

public abstract  class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
	System.out.println("Eklendi" + customer.getFirstName());
		
	}

}
