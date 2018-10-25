package 제15차시;

public class Student {
	private String name;
	private int grade;
	public Student() {}
	public Student(String name) {
		this.name=name;
	}
	public Student(String name,int grade) {
		this(name);
		this.grade=grade;
	}
	public void setName(String name) {this.name=name;}
	public String getName() {return this.name;}
	public void setGrade(int grade) {this.grade=grade;}
	public int getGrade() {return this.grade;}
}
