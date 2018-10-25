package 제16차시;

public class Student {
	String name;
	int grade;
	static int count =0;
	public Student() {count++;}
	public static int getCount() {return count;};
}
