package Quanlydiem;

public abstract class Person {
	private String ID;
	private String Name;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Person(String iD, String name) {
		super();
		ID = iD;
		Name = name;
	}
	public Person() {
		super();
	}
}