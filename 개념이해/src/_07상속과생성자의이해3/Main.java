package _07상속과생성자의이해3;

public class Main {

	public static void main(String[] args) {
		ClassA ca=new ClassA("윤상현",17,"남자",170);
		System.out.println("이름:"+ca.name);
		System.out.println("나이:"+ca.age);
		System.out.println("키:"+ca.height);
		System.out.println("성별:"+ca.getGender());
	}
}
