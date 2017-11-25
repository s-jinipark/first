package java200.to200.in110.n107;

public class HowManyDaysMain {
	// 107 살아온 시간 계산하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HowManyDays how = new HowManyDays();
		System.out.println(how.howManyDays());
		how.setFrom(HowManyDays.makeDay(1972, 1, 21));
		how.setTo(HowManyDays.makeDay(2016, 8, 14));
		System.out.println(how.howManyDays());
	}

}
