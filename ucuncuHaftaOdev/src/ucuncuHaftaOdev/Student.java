package ucuncuHaftaOdev;

public class Student extends User{

	private String contactPhoneNumber;
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
	public Student(int id, String name, String email, String surname, String password, String contactPhoneNumber,
			String address) {
		super(id, name, email, surname, password);
		this.contactPhoneNumber = contactPhoneNumber;
		this.address = address;
	}
	public Student() {
		
	}
}
