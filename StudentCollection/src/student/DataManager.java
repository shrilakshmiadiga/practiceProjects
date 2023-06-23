package student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class DataManager {

	public DataManager() {
		super();
	}

	List<Student> students = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Validator validator = new Validator();

	public DataManager(List<Student> students) {
		super();
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Successfully added");
	}

	public void verifyAndAddStudent() {
		System.out.println("Enter student ID");
		try {
			int id = sc.nextInt();
			if (validator.isValidId(students, id)) {
				System.out.println("ID already exists");
			} else {
				System.out.println("Enter student Name");
				String name = sc.next();
				System.out.println("Enter student age");
				int age = sc.nextInt();
				if (!validator.isValidAge(age))
					System.out.println("Enter valid age. Age must be between 5 and 120");
				else {
					System.out.println("Enter grade");
					double grade = sc.nextDouble();
					if (!validator.isValidGrade(grade))
						System.out.println("Enter valid grade. Grade must be between 0 and 100");
					else
						addStudent(new Student(id, name, age, grade));
				}
			}
		} catch (InputMismatchException ie) {
			System.out.println("Input data types mismatch!!");
		} catch (Exception e) {
			System.out.println("An error occured");
		}
	}

//	public void removeStudent(int id) {
//		if (!validator.isValidId(students, id)) {
//			System.out.println("ID doesn't exists");
//		}
//		else {
//			students.remove(validator.getStudent(students, id));
//			System.out.println("Successfully removed Student");
//		}
//	}

	public void viewStudent() {
		System.out.println("Enter StudentID:");
		try {
			int id = sc.nextInt();
			if (!validator.isValidId(students, id)) {
				System.out.println("ID doesn't exists");
			} else {
				Student student = validator.getStudent(students, id);
				System.out.println("Student ID : " + student.getStudentId());
				System.out.println("Student Name : " + student.getStudentName());
				System.out.println("Student Age : " + student.getAge());
				System.out.println("Student Grade : " + student.getGrade());
				System.out.println("-----------------------------------------");
			}
		} catch (InputMismatchException ie) {
			System.out.println("Input data types mismatch!!");
		} catch (Exception e) {
			System.out.println("An error occured");
		}
	}

	public void calculateAvgGrade() {
		try {
			OptionalDouble average = students.stream().mapToDouble(Student::getGrade).average();
			Double avg = average.isPresent() ? average.getAsDouble() : 0;
			System.out.println("Average is : " + avg);
		} catch (Exception e) {
			System.out.println("An error occured");
		}
	}

}
