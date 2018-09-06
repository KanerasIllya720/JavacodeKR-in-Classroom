package 제4차시;

public class 실습02 {
	public static void main(String[] args) {
		int bt;
		
		try {
			while ((bt = System.in.read()) != -1) {
				System.out.print((char) bt);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
