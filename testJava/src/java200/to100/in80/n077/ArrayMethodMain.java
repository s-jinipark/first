package java200.to100.in80.n077;

public class ArrayMethodMain {
	// 077 메서드와 배열의 관계 이해하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 6;
		
		ArrayMethod.copyVInt(a,b); //immutable
		System.out.println(a);	// 변경되지 않는다
		System.out.println(b);	// 변경되지 않는다
		ArrayMethod.multi(a);  //immutable
		System.out.println(a);	// 변경되지 않는다
		
		int aa[] = {5,4,7,1,9,12,0,3,2,6};
		int bb[] = new int[aa.length];
		int cc[] = {5,4,7,1,9,12,0,3,2,6};
		int dd[] = new int[cc.length];
		
		ArrayMethod.copyR(aa, bb); // 이런 방법으로는 복사할 수 없다
		ArrayMethod.print(bb);
		ArrayMethod.copyRChange(aa, bb); // 복사시킬수는 없어도
										// 값을 변경시킬 수 있다
		ArrayMethod.print(bb);
		ArrayMethod.print(aa);
		
		ArrayMethod.bbsort(aa);  //mutable
		
		System.out.println("--------------------");	
		ArrayMethod.print(aa);
		ArrayMethod.copyV(cc, dd);	// dd 의 값은 모두 0 이었다
		ArrayMethod.print(dd);  //mutable
	}


}
