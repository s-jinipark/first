package techOfJava.ch09;

public class Bank {

	private String account;
	private int money;
	
	public Bank(String account, int money) {
		this.account = account;
		this.money = money;
	}
	
	// 입금
	//public void deposit(int moneny) {
	public synchronized void deposit(int moneny) { // 동기화 작업
		this.money += money;
	}
	
	// 출금
	//public boolean withdraw(int moneny) {
	public synchronized boolean withdraw(int moneny) {
		if (this.money >= money) {
			this.money -= money;
			return true;
		} else 
			return false;
	}	
	
	public String getAccount() {
		return account;
	}
}
