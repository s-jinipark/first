package thisJava.chap13.sec06.exam01_generic_wildcard;

public class Course<T> {
	private String name;	// 과정명
	private T[] students;   // T 타입의 배열 선언
	
	public Course(String name, int capacity) {
		this.name = name;
		// students = new T[capacity];
		// 오류 : T가 결정 나지도 않았기 때문에...
		students = (T[]) (new Object[capacity]);
	}

	public String getName() { return name; }
	public T[] getStudents() { return students; }
	public void add(T t) { 	// 비어있는 공간에 저장
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
