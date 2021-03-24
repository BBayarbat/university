package mpp;

import java.util.ArrayList;
import java.util.List;

public class Students extends Person {
	double GPA;
	List<Course> Courses;
	
	Students(){
		super();
		GPA = 0;
		Courses = new ArrayList<>();
	}
	
	Students(String pName, String pPhone, int pAge, double pGPA){
		super(pName, pPhone, pAge, PersonType.Student);
		GPA = pGPA;
		Courses = new ArrayList<>();
	}
	
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double pGPA) {
		GPA = pGPA;
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
	
	public double getSalary() {
		return 0;
	}
}