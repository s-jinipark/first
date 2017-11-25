package java200.to200.in160.n155;

import java.util.Arrays;

import java200.to200.in160.n155.Student;

public class StudentLexiMain {
	// 155 자바 컬렉션 프레임워크 - Legacy(Vector, Hashtable) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentLexiComparator lc = StudentLexiComparator.getInstance();
		Student[] sg = new Student[7]; 
		
		// 초기화
		sg[0] = new Student("김일일", 101001, "서울");
		sg[1] = new Student("홍길동", 101002, "경기");
		sg[2] = new Student("최삼삼", 101003, "인천");
		sg[3] = new Student("이연연", 101004, "부산");
		sg[4] = new Student("하하하", 101005, "창원");
		sg[5] = new Student("김춘배", 101006, "용인");
		sg[6] = new Student("박정연", 101007, "성남");
		
		System.out.println(" 이름 순 출력 ===============");
		Arrays.sort(sg, lc);
		prints(sg);
	}

	public static void prints (Student[] a) {
		int num = a.length;
		for (int j=0; j<num; j++) {
			System.out.println(a[j]);
		}
		System.out.println();
	}
}
