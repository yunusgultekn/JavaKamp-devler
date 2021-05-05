package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		super.save(customer);		
	}

}
