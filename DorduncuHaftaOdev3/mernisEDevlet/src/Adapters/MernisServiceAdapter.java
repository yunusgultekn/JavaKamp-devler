package Adapters;

import java.rmi.RemoteException;

import Abstract.CheckService;
import Entities.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckService {

	@Override
	public boolean checkIfRealPerson(Member member) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();
		boolean result=false;
		try { 
			kpsPublic.TCKimlikNoDogrula(Long.parseLong(member.getNationalityId())
					, member.getFirstName().toUpperCase(), member.getLastName().toUpperCase(), member.getBirthOfDay().getYear());
			result=true;
			return result;
		}
		catch (NumberFormatException | RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
		
	}
}
