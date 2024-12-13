package Evalutionprograms;

import java.util.Scanner;

public class ATMexample 
{
public static void main(String[] args) 
{
	int balance = 100000, withdraw, deposit;  
	Scanner sc = new Scanner(System.in);
	
           System.out.println("Automated Teller Machine");  
           System.out.println("Choose 1 for Withdraw");  
           System.out.println("Choose 2 for Deposit");  
           System.out.println("Choose 3 for Check Balance");  
           System.out.println("Choose 4 for EXIT");  
           System.out.print("Choose the operation you want to perform:");
           int ch=sc.nextInt();
           switch(ch)
           {
           case 1:
        	   System.out.println("Please enter money to withdraw");
        	   withdraw=sc.nextInt();
        	  
        	   if(balance>withdraw)
        	   {
        		   System.out.println("Please collect your amount");
        		   balance=balance-withdraw;
        		   System.out.println(+withdraw+ "  Debited from ATM");
        		   System.out.println("Remaining amount in your account is :" +balance);
     
        	   }
        	   else
        	   {
        		   System.out.println("Insufficient money in your account..!");
        		   System.out.println("Your current balance is :" +balance);
        	   }
        	   break;
           case 2:
        	   System.out.println("please enter money to diposit");
        	   deposit=sc.nextInt();
        	   balance=balance+deposit;
        	   System.out.println(deposit+ " Money credited to in your account");
        	   System.out.println("Now your account balance is : "+balance);
        	   break;
           case 3:
        	   System.out.println("Your account balance is : "+balance );
        	   break;
           case 4:
        	   System.exit(0);
        	   break;
           }
           
}
}
