package javaBasic5;

public class Account {
	private int balance;
	public final static int MIN_BALANCE =0;
	public final static int MAX_BALANCE =1000000;
	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(MIN_BALANCE<=balance&&balance<=MAX_BALANCE) {
			this.balance = balance;
		}
		
	}
	
	
}
