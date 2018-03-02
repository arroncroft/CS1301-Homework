//********************************************************************
// Purpose: Create and manipulate two bank accounts, checking 
//          and savings.
// Author:  Zach Spencer and Arron Croft
// Date:    10/8/15 
// Class:   CS 1301 A 
//********************************************************************

import java.text.NumberFormat;

public class Account7
{
   private final double RATE;
   private final double withdrawal;
   private long acctNumber;
   private double balance;
   private String name;
   
   private double accountFees;
   private double accountInterest;

   //-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance.
   //-----------------------------------------------------------------
   public Account7(String owner, long account, double initial, double rate, double withdrawal)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
      RATE = rate;
      this.withdrawal = withdrawal;
   }

   //-----------------------------------------------------------------
   //  Deposits the specified amount into the account. Returns the
   //  new balance.
   //-----------------------------------------------------------------
   public double deposit(double amount)
   {
      balance = balance + amount;
      return balance;
   }

   //-----------------------------------------------------------------
   //  Withdraws the specified amount from the account and applies
   //  the fee. Returns the new balance.
   //-----------------------------------------------------------------
   public double withdraw(double amount, double fee)
   {
      balance = balance - amount - fee;
      accountFees += fee;
      return balance;
   }
   
   //-----------------------------------------------------------------
   //  Returns total fees for the account.
   //-----------------------------------------------------------------
   public double getFees()
   {
      return accountFees;
   }

   //-----------------------------------------------------------------
   //  Adds interest to the account and returns the new balance.
   //-----------------------------------------------------------------
   public double addInterest()
   {
      balance += (balance * RATE);
      accountInterest += (balance * RATE);
      return balance;
   }
   
   //-----------------------------------------------------------------
   //  Returns total interest for the account.
   //-----------------------------------------------------------------
   public double getInterest()
   {
      return accountInterest;
   }

   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance()
   {
      return balance;
   }

   //-----------------------------------------------------------------
   //  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      NumberFormat fmt  = NumberFormat.getCurrencyInstance();
      NumberFormat fmt2 = NumberFormat.getPercentInstance();
      String result;
      result = "\n\tAccount Owner:    \t" + name +
               "\n\tAccount Number:   \t" + acctNumber +
               "\n\tAccount Rate:     \t" + fmt2.format(RATE) +
               "\n\tAccount Interest: \t" + fmt.format(accountInterest) + 
               "\n\tAccount Fees:     \t" + fmt.format(accountFees) +
               "\n\tAccount Balance:  \t" + fmt.format(balance);
      return result;
   }
}
