package mpp;

public class Staff extends Person implements IStaff {
	double Salary;
	Staff(){
		super();
		Salary = 0;
	}
	
	Staff(double pSalary){
		super();
		Salary = pSalary;
	}
	
	Staff(String pName, String pPhone, int pAge, double pSalary){
		super(pName, pPhone, pAge, PersonType.Staff);
		Salary = pSalary;
	}
	
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double pSalary) {
		Salary = pSalary;
	}
}