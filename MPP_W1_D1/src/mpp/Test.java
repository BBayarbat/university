package mpp;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty Moore = new Faculty("Frank Moore", "472-5921", 43, 10000);
		Faculty Howard = new Faculty("Sam Howard", "472-7222", 55, 9500);
		Faculty Doodle = new Faculty("John Doodle", "472-6190", 39, 8600); // 28100

		Students Doe = new Students("John Doe", "472-1121", 22, 4);
		Students Jones = new Students("Mary Jones", "472-7322", 32, 3.88);
		Students Johnson = new Students("Lee Johnson", "472-6009", 19, 3.65);

		Staff Gore = new Staff("Frank Gore", "472-3321", 33, 4050);
		Staff Davis = new Staff("Adam Davis", "472-7552", 50, 5500);
		Staff heck = new Staff("David heck", "472-8890", 29, 3600); // 13150 -- 41250

		// Courses
		Course CS201 = new Course("CS201", "Programming 1", 4);
		Course CS360 = new Course("CS360", "Databases", 3);
		Course CS404 = new Course("CS404", "Compilers", 4);
		Course CS240 = new Course("CS240", "Data structures", 2);
		Course CS301 = new Course("CS301", "Software Engineering", 3);
		Course CS450 = new Course("CS450", "Advanced Architecture", 5);

		// Faculties
		Doodle.addCourse(CS201);
		Doodle.addCourse(CS404);
		Doodle.addCourse(CS240);

		Howard.addCourse(CS360);
		Howard.addCourse(CS301);

		Moore.addCourse(CS450);

		// Students
		Doe.addCourse(CS201);
		Doe.addCourse(CS360);
		Doe.addCourse(CS404);
		Doe.addCourse(CS301);

		Jones.addCourse(CS201);
		Jones.addCourse(CS404);
		Jones.addCourse(CS450);

		Johnson.addCourse(CS201);
		Johnson.addCourse(CS360);
		Johnson.addCourse(CS240);
		Johnson.addCourse(CS450);

		StaffStudents st1 = new StaffStudents("CHULUUN YURA","940-0909",32, 8000, 3.5);
		StaffStudents st2 = new StaffStudents("IRMUUN BAYARBAT","940-0907",5, 7000, 3.8);
		
		// Department
		Department dept = new Department("Computer science");

		dept.addMember(Moore);
		dept.addMember(Howard);
		dept.addMember(Doodle);

		dept.addMember(Doe);
		dept.addMember(Jones);
		dept.addMember(Johnson);

		dept.addMember(Gore);
		dept.addMember(Davis);
		dept.addMember(heck);

		dept.addMember(st1);
		dept.addMember(st2);
		System.out.println("Total salary : " + dept.getTotalSalary() + " salary2 : " + dept.getTotalSalary2());
		dept.showAllMembers();
		dept.unitsPerFaculty();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter faculty name:");
		String tempFaculty = sc.nextLine();
		dept.findStudentsByFaculty(tempFaculty);
	}

}
