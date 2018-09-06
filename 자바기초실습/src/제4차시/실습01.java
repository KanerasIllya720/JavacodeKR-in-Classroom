package 제4차시;

import java.io.IOException;

public class 실습01 {
	public static void main(String[] args) {
		int bt;
		try {
			bt = System.in.read();
			System.out.print((char)bt);
		}catch(IOException e) {
			System.err.println(e);
		}
	}
}
