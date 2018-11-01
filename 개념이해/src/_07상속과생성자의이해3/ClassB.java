package _07상속과생성자의이해3;

public class ClassB {
	private String gender;
	int height;
	ClassB(){}
	ClassB(int h){
		this.height=h;
	}
	ClassB(String g){
		this.gender=g;
	}
	String getGender() {
		return gender;
	}
}
