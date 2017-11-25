package java200.to100.in99.n096;

public enum SeasonString {
	
	// 096 enum(Enumerations) 이해하기 
	
	SPRING ("Spring (from 3 to 5)"),
	SUMMER ("Summer (from 6 to 8)"),
	AUTUMN ("Autumn (from 9 to 11)"),
	WINTER ("Winter (from 12 to 2)"); 	// ; 를 사용 -> **
	
	// 위치 조심할 것
	private String season;
	
	// 생성자
	SeasonString(String sea) {
		season = sea;
	}
	
	// 메서드
	public String toString() {
		return season;
	}
	
	public String getMonth() {
		return season.substring(7);
	}
	
}
