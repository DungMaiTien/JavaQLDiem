package Quanlydiem;


public class Student extends Person {
	private String ClassID;
	private double Mark;
	private int Khoi;
	public String getClassID() {
		return ClassID;
	}
	public void setClassID(String classID) {
		ClassID = classID;
	}
	public double getMark() {
		return Mark;
	}
	public void setMark(double mark) {
		Mark = mark;
	}
	public int getKhoi() {
		return Khoi;
	}
	public void setKhoi(int khoi) {
		Khoi = khoi;
	}
	public Student(String iD, String name, String classID, double mark, int khoi) {
		super(iD, name);
		ClassID = classID;
		Mark = mark;
		Khoi = khoi;
	}
	public Student() {
		super();
	}
	
	
}