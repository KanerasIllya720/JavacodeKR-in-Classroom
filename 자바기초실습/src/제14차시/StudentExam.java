package 제14차시;

public class StudentExam {

	public static void main(String[] args) {
		Student kim=new Student("김현우");kim.grade=2;
		Student jang=new Student("장민재",3);
		kim.print();jang.print();
	}

}
