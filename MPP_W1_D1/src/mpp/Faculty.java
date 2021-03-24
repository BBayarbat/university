package mpp;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
	double Salary;
	List<Course> Courses;
	
	Faculty(){
		super();
		Salary = 0;
		Courses = new ArrayList<>();
	}
	Faculty(String pName, String pPhone, int pAge, double pSalary){
		super(pName, pPhone, pAge, PersonType.Faculty);
		Salary = pSalary;
		Courses = new ArrayList<>();
	}
	Faculty(double pSalary){
		super();
		Salary = pSalary;
		Courses = new ArrayList<>();
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double pSalary) {
		Salary = pSalary;
	}
	public void addCourse(Course c) {
		Courses.add(c);
	}
	
	public List<Course> getCourses(){
		return Courses;
	}
	public double getTotalUnits() {
		double totalUnits = 0;
		for(Course c : Courses) {
			totalUnits += c.getUnits();
		}
		return totalUnits;
	}
}
