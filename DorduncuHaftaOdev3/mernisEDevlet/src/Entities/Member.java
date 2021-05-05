package Entities;

import java.util.Date;

public class Member {
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String eMail;
	private String nationalityId;
	private Date birthOfDay;
	private String phoneNumber;
	public Member(int id, String firstName, String lastName, String userName, String password, String eMail,
			String nationalityId, Date birthOfDay,String phoneNumber) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.eMail = eMail;
		this.nationalityId = nationalityId;
		this.birthOfDay = birthOfDay;
		this.phoneNumber=phoneNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public Date getBirthOfDay() {
		return birthOfDay;
	}
	public void setBirthOfDay(Date birthOfDay) {
		this.birthOfDay = birthOfDay;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
