package java200.to200.in160.n155;

public class Student implements Cloneable {

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
	
	// 155 Ãß°¡
	public boolean equals(Object obj) {
		boolean isE = false;
		Student temp = (Student) obj;
		if (temp.getName().equals(name) && temp.getId()==id 
				&& temp.getAddr().equals(addr) ) {
			isE = true;
		}
		return isE;
	}
	
	public int hashCode() {
		int temp = 0;
		temp = name.hashCode()+addr.hashCode()+id+37;
		return temp;
	}
	
}
