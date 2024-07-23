package interfaceEX;

public class InterEx {

	public static void main(String[] args) {
		ImpleC impleC = new ImpleC();
		
		InterA ia = impleC;
		ia.methodA();
		
		InterB ib = impleC;
		ib.methodB();
		
		InterC ic = impleC;
		ic.methodC();
		ic.methodB();
		ic.methodA();    

}
