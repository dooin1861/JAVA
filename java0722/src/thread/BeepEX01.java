package thread;

import java.awt.Toolkit;

public class BeepEX01 {
	
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try { 
				Thread.sleep(500); // 500 -> 0.5초
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { 
				Thread.sleep(500); 
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
