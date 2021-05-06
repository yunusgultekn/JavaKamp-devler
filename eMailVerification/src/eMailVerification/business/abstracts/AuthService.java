package eMailVerification.business.abstracts;

import eMailVerification.entities.concretes.User;

public interface AuthService {

	void register(User user);
	void login(String eMail,String password);
}
