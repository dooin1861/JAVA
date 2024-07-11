package java0710;

public class Prob01 {
	public static void main(String[] args) {
		int in = 40;
		String score = (in > 90) ? "A":
						(in >= 80) ? "B":
							(in >= 70) ? "C":
								(in >= 60) ? "D" : "F";
		System.out.println(score);
		
	}
}
	
