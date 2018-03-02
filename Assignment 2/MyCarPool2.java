//***********************************************************
//	Author:		Arron Croft
//	Date:		   8/28/15
//	Class:		CS1301 A
//	Program:	   #2 (MyCarPool2.java)
//***********************************************************

import java.util.Scanner;
public class MyCarPool2 {
	public static void main (String [] args){
      //Declarations
      Scanner scan = new Scanner(System.in);
      int passengers;
      double gasCost,milesPerGallon,parkingFees,tolls,milesPerDay;
      double dailyCost,dailySavings,weeklySavings,monthlySavings,yearlySavings;
      
      //Input
      System.out.print ("Welcome to the Daily Driving Cost calculator");
      System.out.print ("\nEnter the number of miles you drive per day: ");
      milesPerDay = scan.nextInt();
      System.out.print ("Enter the cost per gallon of gas (i.e. 2.25): ");
      gasCost = scan.nextDouble();
      System.out.print ("Enter average miles per gallon of gas: ");
      milesPerGallon = scan.nextDouble();
      System.out.print ("Enter the parking fees per day: ");
      parkingFees = scan.nextDouble();
      System.out.print ("Enter the tolls per day: ");
      tolls = scan.nextDouble();
      System.out.print ("Enter the number of passengers: ");
      passengers = scan.nextInt();
      
      //Calculations
      dailyCost = ((milesPerDay/milesPerGallon)*gasCost)+tolls+parkingFees;
      dailySavings = dailyCost-(dailyCost/passengers);//NO FUCKING IDEA
      weeklySavings = dailySavings * 5;
      monthlySavings = dailySavings *22;
      yearlySavings = dailySavings * 260;
      
      //Output
      ////Header
      System.out.printf ("\n********************** Car Pooling Report **********************");
      System.out.printf ("\n\t%-10s%-20s","Name:","Arron Croft");
      System.out.printf ("\n\t%-10s%-20s","Course:","CS1301 A");
      System.out.printf ("\n\t%-10s%-20s","Date:","8/28/15");
      System.out.printf ("\n****************************************************************");
      ////Body
      System.out.printf ("\n\n%-30s%20.2f","Daily Miles Driven:",milesPerDay);
      System.out.printf ("\n%-30s%20.2f","Cost per gallon:",gasCost);
      System.out.printf ("\n%-30s%20.2f","Average Miles Per Gallon:",milesPerGallon);
      System.out.printf ("\n%-30s%20.2f","Parking fees:",parkingFees);
      System.out.printf ("\n%-30s%20.2f","Toll cost:",tolls);
      System.out.printf ("\n%-30s%20d","Number Of Passengers:",passengers);
      System.out.printf ("\n\n%-30s%20.2f","One Passenger Daily Cost:",dailyCost);
      System.out.printf ("\n%-30s%20.2f","Daily Savings:",dailySavings);
      System.out.printf ("\n%-30s%20.2f","Weekly Savings:",weeklySavings);
      System.out.printf ("\n%-30s%20.2f","Monthly Savings:",monthlySavings);
      System.out.printf ("\n%-30s%20.2f","Annual Savings:",yearlySavings);
      System.out.printf ("\n\n******************* Have a nice day! ***************************");
   }
}