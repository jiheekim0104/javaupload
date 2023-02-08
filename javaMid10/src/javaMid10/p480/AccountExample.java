package javaMid10.p480;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		
		try {
			account.withdraw(4000);
			System.out.println("현재 잔액: "+account.getBalance());
		} catch (InsufficientException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
