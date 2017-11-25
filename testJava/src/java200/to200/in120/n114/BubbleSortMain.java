package java200.to200.in120.n114;

public class BubbleSortMain {
	// 114 버블 정렬하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,6,3,7,4,8,2,9};
		
		BubbleSort.print(a);
		
		BubbleSort bubble = new BubbleSort();
		
		int[] b = bubble.bbsortinc(a);

		BubbleSort.print(b);
	}

}
