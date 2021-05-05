package Conceret;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entites.Customer;

public class Starbaks extends BaseCustomerManager{
	 private ICustomerCheckService _cusCheckService;
	 public Starbaks(ICustomerCheckService _customerCheckService)
	 {
		 this._cusCheckService=_customerCheckService;
	 }
	 
	@Override
public  void save(Customer customer)
{
	if(this._cusCheckService.CheckIfRealPerson(customer))
	{
		super.save(customer);
	}
	else
	{
		System.out.println("not a valid person");
	}
	}
	
}

	

