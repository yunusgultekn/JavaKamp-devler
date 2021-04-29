package ucuncuHaftaOdev;

public class Instructor extends User {

	private int studentCount;
	private String lectureCode;
	public Instructor() {
		
	}
	public Instructor(int id, String name, String surname, String eMail, String password, int studentCount,String lectureCode) {
		super(id, name, surname, eMail, password);
		this.studentCount = studentCount;
		this.lectureCode = lectureCode;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	public String getLectureCode() {
		return lectureCode;
	}
	public void setLectureCode(String lectureCode) {
		this.lectureCode = lectureCode;
	}
}
