//************************************************
//Purpose:	Skeleton for Account7
//Author:	Arron Croft and Zach Spencer
//Class:    CS 1301 A	
//Date:		10/8/15
//************************************************

import java.util.Scanner; 
import java.text.*;
public class MySkeletonAccount7{

	// Declarations
    Scanner scan = new Scanner(System.in);
	 String outputString, outMessage;
	 int option = 1;
    
	
	 public MySkeletonAccount7(){
 	 
	 outputString =   "\n\t1      Create a Checking Account" +
	 					   "\n\t2      Deposit into Checking Account" +
      				   "\n\t3      Withdraw from Checking Account" +
						   "\n\t4      Add Interest to Checking Account" + 
						   "\n\t5      Display Checking Account Information\n" +
                     
                     "\n\t6      Create a Savings Account" +
                     "\n\t7      Deposit into Savings Account" +
                     "\n\t8      Withdraw from Savings Account" +
                     "\n\t9      Add Interest to Savings Account" +
                     "\n\t10     Display Savings Account Information\n" +
                     
                     "\n\t11     Display Totals for both Accounts\n" + 
                     "\n\t12     Display Menu\n" +
                     "\n\t0      Quit\n\n\n";
		displayMenu();
		}

  	public void displayMenu() {
		  	System.out.println(outputString);
			System.out.print("\tEnter your selection:\t");
			option = scan.nextInt();
         String owner = "";
         long account = 0;
         double initialChecking = 0;
         double initialSavings = 0;
         double rate = 0;
         double fee = 0;
         Account7 checking = null;
         Account7 savings = null;
         
         
         double checkingDeposit = 0;
         double savingsDeposit = 0;
         double checkingWithdrawal = 0;
         double savingsWithdrawal = 0;
         
		    // Keep reading data until the user enters 0
		    while (option != 0) {
					    			
					switch (option) {
			
						case 1:  
								 	System.out.print ("Enter Account Owner:   \t");
                           owner = scan.nextLine();
                           owner = scan.nextLine();
                           System.out.print ("Enter Account Number:  \t");
                           account = scan.nextLong();
                           System.out.print ("Enter Account Rate:    \t");
                           rate = scan.nextDouble();
                           System.out.print ("Enter Withdrawal Fee:  \t");
                           fee = scan.nextDouble();
                           System.out.print ("Enter Initial Balance: \t");
                           initialChecking = scan.nextDouble();
                           checking = new Account7(owner,account,initialChecking,rate,fee);
                           break;
							
						case 2: 	
                           if (checking != null) {
   						         System.out.print ("Amount to Deposit into Checking:\t");
                              checkingDeposit = scan.nextDouble();
                              checking.deposit(checkingDeposit);
                           }
                           else {
                              System.out.println ("You must create an account first!");
                           }
			  						break;
					
						case 3:	
                           if (checking != null) {
   		 						   System.out.print ("Amount to Withdraw from Checking:\t");
                              checkingWithdrawal = scan.nextDouble();
                              checking.withdraw(checkingWithdrawal,fee);
                           }
                           else {
                              System.out.println ("You must create an account first!");
                           }
			  						break;
				
						case 4: 	
                           if (checking != null) {
									   checking.addInterest();
                           }
                           else {
                              System.out.println ("You must create an account first!");
                           }
									break;
					
						case 5: 	
                           if (checking != null) {
   									System.out.println ("Checking Account Summary");
                              System.out.println (checking);
                           }
                           else {
                              System.out.println ("You must create an account first!");
                           }
									break;
									
						case 6:  
									System.out.print ("Enter Account Owner:   \t");
                           owner = scan.nextLine();
                           owner = scan.nextLine();
                           System.out.print ("Enter Account Number:  \t");
                           account = scan.nextLong();
                           System.out.print ("Enter Account Rate:    \t");
                           rate = scan.nextDouble();
                           System.out.print ("Enter Withdrawal Fee:  \t");
                           fee = scan.nextDouble();
                           System.out.print ("Enter Initial Balance: \t");
                           initialSavings = scan.nextDouble();
                           savings = new Account7(owner,account,initialSavings,rate,fee);
									break;
		
						case 7: 	
                           if (checking != null) {
   									System.out.print ("Amount to Deposit into Savings:\t");
                              savingsDeposit = scan.nextDouble();
                              savings.deposit(savingsDeposit);
                           }
                           else {
                              System.out.println ("You must create an account first!");  
                           }   
									break;
                  
                  case 8: 	
                           if (checking != null) {
   									System.out.print ("Amount to Withdraw from Savings:\t");
                              savingsWithdrawal = scan.nextDouble();
                              savings.withdraw(savingsWithdrawal,fee);
                           }
                           else {
                              System.out.println ("You must create an account first!");  
                           }  
									break;
                           
                  case 9: 	
									if (checking != null) {   
                              savings.addInterest();
                           }
                           else {
                              System.out.println ("You must create an account first!");  
                           }  
									break;
                           
                  case 10: 
                           if (checking != null) {	
   									System.out.println ("\nSavings Account Summary");
                              System.out.println (savings);
                           }
                           else {
                              System.out.println ("You must create an account first!");
                           }   
									break;
                           
                  case 11: 
                           DecimalFormat fmt = new DecimalFormat( "0.00" );
                           if (checking != null && savings != null) {	
   									System.out.println("Summary of all Accounts:\t"+(fmt.format(initialChecking + initialSavings)));
                              System.out.println("Total Deposits:         \t"+(fmt.format(checkingDeposit + savingsDeposit)));
                              System.out.println("Total Withdrawals:      \t"+(fmt.format(checkingWithdrawal + savingsWithdrawal)));
                              System.out.println("Total Fees:             \t"+(fmt.format(checking.getFees() + savings.getFees())));
                              System.out.println("Total Interests:        \t"+(fmt.format(checking.getInterest() + savings.getInterest())));
                              System.out.println("Total Current Balances: \t"+(fmt.format(checking.getBalance() + savings.getBalance())));
                           }
                           else if (checking != null && savings == null) {
                              System.out.println("Summary of all Accounts:\t"+(fmt.format(initialChecking)));
                              System.out.println("Total Deposits:         \t"+(fmt.format(checkingDeposit)));
                              System.out.println("Total Withdrawals:      \t"+(fmt.format(checkingWithdrawal)));
                              System.out.println("Total Fees:             \t"+(fmt.format(checking.getFees())));
                              System.out.println("Total Interests:        \t"+(fmt.format(checking.getInterest())));
                              System.out.println("Total Current Balances: \t"+(fmt.format(checking.getBalance())));
                           }
                           else if (checking == null && savings != null) {
                              System.out.println("Summary of all Accounts:\t"+(fmt.format(initialSavings)));
                              System.out.println("Total Deposits:         \t"+(fmt.format(savingsDeposit)));
                              System.out.println("Total Withdrawals:      \t"+(fmt.format(savingsWithdrawal)));
                              System.out.println("Total Fees:             \t"+(fmt.format(savings.getFees())));
                              System.out.println("Total Interests:        \t"+(fmt.format(savings.getInterest())));
                              System.out.println("Total Current Balances: \t"+(fmt.format(savings.getBalance())));
                           }
                           else {
                              System.out.println("You must create an account first!");
                           }
									break;  
                           
                  case 12: 	
									System.out.println(outputString);
									break;                  
					
						default: outMessage= "\nInvalid Selection\n";
			  						System.out.println(outMessage);
			  						break;
					}// end of switch
		
				System.out.print("\n\tEnter your selection:\t");
				option = scan.nextInt();	
			 
		    }// end of while loop
		
		    
		  }// end of main method
  
 
}// end of class
