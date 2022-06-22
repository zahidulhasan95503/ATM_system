package codewithzahid;

import java.util.Scanner;


class  CreateAccount{
	
	
	
	public void typeofAccount() {
		
		System.out.println("Enter the type of account that you want to create ");
		System.out.println("press 1 for Savings account");
		System.out.println("press 2 for Current account// ");
		System.out.println("press 3 for fixed deposit ");
	}
}

class SavingsAccount{
	
	Scanner sc = new Scanner(System.in);
	String name;
	String DOB;
	int AccountNumber;
	String IFSCcode;
	int balance=20000;
	
	public void setdetails() {
		System.out.println("Please enter your name=");
		 name = sc.nextLine();
		
		System.out.println("Please enter your Data of birth=");
		 DOB = sc.nextLine();
		
		System.out.println("Here you can enter your own ACCOUNT NUMBER");
		
		System.out.println("Please enter your Account number=");
		 AccountNumber = sc.nextInt();
		
	     IFSCcode = "CANB1234563546";
}
	
      public void getdetails() {
    	  
    	  System.out.println("ALL YOUR DETAILS ARE");
    	  System.out.println();
    	  System.out.println("NAME="+name);
    	  System.out.println();
    	  System.out.println("DOB="+DOB);
    	  System.out.println();
    	  System.out.println("ACCOUNTNUMBER = "+AccountNumber);
    	  System.out.println();
    	  System.out.println("IFSCcode = "+IFSCcode);
    	  System.out.println();
      }
      
      
  public int deposit() {    
	  System.out.println("enter the amount that you want to deposit=");
	  int amount=  sc.nextInt();
	  System.out.println();
	  
	  balance =balance+amount;
	  return balance;
  }
  
  public int withdraw() {
	  System.out.println("Enter the amount that you want to withdraw=");
	  int amount = sc.nextInt();
	  System.out.println();
	  
	  if(balance<amount) {
		  System.out.println("you cannot takeout amount greater "+balance);
		  System.out.println();
	  }
	  else {
		  balance = balance-amount;
	  }
	  return balance;
  }
  
  public int transfer() {
	  System.out.println("Enter the amount that you want to Transer");
	  int amount = sc.nextInt();
	  System.out.println();
	  
	  if(balance<amount) {
		  System.out.println("you cannot transfer amount greater "+balance);
		  System.out.println();
		  
		  
	  }
	  
	  else {
	  balance = balance-amount;
	  
	  System.out.println(amount+"has been Transfered");
	  
	  System.out.println();
	  
	       
	  }
	  return balance;
  }
  public void balance() {
	  System.out.println("Total balance in your account is "+balance);
	  System.out.println();
  }
  
 }

class CurrentAccount extends SavingsAccount{
	
	String debitnum;
	String cvv;
	int balance;
	
	
	
	Scanner sc = new Scanner(System.in);
	
	public void setdebitdetails() {
		System.out.println("here you can create your own Debit card");
		
		System.out.println("Please enter your debit card number=");
	    debitnum = sc.next();
		
		System.out.println("Please enter your CVV number=");
		
		cvv = sc.next();
		
		
	}
       public void getdebitdetails() {
		
		System.out.println("ALL YOUR DEBIT DETAILS ARE HERE");
		System.out.println("your debit card number is="+debitnum);
		System.out.println("your cvv number is"+cvv);
		System.out.println("Expiry of the card is =5/10/2025");
		
		
	}
	
	public void  setdetails() {
		System.out.println("Enter your current ID=");
		String curid = sc.nextLine();
		int match = 0;
		
		System.out.println("Enter your password=");
		
	     int password =sc.nextInt();
		int corpass = 91;
		
		if(password ==corpass) {
			System.out.println("You can continue ahead");
			transfer();
			
			
		}
		else {
			System.out.println("invalid password or ID");
			System.out.println("enter correct password or ID");
			
			match = 1;
			
		}
		
		
		
	//	return match;
		
	}
	
	
//	public int transfer() {
		
		
		
//		return balance;
		
//	}
	
		
		
		
	
	
	
	
	
}

class fixeddeposit extends SavingsAccount{
	int depamount;
	int years;
	int intrest;
	float retamount;
	
	public void returns() {
		System.out.println("HERE YOU CAN DO A FIXED DEPOSIT");
		System.out.println("THE MINIMUM AMOUNT SHOULD BE 2000");
		System.out.println("INTREST WILL BE 3.95% PER YEAR");
		
	     System.out.println("enter the deposit amount=");
	     int depamount =sc.nextInt();
	     System.out.println("enter the no of years=");
	     int years=sc.nextInt()*365;
	     
	     
	     retamount = (float) (depamount+((depamount*3.95*years)/100));
	     
	     System.out.println(retamount);
	}
		
	
	
}


public class BankingSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CreateAccount c = new CreateAccount();
		
		c.typeofAccount();
		
		int input = sc.nextInt();
		
		if( input==1) {
			SavingsAccount s = new SavingsAccount();
			s.setdetails();
			s.getdetails();
			int i=0;
			while(i<5) {
			System.out.println("press 1 for deposit");
			System.out.println("press 2 for withdraw");
			System.out.println("press 3 for transfer");
			System.out.println("press 4 to check balance");
			
			int savin = sc.nextInt();
			switch(savin) {
			
			case 1:int depbal=s.deposit();
			       System.out.println("Your balance after depositing is"+depbal);
			break;
			
			case 2:int witdbla = s.withdraw();
			       System.out.println("Your balance after withdrawing"+witdbla);
			break;
			
			case 3:int transbal = s.transfer();
					System.out.println("Your balance after transfering"+transbal);
			break;
			
			case 4:s.balance();
			break;
			
			case 5:
			
			}
			i++;
			}
		}
		
		  
		
		else if(input ==2) {
			System.out.println("TO CREATE YOUR CURRENT ACCOUNT YOU SHOULD FIRST HAVE SAVINGS ACCOUNT");
			System.out.println("DO U HAVE SAVINGS ACCOUNT  PRESS yes OR no");
			
		      
			String havsavacc=sc.next();
			
			
		
			
			if(havsavacc.equals("yes")) {
				CurrentAccount cu = new CurrentAccount();
				
				cu.setdetails();
				System.out.println("amount has been sended to other country bankaccount");
				
				System.out.println("Do you have Debit card or you want to create one");
				System.out.println("yes OR no");
				
			String havedeb = sc.next();
			
			if(havedeb.equals("no")) {
				cu.setdebitdetails();
				cu.getdebitdetails();
			}
			else {
				System.out.println("Okay ThankYou");
			}
				
			}
			
			else if(havsavacc.equals("no")) {
				System.out.println("First create your Savings Account");
			}
			
			
		}
		
		
			
		
		else {
			
			fixeddeposit f = new fixeddeposit();
			
			f.returns();
			
			
			
			
			
		}	

	}
	
	
	

}
