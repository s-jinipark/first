package java200.to100.in40.n031;

public class IntToChar {
	// 031 'a'의 유니코드 값 구하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=21; i<=60; i++) {
			System.out.print("[" + (char)i + "]");
			if (i%10 ==0) {
				System.out.println();
			}
		}
		
		System.out.println('a');
		System.out.println('A');
		System.out.println("알파벳 : " + ('z'-'a'+1) + " 자");	
		
		char cc = '한';
		System.out.println(cc);
		System.out.println((int)cc); // '한' 의 int 값
		
		char zChar = '0';
		int count = (int)zChar;
		System.out.println(count); // '0' 은 48
		for (int i=count; i<=count+9; i++) {
			System.out.print("[" + (char)i + "]");
		}
	}

}
