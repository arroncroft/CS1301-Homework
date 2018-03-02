//*************************************************************
// Purpose:    Test MyAccount4
//	Author:		Arron Croft
//	Date:		   9/8/15
//	Class:		CS1301 A
//	Program:	   MyAccount4Tester.java 
//             (Driver for MyAccount4.java)
//*************************************************************
public class MyAccount4Tester {
   public static void main (String [] args) {
      //*******************************************************
      //Creating MyAccount4's objects
      //*******************************************************
      
      //Creating account 1 with no arguments
      MyAccount4 acc1 = new MyAccount4();
      System.out.println(acc1);
      
      //Creating account 2 with name, account number, and money
      //amount provided
      MyAccount4 acc2 = new MyAccount4("Said Fares",123456,1000.00);
      System.out.println(acc2);
      
      //using setName to change name of account 2
      acc2.setName ("Zach Spencer");
      System.out.println (acc2);
      
      //using deposit to add 500 to account 2 
      //(to go up to 1500)
      acc2.deposit(500);
      System.out.println (acc2);
      
      //using withdraw to take 500 from account 2 
      //(to go back down to 1000)
      acc2.withdraw(500);
      System.out.println (acc2);
      
      //using "run arguments"
      MyAccount4 acc3 = new MyAccount4(args[0],(Long.parseLong(args[1])),(Double.parseDouble(args[2])));
      System.out.println (acc3);
   }   
}