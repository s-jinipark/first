package testJava.site3000;

public class samgak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int num = 5;
		for (int i=0; i<num ; i++) {
			for (int j=i; j<num-1 ; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<=i ; k++) {
				System.out.print("*");
			}
			for (int l=0; l<i ; l++) {
				System.out.print("*");
			}
			System.out.println("");
		} 
		*/
		// (����) �ι�° ���
		int num = 5;
		for (int i=0; i<num ; i++) {
			for (int j=i; j<num-1 ; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<=(i*2) ; k++) {
				System.out.print("*");
			}
			System.out.println("");
		} 
	}

}

/*
���� ���

    *
   ***
  *****
 *******
*********

 */