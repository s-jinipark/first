package techOfJava.ch09;

public class Bank {

	private String account;
	private int money;
	
	public Bank(String account, int money) {
		this.account = account;
		this.money = money;
	}
	
	// �Ա�
	//public void deposit(int moneny) {
	public synchronized void deposit(int moneny) { // ����ȭ �۾�
		this.money += money;
	}
	
	// ���
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
