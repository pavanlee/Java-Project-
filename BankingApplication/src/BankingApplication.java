import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		BankAccount obj=new BankAccount("Pk BankCode", "1276387");
		obj.showMenu();
		

	}

}

class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	
	
	public BankAccount(String customerName, String customerId) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
	}

	void deposit(int amount) {
		  if(amount!=0) {
		    try {
		      balance=balance+amount;
		      previousTransaction=amount;
		    } catch (Exception e) {
		      System.out.println("Error: " + e.getMessage());
		    }
		  }
		}

		void withdraw(int amount) {
		  if(amount!=0) {
		    try {
		      balance=balance-amount;
		      previousTransaction=-amount;
		    } catch (Exception e) {
		      System.out.println("Error: " + e.getMessage());
		    }
		  }
		}
		public String getPreviousTransaction() {
	        if (previousTransaction > 0) {
	            return "Deposited: " + previousTransaction;
	        } else if (previousTransaction < 0) {
	            return "Withdraw: " + Math.abs(previousTransaction);
	        } else {
	            return "No Transaction Occurred";
	        }
		
		}
	void showMenu() {
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID "+customerId);
		System.out.println("\n");
		
		System.out.println("A : Check Your Balance");
		System.out.println("B : Deposit");
		System.out.println("C : Withdraw");
		System.out.println("D : Previous Transaction");
		System.out.println("E : Exit the System");
		
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("Enter your Option");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			option=scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'A':
				System.out.println("----------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("-----------------------------------------");
				System.out.println("\n");
				break;
			case 'B':
				System.out.println("----------------------------------------");
				System.out.println("Enter an amount to deposit");
				System.out.println("-----------------------------------------");
				int amount=scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			case 'C':
				System.out.println("----------------------------------------");
				System.out.println("Enter an amount to Withdraw");
				System.out.println("-----------------------------------------");
				int amount2=scanner.nextInt();
				deposit(amount2);
				System.out.println("\n");
				break;
			case 'D':
				System.out.println("----------------------------------------");
				getPreviousTransaction();
				System.out.println("-----------------------------------------");
				System.out.println("\n");
				break;
			case 'E':
				System.out.println("----------------------------------------");
				break;
				
				
			
			
			default:
			System.out.println("Invalid Option!! Please Enter Correct Option.....");
			break;
		}
		}
		while(option !='E'); {
			System.out.println("Thanks for Using our Services.....!!");
			
		}
	}

	 public int getBalance() {
	        return balance;
	    }

	    
	    
	}
	


