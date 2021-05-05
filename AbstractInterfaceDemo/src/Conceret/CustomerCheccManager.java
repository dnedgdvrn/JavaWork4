package Conceret;

import Abstract.ICustomerCheckService;

import Entites.Customer;

public class CustomerCheccManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
	return true;
	}



}
