package java200.to100.in99.n093;

public class StringMethodMain2 {
	// 093 String �����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b = "Hello, I love you";
		// 6. �빮�ڷ�
		String d = b.toUpperCase();
		System.out.println(d);
		String e = b.toLowerCase();
		System.out.println(e);
		
		// 7. ���� ���� ����
		System.out.println(" �ȳ��ϼ���     " + "<" );
		System.out.println(" �ȳ��ϼ���     ".trim() + "<" );
				
		// 8. String <--> int
		int istr = Integer.parseInt("37");
		String stri = String.valueOf(istr);
		String stri2 = istr + "";
		//String stri3 = istr;   // X 
			
		// 9. ��ҹ��� ������� ���ϱ�
		System.out.println("hello".compareToIgnoreCase("Hello"));
		System.out.println("Hello".compareToIgnoreCase("hello"));
		
		// 10. + �� ���� concatenation
		stri = stri.concat("hello");
		System.out.println(stri);
		
		// 11. ���ڿ� <--> char �迭
		char[] chs = b.toCharArray();		// ���ڿ��� char �迭�� *
		String copys1 = String.copyValueOf(chs);  // char �迭�� ���ڷ�
		String copys2 = new String(chs);
		
		for (char ch : chs) {
			System.out.printf("%c", ch);
		}

		// 12. String format
		String ss = String.format("%s %d %c %f",  "Hellos", 78, 'c', 8.6);
		System.out.println(ss);
		
		// 13. ���ڸ� �����ϰ� �ִ°�
		System.out.println("hello".contains("el"));

	}

}
