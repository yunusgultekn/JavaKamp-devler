package mernisValidation;

import java.rmi.RemoteException;
import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;

import Concrete.SturbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager=new SturbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"FATMA GÜL","YILDIRIM",new Date(2001, 11, 13),"00000000000"));


		KPSPublicSoapProxy soapProxy=new KPSPublicSoapProxy();
		boolean result=soapProxy.TCKimlikNoDogrula(
				Long.parseLong("0000000000"),
				"MUHAMMED YUNUS", 
				"GÜLTEKÝN", 
				2001);
		System.out.println(result?"baþarýlý":"baþarýsýz");
	}

}
