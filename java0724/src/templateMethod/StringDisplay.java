package templateMethod;

public class StringDisplay extends AbstractDisplay {
	private String string;
	private int witdh;
	
	public StringDisplay(String string) {
		this.string = string;
		this.witdh = string.length();
	}

	private void printLine() {
		System.out.print("+");
		for(int i=0; i < witdh; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	@Override
	public void open() {
		printLine();
		
	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");
		
	}

	@Override
	public void close() {
		printLine();
	}
	
	
} 
