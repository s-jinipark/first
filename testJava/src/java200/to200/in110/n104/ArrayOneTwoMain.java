package java200.to200.in110.n104;

public class ArrayOneTwoMain {
	// 104 1차원 배열을 2차원 배열로 바꾸기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrays1 = {4,5,6,3,4,5,6,7,8,2,5,14};
		ArrayOneTwo aot = new ArrayOneTwo();
		aot.setArray(arrays1);
		int[][] arrays2 = aot.oneToTwo(3, 4);
		
		ArrayPrint.print(arrays1);
		ArrayPrint.print(arrays2);
		
	}

}
