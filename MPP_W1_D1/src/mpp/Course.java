package mpp;

public class Course {
	String Number;
	String Title;
	int Units;
	Person faculty;
	Course(){
		Number = "";
		Title = "";
		Units = 0;
		faculty = new Faculty();
	}
	
	Course(String pNumber, String pTitle, int pUnits){
		Number = pNumber;
		Title = pTitle;
		Units = pUnits;
		faculty = new Faculty();
	}
	Course(String pNumber, String pTitle, int pUnits, Person pFaculty){
		Number = pNumber;
		Title = pTitle;
		Units = pUnits;
		faculty = pFaculty;
	}
	public String getNumber() {
		return Number;
	}
	public String getTitle() {
		return Title;
	}
	public int getUnits() {
		return Units;
	}
	
	public void setUnits(int pUnits) {
		Units = pUnits;
	}
}
