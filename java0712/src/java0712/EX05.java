package java0712;

public class EX05 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 85},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double)sum / count;
		System.out.printf("sum: %d\n", sum);
		System.out.printf("avg: %.2f\n", avg);
	}
}
