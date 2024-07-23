package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try { 
				Thread.sleep(500); // 500 -> 0.5초
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
