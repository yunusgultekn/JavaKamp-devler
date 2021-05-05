package Adapters;

import Abstract.CustomerCheckService;

import java.rmi.RemoteException;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {


	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
	    KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toLowerCase(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}

		return result;
		
	}

}
