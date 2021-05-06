package eMailVerification;


import eMailVerification.business.abstracts.AuthService;
import eMailVerification.business.concretes.AuthManager;
import eMailVerification.business.concretes.EMailVerificationManager;
import eMailVerification.business.concretes.UserManager;
import eMailVerification.core.GoogleAuthManagerAdapter;
import eMailVerification.core.GoogleAuthService;
import eMailVerification.dataAccess.concretes.HibernateUserDao;
import eMailVerification.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		
		User user=new User(1,"Muhammed Yunus","Gültekin","156482132","myunus.3438@gmail.com");
        User user1=new User(1,"Fatma Gül","Yýldýrým","156482132","fatmagulyildirimce@gmail.com");
        User user2=new User(1,"F","Yýldýrým","1564","fatmagulyildirimce@gmail.com");

        AuthService authService=new AuthManager(new EMailVerificationManager(), new UserManager(new HibernateUserDao()));
        authService.register(user2);
        System.out.println("*************************************");
        authService.register(user);
        System.out.println("*************************************");
        authService.register(user1);
        System.out.println("*************************************");
        authService.login(user.geteMail(), "191");
        System.out.println("*************************************");
        authService.login(user.geteMail(),user.getPassword());
        System.out.println("*************************************");
        GoogleAuthService googleAuthService=new GoogleAuthManagerAdapter();
        googleAuthService.registerToSystem("fatmagulyildirimce@gmail.com", "192837465");
        System.out.println("*************************************");
        googleAuthService.loginToSystem("fatmagulyildirimce@gmail.com", "192837465");
        System.out.println("*************************************");
        googleAuthService.loginToSystem("fatmagulyildirimce@gmail.com", "19465");
        System.out.println("*************************************");
        googleAuthService.registerToSystem("fatmagulyildirimceee@gmail.com", "192837465");
        System.out.println("*************************************");
        googleAuthService.loginToSystem("fatmagulyildirimce@gmail.com", "192837465");
        System.out.println("*************************************");
        googleAuthService.loginToSystem("fatmagulyildirimceee@gmail.com", "1965");
        System.out.println("*************************************");
        googleAuthService.loginToSystem("fatmagulyildirimceee@gmail.com", "192837465");

	}
}
