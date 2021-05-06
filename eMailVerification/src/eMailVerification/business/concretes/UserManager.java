package eMailVerification.business.concretes;


import eMailVerification.business.abstracts.UserService;
import eMailVerification.dataAccess.abstracts.UserDao;
import eMailVerification.entities.concretes.User;

public class UserManager implements UserService{

    private UserDao userDao;
    
	public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        for(User userr:userDao.getAll())
        {
            if(user.geteMail()==userr.geteMail())
            {
                System.out.println("Bu mail zaten kullanýlýyor.Baþka bir mail ile kayýt oluþturunuz.");
            return;
            }
        }
        System.out.println("Kaydýnýz baþarýyla alýndý.Üyeliðinizi doðrulamak için "+user.geteMail()+" adlý hesabýnýzý kontrol edin"
                + "\nGönderdiðimiz baðlantýya týklayarak üyeliðinizi tamamlayýn.");
        userDao.add(user);

    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void login(String eMail, String password) {
    for(User user:userDao.getAll())
    {
        if(user.geteMail().equals(eMail)&&user.getPassword().equals(password))
        {
            System.out.println("Sisteme giriþ yapýldý.");
            return;
        }
    }
        System.out.println("Girdiðiniz þifre ve parola eþleþmemektedir.");
    }



}