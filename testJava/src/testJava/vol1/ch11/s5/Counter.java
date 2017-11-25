package testJava.vol1.ch11.s5;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println(no + " ¹ø °´Ã¼ÀÇ finalize() °¡ ½ÇÇà µÊ");	
	}
}
