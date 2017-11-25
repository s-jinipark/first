package testJava.site3000;

public class samgak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int num = 5;
		for (int i=0; i<num ; i++) {
			for (int j=0; j<(num*2)-1*i ; j++) {
				if (j > i) 
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for (int l=0; l<i ; l++) {
				System.out.print(" ");
			}
			System.out.println("");
		}  
		*/
		// (정답) 두번째 방법
		int num = 5;
		for (int i=0; i<num ; i++) {
			for (int j=0; j<i ; j++) {
				System.out.print(" ");
			}

			for (int k=0; k<=((num-i-1)*2) ; k++) {
				System.out.print("*");
			}
			System.out.println("");
		} 
	}

}

/*
다음 출력

*********
 ******* 
  *****  
   ***   
    *    

 */