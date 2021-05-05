package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager {
	

	private CustomerCheckService _customerCheckService;
	
	public SturbucksCustomerManager(CustomerCheckService customerCheckService) {
		this._customerCheckService=customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if(_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);	
		}
		else {
			System.out.println("Not a valid person");	
		}
		
	}
	
}
