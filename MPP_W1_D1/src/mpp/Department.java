package mpp;

import java.util.ArrayList;
import java.util.List;

public class Department {
	String name;
	List<Person> members;

	Department() {
		name = "";
		members = new ArrayList<Person>();
	}

	Department(String pName) {
		name = pName;
		members = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		name = pName;
	}

	public void addMember(Person p) {
		members.add(p);
	}

	public void addPerson(Person p) {
		members.add(p);
	}
	public double getTotalSalary() {
		double totalSalary = 0;
		for (Person p : members) {
			if (p instanceof Staff) {
				totalSalary += ((Staff) p).getSalary();
			} else if (p instanceof Faculty) {
				totalSalary += ((Faculty) p).getSalary();
			}else if (p instanceof StaffStudents) {
				totalSalary += ((StaffStudents) p).getSalary();
			}
		}
		return totalSalary;
	}

	public double getTotalSalary2() {
		double totalSalary = 0;
		for (Person p : members) {
			totalSalary += p.getSalary();
		}
		return totalSalary;
	}

	public void showAllMembers() {
		for (Person p : members) {
			System.out.println(name + " - " + p.getName() + "(" + p.getType() + ")" + " phone: " + p.getPhone()
					+ " age: " + p.getAge());

		}
	}

	public void unitsPerFaculty() {
		for (Person p : members) {
			if (p instanceof Faculty) {
				System.out.println(p.getName() + " totalUnits: " + ((Faculty) p).getTotalUnits());
			}
			if (p.getClass().getSimpleName().equals("Faculty")) {
				System.out.println("SimpleName " + p.getName() + " totalUnits: " + ((Faculty) p).getTotalUnits());
			}
		}
	}
	
	//The program asks for the name of a faculty member, 
	//and the program prints out the names of all students who take classes that are taught by this faculty member.
	
	public void findStudentsByFaculty(String pFaculty) {
		List<Course> facultyCourses = new ArrayList<Course>();
		List<Course> studentCourses = new ArrayList<Course>();
		for(Person p: members) {
			if(p instanceof Faculty && p.getName().equals(pFaculty)) {
				facultyCourses = ((Faculty) p).getCourses();
				break;
			}
		}
		for(Course c: facultyCourses) {
			System.out.println("Course : " + c.getTitle() + " -------------");
			for(Person p: members) {
				if(p instanceof Students) {
					studentCourses = ((Students) p).getCourses();
					for(Course c1: studentCourses) {
						if(c.getNumber().equals(c1.getNumber())) {
							System.out.println("Student : " + p.getName());
							break;
						}
					}
				}
			}
		}
	}
}
