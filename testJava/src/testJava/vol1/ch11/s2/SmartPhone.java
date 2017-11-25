package testJava.vol1.ch11.s2;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {	// toString() ¿Á¡§¿«
		return company + ", " + os;
	}
}
