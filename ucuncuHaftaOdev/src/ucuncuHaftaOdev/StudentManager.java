package ucuncuHaftaOdev;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		
		System.out.println(user.getName()+" Adlý Öðrenci Sisteme Eklendi");	
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+" Adlý Öðrenci Sistemden Silindi");		}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+" Adlý Öðrenci Sistemden Güncellendi");
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		System.out.println(" Bütün Öðrenciler Listelendi");
	}

	@Override
	public void getByID(int id) {
		// TODO Auto-generated method stub
		System.out.println(id+"'li  Öðrenci Listelendi");
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+"Adlý Öðrenci Giriþ Yaptý");
	}

	@Override
	public void logout(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+"Adlý Öðrenci Çýkýþ Yaptý");
	}

}
