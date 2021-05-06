package eMailVerification.core;
import java.util.ArrayList;
import eMailVerification.registerWithGoogle.GoogleAuthManager;
//Hashmap kullanýmýný pek anlayamadýðýmdan 2 ayrý liste oluþturdum:D
public class GoogleAuthManagerAdapter implements GoogleAuthService{
GoogleAuthManager google=new GoogleAuthManager();
ArrayList<String> mails=new ArrayList<String>() ;
ArrayList<String> passwords=new ArrayList<String>() ;
    @Override
    public void registerToSystem(String eMail, String password) {
    for(int i=0;i<mails.size();i++)
    {
        if(mails.get(i).equals(eMail)&&passwords.get(i).equals(password))
        {
        	System.out.println("Google ile kayýt baþarýsýz.");
            return;
        }
    }
    mails.add(eMail);
    passwords.add(password);
   
    google.register(eMail, password);
    }

    @Override
    public void loginToSystem(String eMail, String password) {
        for(int i=0;i<mails.size();i++)
        {
            if(mails.get(i).equals(eMail)&&passwords.get(i).equals(password))
            {
                google.login(eMail, password);
                return;
            }
        }
    System.out.println("Google ile giriþ baþarýsýz.");
    }

}