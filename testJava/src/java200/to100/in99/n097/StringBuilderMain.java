package java200.to100.in99.n097;

public class StringBuilderMain {
	// 097 문자열 뒤집어 출력하기 2(StringBuilder) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// synchronized 안한 StringBuffer 
		StringBuilder sbu = new StringBuilder();
		
		sbu.append("I")
		  .append(" go")
		  .append(" to the school. ");
		
		System.out.println(sbu);
		
		sbu.replace(7, 11, "");
		System.out.println(sbu);
		
		sbu.reverse();
		System.out.println(sbu);
	}

}
