package atm;

import java.util.*;

public class transaction 
{

	public static void main(String[] args) {


		int pin = 1234;
		String name = "Ponin";
		int balance = 100000000;
		int addAmount = 0;
		int takeAmount =0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Pin Number");
		int password = scanner.nextInt();
		
		if(password == pin) {
			System.out.println("Welcome" + name);
			
			while (true) {
				System.out.println("Press 1 to Check Balance");
				System.out.println("Press 2 to Deposit");
				System.out.println("Press 3 to Withdrawal");
				System.out.println("Press 4 to Mini Statement");
				System.out.println("Press 5 to Exit");
				
				int opt = scanner.nextInt();
				switch(opt)
				{
					case 1:
						
						System.out.println("Your Current Balance is " + balance);
						break;
						
					case 2:
						
						System.out.println("How much Amount you like to Deposit ");
						addAmount = scanner.nextInt();
						System.out.println("Amount Successfully Credited ");
						balance = balance + addAmount;
						break;
						
					case 3:
						
						System.out.println("Enter the amount like to Withdraw");
						takeAmount = scanner.nextInt();
						
						if (takeAmount>balance) {
							System.out.println("Your Balance is Insufficient");
						}
						else {
							System.out.println("Please collect the Cash ");
							balance = balance - takeAmount;
						}
						break;
						
					case 4:
						
						System.out.println("Welcome to Bank of Java");
						System.out.println("Account Holder Name : " + name);
						System.out.println("Amount Deposited " + addAmount);
						System.out.println("Amount Withdraw " + takeAmount);
						System.out.println("Avaiable Balance is " + balance);
						System.out.println("Thank You Visit Again");
						break;
				}
				
				if(opt == 5) {
					System.out.println("Thank You Visit Again...");
					break;
				}
				
			}
			}
			else {
				System.out.println("Incorrect Pin, Enter correct Pin");
			}
				
			}
		}
	

			
		
		

	


