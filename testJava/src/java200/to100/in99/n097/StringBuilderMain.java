package java200.to100.in99.n097;

public class StringBuilderMain {
	// 097 ���ڿ� ������ ����ϱ� 2(StringBuilder) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// synchronized ���� StringBuffer 
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
