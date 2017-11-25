package testJava.site3000;

public class samgak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for (int i=1; i<=5 ; i++) {
			String temp = "";
			for (int j=1; j<=i ; j++) {
				temp = temp + "*";
				//System.out.println(i + " / " + j + " / " + temp);
			}
			System.out.println(temp);
		} // ok
		*/
		// (정답) 두번째 방법
		for (int i=0; i<5 ; i++) {
			for (int j=0; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		} 	
	}

}

/*
다음 출력

*
**
***
****
*****

 */