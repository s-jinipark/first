package testJava.site3000;

public class samgak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for (int i=0; i<5 ; i++) {
			for (int j=4; j>=0 ; j--) {
				if (j <= i) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		} // ok	
		*/
		// (����) �ι�° ���
		int num = 5;
		for (int i=0; i<num ; i++) {
			for (int j=i; j<num-1 ; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<=i ; k++) {
				System.out.print("*");
			}
			System.out.println("");
		} 
	}

}

/*
���� ���

    *
   **
  ***
 ****
*****

 */