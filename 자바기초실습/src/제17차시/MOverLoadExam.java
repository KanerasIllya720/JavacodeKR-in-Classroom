package 제17차시;

public class MOverLoadExam {
	public static void main(String[] args) {
		Add a=new Add();
		System.out.println(a.sum("선린","인터넷"));
		System.out.println(a.sum(10, 20));
	}
}
