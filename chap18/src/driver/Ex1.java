package driver;

import mvc.command.CommandHandler;

class Gb {
	void disp () {
		System.out.println("프린트 Gb");
	}
}

public class Ex1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
	Class<?> handlerClass = Class.forName("driver.Gb");
    Object handlerInstance = handlerClass.newInstance();
    Gb gb = (Gb) handlerInstance;
    gb.disp();
	}
}
