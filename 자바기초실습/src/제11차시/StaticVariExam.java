package 제11차시;

public class StaticVariExam {
	public static void main(String[] args) {
		Student kimhn =new Student();
		Student jang =new Student();
		Student bak =new Student();
		System.out.println("생성된 학생 객체 수 는"+Student.count+" 입니다");
	}
}
