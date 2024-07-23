package thread2;

public class ExMain {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Th1());
		Th1 th1 = new Th1();
		thread.start();  // 쓰레드 실행
		
		for (int i = 0; i <5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
