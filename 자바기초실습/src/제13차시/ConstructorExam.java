package 제13차시;

public class ConstructorExam {
	public static void main(String[] args) {
		Student kim =new Student();
		Student jang =new Student("장민재");
		System.out.println("생성된 학생 객체 수 는"+kim.name+" 입니다");
		System.out.println("생성된 학생 객체 수 는"+jang.name+" 입니다");
	}
}
