package java200.to200.in120.n116;

import java200.to200.in120.n114.BubbleSort;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 116 로또 만들기 
		
		Lotto lotto = new Lotto();
		lotto.make();
		int[] b = lotto.getBall();
		
		BubbleSort.print(b);
	}

}
