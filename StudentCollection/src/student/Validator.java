package student;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Validator {

	public boolean isValidAge(int age) {
		return (age > 5 && age < 200);
	}
	
	public boolean isValidGrade(double grade) {
		return (grade >= 0.0 && grade <= 100.0);
	}
	
	public boolean isValidId(List<Student> studentList, int id) {
		List<Student> filteredStudent= studentList.stream()
				.filter(student -> Objects.equals(id, student.getStudentId()))
				.collect(Collectors.toList());
		
		return (!filteredStudent.isEmpty());
	}
	
	public Student getStudent(List<Student> studentList, int id) {
		List<Student> filteredStudent= studentList.stream()
				.filter(student -> Objects.equals(id, student.getStudentId()))
				.collect(Collectors.toList());
		
		//null check skipped since it will only be called after isValidId
		return filteredStudent.get(0);
	}

}
