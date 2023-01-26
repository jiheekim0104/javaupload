package javaBasic5;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: "+ account.getBalance());
		
		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: "+ account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: "+ account.getBalance());

		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: "+ account.getBalance());
		
		Account[] accountArray = new Account[100];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("1.°èÁÂ»ý¼º | 2.°èÁÂ¸ñ·Ï | 3.¿¹±Ý | 4.Ãâ±Ý | 5.Á¾·á");
		System.out.println("-------------------------");
		System.out.print("¼±ÅÃ>");
		
	}

}
