package java200.to100.in40.n040;

public class TypeConversion1 {
	// 040 문자열을 숫자로 바꾸기(Integer.parseInt) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1 = "12345";
		int tempNum1 = 2345;
		
		// String -> int
		int intNum1 = Integer.parseInt(strNum1);
		double douNum1 = Double.parseDouble(strNum1);
		
		System.out.println("1 : intNum1 : " + intNum1 );
		System.out.println("2 : douNum1 : " + douNum1 );
		
		// int -> String
		String strNum2 = Integer.toString(tempNum1);
		String strNum3 = tempNum1 + "";
		
		// String <--> char
		char[] charStr = {'H','e','l','l','o'};
		String strChar = new String(charStr);
		
		System.out.println("3 : charStr : " + charStr );
		System.out.println("4 : strChar : " + strChar );
		//3 : charStr : [C@659e0bfd
		//4 : strChar : Hello

		char[] charStr2 = strChar.toCharArray();
		String sv = String.valueOf(charStr2);
		System.out.println("5 : sv : " + sv );
		
		// String Concatenation
		String s = "Get ";
		s += "java ";
		s += "this time. ";
		String st = "";
		st.concat("java " ).concat("this time.!");
		System.out.println("6 : st => " + st ); // 값 없음 -> immutable
		st = st.concat("java " ).concat("this time.!");
		System.out.println("6 : st => " + st ); // 값 있음. 저장했으므로
		
		
	}

}
