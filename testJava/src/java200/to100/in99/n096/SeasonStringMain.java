package java200.to100.in99.n096;

public class SeasonStringMain {
	// 096 enum(Enumerations) 이해하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeasonString season = SeasonString.AUTUMN;	// enum 은 객체를 생성하지 않고 사용
		System.out.println(season.getMonth());
		System.out.println(season);
		
		//SeasonString season2 = new SeasonString("Fall"); // X  [err]
		
		System.out.println(season.equals(SeasonString.SPRING) );
		System.out.println(season.equals(SeasonString.AUTUMN) );
		System.out.println("----- -----");
		System.out.println(season.compareTo(SeasonString.SPRING) );
		System.out.println(season.compareTo(SeasonString.SUMMER) );
		System.out.println(season.compareTo(SeasonString.AUTUMN) );
		System.out.println(season.compareTo(SeasonString.WINTER) );		
		System.out.println("----- -----");
		System.out.println(season.ordinal() );
		System.out.println(season.name() );
		
		System.out.println("----- -----");
		for (SeasonString sea : SeasonString.values()) {
			System.out.println(sea);
		}
	}
	/*
	compareTo 는 순서를 비교한다
	SPRING 은 0 ... WINTER 는 3 을 상수로 자동할당 -> 이때의 값을 오디널(ordinal) 이라 함
	*/
}
