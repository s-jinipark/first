package techOfJava.ch12;

public class NumberMapper<N extends Number> {

	private N numObj;
	

	public NumberMapper(N n) {
		this.numObj= n;
	}
	
	public void setValue(N n) {
		this.numObj= n;
	}
	
	public Double getValueAsDouble() {
		if (this.numObj == null)
			return Double.MIN_VALUE;
		return this.numObj.doubleValue();
	}
	

}
