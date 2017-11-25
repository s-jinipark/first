package java200.to100.in99.n096;

public class SeasonStringMain {
	// 096 enum(Enumerations) �����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeasonString season = SeasonString.AUTUMN;	// enum �� ��ü�� �������� �ʰ� ���
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
	compareTo �� ������ ���Ѵ�
	SPRING �� 0 ... WINTER �� 3 �� ����� �ڵ��Ҵ� -> �̶��� ���� �����(ordinal) �̶� ��
	*/
}
