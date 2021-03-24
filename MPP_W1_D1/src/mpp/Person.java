package mpp;

public class Person {
	String name;
	String phone;
	int age;
	PersonType type;
	Person(){
		name = "";
		phone = "";
		age = 0;
		type = null;
	}
	
	Person(String pName, String pPhone, int pAge, PersonType pType){
		name = pName;
		phone = pPhone;
		age = pAge;
		type = pType;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type.toString();
	}
	
	public void setName(String pName) {
		name = pName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String pPhone) {
		name = pPhone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int pAge) {
		age = pAge;
	}
	
	public double getSalary() {
		return 0;
	}
}
