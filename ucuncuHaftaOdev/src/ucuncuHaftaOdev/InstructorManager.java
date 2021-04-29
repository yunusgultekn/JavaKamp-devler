package ucuncuHaftaOdev;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+" Adlý Eðitmen Sisteme Eklendi");		}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+" Adlý Eðitmen Sistemden Silindi");	
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+" Adlý Eðitmen Sistemden Güncellendi");	
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		System.out.println(" Bütün Eðitmenler Listelendi");
	}

	@Override
	public void getByID(int id) {
		// TODO Auto-generated method stub
		System.out.println(id+"'li  Eðitmen Listelendi");
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+"Adlý Eðitmen Giriþ Yaptý");
	}

	@Override
	public void logout(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+"Adlý Eðitmen Çýkýþ Yaptý");
	}

}
