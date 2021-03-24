package mpp;

public class StaffStudents extends Students implements IStaff{
	Staff st;
	StaffStudents(){
		super();
		st = new Staff();
	}
	StaffStudents(String pName, String pPhone, int pAge, double pSalary, double pGPA){
		super(pName,pPhone, pAge, pGPA);
		st = new Staff(pName,pPhone, pAge, pSalary);
	}
	public double getSalary() {
		return st.getSalary();
	}
}
