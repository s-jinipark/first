package testJava.vol2.ch15.sub09;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이길동");
		scores.put(new Integer(75), "박길동");
		scores.put(new Integer(95), "신길동");
		scores.put(new Integer(80), "김길동");

		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + " - " + entry.getValue());

		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + " - " + entry.getValue());
	
		System.out.println("");
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수 : " + entry.getKey() + " - " + entry.getValue());

		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 위의  점수 : " + entry.getKey() + " - " + entry.getValue());

		System.out.println("");
		
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수 : " 
				+ entry.getKey() + " - " + entry.getValue());

		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85점 이거나 바로 위의  점수 : " 
				+ entry.getKey() + " - " + entry.getValue());

		
	}

}
