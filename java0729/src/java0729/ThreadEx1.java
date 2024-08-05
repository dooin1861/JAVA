package java0729;

public class ThreadEx1 {

	public static void main(String[] args) {
		Thread mThread = Thread.currentThread();
		System.out.println(mThread.getName());
		
		ThreadEx2 threadEx2 = new ThreadEx2();
		threadEx2.start();

		
		// 익명 객체 구현
		Thread threadB = new Thread() {
			
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println(this.getName());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		threadB.setName("ThreadB");
		threadB.start();
		
		// Runnable 구현
//		Thread threadC = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 2; i++) {
//					System.out.println(this.getName());
//				}
//			}
//		});
	}
}
