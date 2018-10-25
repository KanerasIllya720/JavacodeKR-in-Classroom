package 제15차시;

public class StudentExam {

	public static void main(String[] args) {
		Student kim=new Student("김현우");
		kim.setGrade(2);
		Student jang=new Student("장민재",3);
		System.out.println("학생의 이름은"+kim.getName()+"이고, "+kim.getGrade()+"학년 입니다.");
		System.out.println("학생의 이름은"+jang.getName()+"이고, "+jang.getGrade()+"학년 입니다.");
	}

}
