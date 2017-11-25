package etc.euler.q2;

public class Problem2_other1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int after=1;
		int before = 1;
		int temp;
		int max = 4000000;
		int sum=0;
		while(true){
			if(after > max)break;
			temp=before+after;
			before=after;
			after=temp;
			System.out.println(before);
			if(before%2==0){
			sum += before;
			}
		}
		System.out.println("> "+sum);
	}

}
