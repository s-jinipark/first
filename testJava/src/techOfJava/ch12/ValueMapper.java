package techOfJava.ch12;

public class ValueMapper<T> {

	private T t;
	
	public ValueMapper() {
		
	}

	public ValueMapper(T t) {
		this.t= t;
	}
	
	public void setValue(T t) {
		this.t= t;
	}
	
	public T getValue() {
		return this.t;
	}
	
	public String getInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append("Value class name : " ).append(t.getClass().getName());
		return sb.toString();
	}
}
