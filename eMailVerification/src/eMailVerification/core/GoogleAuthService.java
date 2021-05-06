package eMailVerification.core;

public interface GoogleAuthService {
	
	void registerToSystem(String eMail,String password);
	void loginToSystem(String eMail,String password);

}
