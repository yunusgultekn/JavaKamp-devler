package ucuncuHaftaOdev;

public class User {
	
	private int id;
	private String name;
	private String email;
	private String surname;
	private String password;
	public User() {
		
	}
	public User(int id, String name, String email, String surname, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.surname = surname;
		this.password = password;
	}

	
	
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
