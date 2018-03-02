//************************************************************* 
// Purpose:    Implement MyAccount4 assignment using UML 
//             diagram.
//	Author:		Arron Croft
//	Date:		   9/8/15
//	Class:		CS1301 A
//	Program:	   #4 (MyAccount4.java)
//*************************************************************
import java.util.Date;
public class MyAccount4 {
   //Declarations
   private Date dateCreated = new Date();
   private String name;
   private long accountNumber;
   private double balance;
   
   //**********************************************************
   //no-argument constructor & constructor
   //**********************************************************
   public MyAccount4 () {
      name = "unknown";
      accountNumber = 99999;
      balance = 0;
      dateCreated.toString();
   }
   public MyAccount4 (String name,long accountNumber,
                      double balance) {
      this.name = name;
      this.accountNumber = accountNumber;
      this.balance = balance;
   }
   
   //**********************************************************
   //getName: Returns the owner's name
   //**********************************************************
   public String getName () {
      return name;
   }
   
   //**********************************************************
   //setName: Updates the owner's name
   //**********************************************************
   public void setName (String name) {
      this.name = name;
   }
   
   //**********************************************************
   //getAccountNumber: Returns the account number
   //**********************************************************
   public long getAccountNumber () {
      return accountNumber;
   }
   
   //**********************************************************
   //getBalance: Returns the balance
   //**********************************************************
   public double getBalance () {
      return balance;
   }
   
   //**********************************************************
   //deposit: Adds deposit amount to balance
   //**********************************************************
   public void deposit (double balance) {
      this.balance += balance;
   }
   
   //**********************************************************
   //withdraw: Subtracts withdrawal from balance
   //**********************************************************
   public void withdraw (double balance) {
      this.balance -= balance;
   }
   
   //**********************************************************
   //toString: Returns name, account number, balance,
   //and date created.
   //**********************************************************
   public String toString() {
      String result;
      result = "\n\tName:           \t"+name+
               "\n\tAccount Number: \t"+accountNumber+
               "\n\tBalance:        \t"+balance+
               "\n\tDate:           \t"+dateCreated.toString();
      return result;
   }
}