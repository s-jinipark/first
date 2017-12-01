package java200.to100.in99.n096;

public enum SeasonString {
	
	// 096 enum(Enumerations) �����ϱ� 
	
	SPRING ("Spring (from 3 to 5)"),
	SUMMER ("Summer (from 6 to 8)"),
	AUTUMN ("Autumn (from 9 to 11)"),
	WINTER ("Winter (from 12 to 2)"); 	// ; �� ��� -> **
	
	// ��ġ ������ ��
	private String season;
	
	// ������
	SeasonString(String sea) {
		season = sea;
	}
	
	// �޼���
	public String toString() {
		return season;
	}
	
	public String getMonth() {
		return season.substring(7);
	}
	
}