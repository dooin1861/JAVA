package java0710;

public class EX01 {
	public static void main(String[] args) {
		
		String str1 = 10+""; // 꼼수
		String str2 = String.valueOf(10);
		
		int s2 = Integer.parseInt ("100") + 3;
		System.out.println(s2);
		
		String s3 = 3 + "가나다" + 3;
		System.out.println(s3);

		double s4 = Double.parseDouble ("100.34") + 0.3;
		System.out.println(s4);
		
		int x1 = 1;
		int x2 = 3;
		int x3 = x1 / x2;
		System.out.println(x3);
		
		double res1 = (double) x1 / x2; // x1 또는 x2에 double타입을 붙이면 값이 맞게 나온다.
		System.out.println(res1);
		
		float AB1 = (float) (1.5 + 3.4);
		double AB2 = 1.5 + 3.4;
		
		byte a1 = 10;
		byte b2 = 20;
		int c3 = a1 + b2;
		
		int s1 = a1 + b2;
		System.out.println(s1);
		
		byte b1 = -65;
		short c1 = (short) b1;
		System.out.println(c1);
		
		int x = 200;
		byte y = (byte) x;
		System.out.println(y); // int타입이 byte타입보다 더 큰 허용범위라 값 손실.
		
		double d1 = 3.14;
		int z = (int) d1;
		System.out.println(z);
	}
}
