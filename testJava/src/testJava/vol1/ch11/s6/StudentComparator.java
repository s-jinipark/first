package testJava.vol1.ch11.s6;

import java.util.Comparator;

import testJava.vol1.ch11.s6.ComparatorExample.Student;

public class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		if (a.sno < b.sno) return -1;
		else if (a.sno == b.sno) return 0;
		else return 1;
	}
}
