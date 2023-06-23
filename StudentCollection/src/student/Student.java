package student;

public class Student {

	private int studentId;
	private String studentName;
	private int age;
	private double grade;
	
	//Parameterized constructor
	public Student(int studentId, String studentName, int age, double grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.grade = grade;
	}
	
	//getter setters
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}

}
