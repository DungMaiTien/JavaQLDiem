package Quanlydiem;


public class Student extends Person {
	private String ClassID;
	private double Mark;
	private int Khoi;
	private String HanhKiem;


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
	public String getHanhKiem() {
		return HanhKiem;
	}
	public void setHanhKiem(String hanhKiem) {
		HanhKiem = hanhKiem;
	}
	
	public Student(String iD, String name, String classID, double mark, int khoi, String hanhKiem) {
		super(iD, name);
		ClassID = classID;
		Mark = mark;
		Khoi = khoi;
		HanhKiem = hanhKiem;
	}
	
	public Student() {
		super();
	}
	public String Xeploai()
	{
		if(Mark >=9) return("Xuất sắc"); 
		else if(Mark >=8) return("Giỏi"); 
		else if(Mark >=7) return("Khá"); 
		else if(Mark >=5) return("Trung Bình");
		else 
			return("Kém");
	}
}