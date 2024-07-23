package ramda;

public class ExMain {
	public static void main(String[] args) {
		Thread th1 = new Thread(()-> {
			for (int i = 0; i < 5; i++) {
				System.out.println("삐");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		th1.start();
	}
}