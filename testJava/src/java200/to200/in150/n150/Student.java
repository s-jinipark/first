package java200.to200.in150.n150;

public class Student implements Cloneable {
	// Cloneable 은 public interface java.lang.Cloneable {} 과 같이
	// 추상 메서드가 없다 -> 마크업 인터페이스 또는 엠티 인터페이스라 함
	private String name;
	private int id;
	private String addr;
	public Student (String name, int id, String addr) {
		this.name = name;
		this.id = id;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String toString() {
		return name + " " + id + " " + addr;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return this;
		}
	}
}
