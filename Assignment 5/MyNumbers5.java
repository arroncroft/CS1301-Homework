//************************************************************** 
// Purpose:    Compute sum, average,smallest, andthe two 
//             largest values (first largest and second             
//             largest). Accepts any set of integer values as 
//             command-line arguments, displays a report header,
//             input data, and computed values.
// Input:      A set of integers from the command line
// Output:     The integer set's total, average, smallest,
//             largest, and second largest integer.
//	Author:		Arron Croft
//	Date:		   9/18/15
//	Class:		CS1301 A
//	Program:	   #5 (MyNumbers5.java)
//**************************************************************
public class MyNumbers5 {
   //Declarations
   static int total,secondLargest;
   static int smallest,largest;
   static double average;
   
   //***********************************************************
   //main method
   //***********************************************************
   public static void main (String [] args) {
      calculations(args);
      printOutput(args);
   }
   
   //***********************************************************
   //calculation method
   //***********************************************************
   public static void calculations (String [] args) {
      
      if (args.length>0){
      secondLargest = Integer.MIN_VALUE;
      smallest = Integer.MAX_VALUE;
      largest = Integer.MIN_VALUE;
      }
   
      //find total, smallest, largest, and secondLargest
      for (int i=0;i<args.length;i++){
         total+=Integer.parseInt(args[i]);
         if (Integer.parseInt(args[i])<=smallest){
            smallest = Integer.parseInt(args[i]);
         }
         if (Integer.parseInt(args[i])>largest){
            secondLargest = largest;
            largest = Integer.parseInt(args[i]);
         } else if (Integer.parseInt(args[i])>secondLargest &&
                     Integer.parseInt(args[i]) !=largest){
            secondLargest = Integer.parseInt(args[i]);
         }
      }
      
      //find average
      average = (double) total/args.length;
   }
   
   //***********************************************************
   //display output method
   //***********************************************************
   public static void printOutput (String [] args) {
      //header
      System.out.printf("******************** MyNumbers5 ********************");
      System.out.printf("\n%-15s%-10s","Name:","Arron Croft");
      System.out.printf("\n%-15s%-10s","Course:","CS1301 A");
      System.out.printf("\n%-15s%-10s","Date:","9/18/15");
      System.out.printf("\n****************************************************");
      //main output
      if (args.length<1) {
         System.out.println("\n\nEmpty set");
      }
      
      if (args.length==1) {
         System.out.println("\n\nNot enough arguments");
      }
      
      if (args.length>2) {
         System.out.printf("\nValues: ");
         for (int i=0;i<args.length;i++){
            System.out.printf(args[i]+"\t");
         }
         System.out.printf("\n%-30s%10d","Total is:",total);
         System.out.printf("\n%-30s%13.2f","Average is:",average);
         System.out.printf("\n%-30s%10d","Smallest value is:",smallest);
         System.out.printf("\n%-30s%10d","Largest value is:",largest);
         System.out.printf("\n%-30s%10d","Second largest value is:",secondLargest);
      }   
      System.out.printf("\n***************** Have a good day! *****************");   
   }
}