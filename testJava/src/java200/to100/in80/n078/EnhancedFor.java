package java200.to100.in80.n078;

import java.util.ArrayList;

public class EnhancedFor {
	// 078 Enhanced for(���� for ��) ����ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = {5,4,7,1,9,12,0,3,2,6};
		for (int en=0; en<aa.length; en++) {
			System.out.print("[" + aa[en]+ "] ");
		}
		System.out.println();
		
		for (int en : aa) {
			System.out.print("[" + en + "] ");
		}
		
		System.out.println("");
		System.out.println("--------------------");	
		
		String[] sNames = {"��ö", "����ȭ", "������", "ö��"};
		for (String sName : sNames) {
			System.out.print("[" + sName + "] ");
		}
		System.out.println("");
		
		int[][] bb = {{3,4,5},{7,8,9},{1,2,3}};
		
		for (int[] outs : bb) {
			for (int ins : outs) {
				System.out.printf("[%d]", ins);
			}
			System.out.println("");
		}
		System.out.println("");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("��ö");
		list.add("����ȭ");
		list.add("������");
		list.add("ö��");
		
		for (String sName : list) {
			System.out.printf("[%s]", sName);
		}
		System.out.println("");
		

	}

}
