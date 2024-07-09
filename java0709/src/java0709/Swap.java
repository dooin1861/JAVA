package java0709;
/**
 * abcd
 */
public class Swap {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.printf("x=%d, y=%d\n",  x, y);
		swap(x, y);
		}
	
	public static void swap(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("a=%d, b=%d\n", a, b);
	}
	
}
