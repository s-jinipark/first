package java200.to200.in190.n187;

public class CakeEater extends Thread {

	private CakePlate cake;
	public CakeEater(CakePlate cake) {
		setCakePlate(cake);
	}
	
	public void setCakePlate(CakePlate cake) {
		this.cake = cake;
	}
	
	public CakePlate getCakePlate() {
		return  cake;
	}
	
	public void run() {
		
		for ( int i=0; i<30; i++) { 
			cake.eatBread();
			
		}
	}
	
}