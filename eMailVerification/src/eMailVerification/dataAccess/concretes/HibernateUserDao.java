package eMailVerification.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eMailVerification.dataAccess.abstracts.UserDao;
import eMailVerification.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	ArrayList<User> users=new ArrayList<User>();
	
	@Override
	public void add(User user) {   
	    users.add(user);
	    //simülasyon olduðu için yeni bir class oluþturmak istemedim.Ondan dolayý bu katmanda mesajý verdim
	    System.out.println("Doðrulama Tamamlandý");
	}

	@Override
	public void delete(User user) {
		users.remove(user);
	}

	@Override
	public void update(User user) {
			
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
