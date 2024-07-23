package time;

import java.time.LocalTime;

public class DisplayDateTime {
	public static void main(String [] args) {
		
		Thread thread = new Thread(new Th1());
		Th1 th1 = new Th1();
		thread.start();
	
//		System.out.println(localTime.getHour());
//		System.out.println(localTime.getMinute());
//		System.out.println(localTime.getSecond());
		
		for (int i = 0; i < 10; i++) {
			LocalTime localTime = LocalTime.now();
			System.out.printf("<%d시:%d분:%d초>\n", 
					localTime.getHour(), localTime.getMinute(), localTime.getSecond());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
