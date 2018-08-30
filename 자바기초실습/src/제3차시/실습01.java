package 제3차시;

public class 실습01 {
	public static void main(String[] args) {
		byte a1 = -128, a2 = 127, a3 = 037, a4 = 0x1f, a5 = 0b11111;
		short b1 = -32768, b2 = 32767;
		int c1=-2147483648, c2=2147483647;
		long d1=2147483648L, d2=1L<<63, d3=(1L<<63)-1;
		
		float e=3.14f;
		double f1=3.14,f2=3.14d;
		
		char g1='통';
		char[] h1= {'통','신','과'}, h2= "통신과".toCharArray();
		char h3[]= {'통','신','과'}, h4[]="통신과".toCharArray();
		
		boolean i=true;
		
		System.out.println(a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5);
		System.out.printf("%d, %d\n",b1,b2);
		System.out.printf("%d, %d\n",c1,c2);
		System.out.printf("%d, %d %d\n",d1,d2,d3);
		System.out.printf("%.1f, %.1f, %.1f\n",e,f1,f2);
		System.out.print(g1 + "," + String.valueOf(h1) + "," + String.valueOf(h2) + "," + String.valueOf(h3) + "," + String.valueOf(h4));
		System.out.println();
		System.out.println(i);
	}
}
