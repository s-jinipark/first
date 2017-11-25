package java200.to200.in180.n176;

import java.util.Scanner;

public class ReadFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner isr = new Scanner(System.in);

			String s = "";
			
			while ( !(s=isr.nextLine() ).equals("@esc")  ) { // 안되는 듯..

				System.out.println(s);
			}

			isr.close();
			
		} catch (Exception ee) {
			System.out.println(ee.toString());
		}
	}

}
