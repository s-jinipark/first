package etc.jump;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] gg = {
				{1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6,7,8,9}
		};
		
		int[][] result = new int[9][9];
		
		for (int i=1; i < 10; i++) {
			for (int j=1; j < 10; j++) {
				//gg[i][j] = i*j;
				//System.out.print("=" + gg[i][j]);
				result[i-1][j-1] =  i*j;
				System.out.print(i + "*" + j + "=" + i*j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (int i=0; i < result.length ; i++) {
			for (int j=0; j < result[i].length ; j++) {
				//gg[i][j] = i*j;
				System.out.print((j+1) + "*" + (i+1) + "=" + result[j][i] + "\t");
			}
			System.out.println("");
		}
		
	}

}
