package ucuncuHaftaOdev;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullanýcý eklendi "+user.getName());
	}
	public void delete(User user) {
		System.out.println("Kullanýcý Silindi "+user.getName());
	}
	public void update(User user) {
		System.out.println("Kullanýcý Güncellendi "+user.getName());
	}
	public void getAll() {
		System.out.println("Kullanýcýlar Listelendi");
	}
	public void getByID(int id) {
		System.out.println(id+"'li kullanýcý listelendi ");
	}
	public void login(User user) {
		System.out.println(user.getName()+" adli kullanýcý giriþ yaptý...");
	}
	public void logout(User user) {
		System.out.println(user.getName()+" Çýkýþ Baþarýyla Yapýldý   ");
	}
}
