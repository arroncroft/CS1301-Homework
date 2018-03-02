//***********************************************************
//Purpose:  Accepts a data file, and displays a histogram 
//          with the number of each product sold and the
//          number sold by each of 4 salesmen.
//Author:   Arron Croft and Zach Spencer
//Course:   CS1301 A
//Date:     11/26/2015
//Program:  MySales11.java
//************************************************************    
import java.util.*;

public class MySales11 {
	//declare and initialize variables
   private ArrayList<String> allLines = new ArrayList<>();
   private int [][] allSales; 
	private int [] salesman1 = new int [5];
	private int [] salesman2 = new int [5];
   private int [] salesman3 = new int [5];
   private int [] salesman4 = new int [5];
   private int product1Total;
   private int product2Total;
   private int product3Total;
   private int product4Total;
   private int product5Total;
   private int salesman1Total;
   private int salesman2Total;
   private int salesman3Total;
   private int salesman4Total;
   private int allProductTotals;
   
	//************************************
   // constructor
   //************************************
	public MySales11 (Scanner scan) {
      //scan and find # of entries
		while (scan.hasNext()){
			String line = scan.nextLine();
         allLines.add(line);
		}
      //define size of AllSales array
      allSales = new int[allLines.size()][3];
      //populate AllSales array with list ArrayList
      for(int a = 0; a < allSales.length; a++){
         String[] tokens = allLines.get(a).split("\\s+");
         for(int b = 0; b < tokens.length; b++){
            allSales[a][b] = Integer.parseInt(tokens[b]);
         } 
      }
      displayHeader();
      processAllSales();
      calculateSales();
      displaySales();
      System.out.print("\n\n");
      displayHistogram();
	}
   
   //************************************
   // displayHeader
   //************************************
   private void displayHeader(){
      System.out.println("*************** MySales11 ***************");
   }
   
   //************************************
   // processAllSales
   //************************************
   private void processAllSales(){
      //populate salesman arrays
      for(int a = 0; a < allSales.length; a++){
         //salesman 1
         if (allSales[a][0] == 1){
            int b = allSales[a][1]-1;
            salesman1[b] += allSales[a][2];
         }
         //salesman 2
         if (allSales[a][0] == 2){
            int b = allSales[a][1]-1;
            salesman2[b] += allSales[a][2];
         }
         //salesman 3
         if (allSales[a][0] == 3){
            int b = allSales[a][1]-1;
            salesman3[b] += allSales[a][2];
         }
         //salesman 4
         if (allSales[a][0] == 4){
            int b = allSales[a][1]-1;
            salesman4[b] += allSales[a][2];
         }
      }
   }
   
   //************************************
   // calculateSales
   //************************************
   private void calculateSales(){
      //product totals
      product1Total = salesman1[0] + salesman2[0] + salesman3[0] + salesman4[0];
      product2Total = salesman1[1] + salesman2[1] + salesman3[1] + salesman4[1];
      product3Total = salesman1[2] + salesman2[2] + salesman3[2] + salesman4[2];
      product4Total = salesman1[3] + salesman2[3] + salesman3[3] + salesman4[3];
      product5Total = salesman1[4] + salesman2[4] + salesman3[4] + salesman4[4];
      //salesmen totals
      salesman1Total = salesman1[0] + salesman1[1] + salesman1[2] + salesman1[3] + salesman1[4];
      salesman2Total = salesman2[0] + salesman2[1] + salesman2[2] + salesman2[3] + salesman2[4];
      salesman3Total = salesman3[0] + salesman3[1] + salesman3[2] + salesman3[3] + salesman3[4];
      salesman4Total = salesman4[0] + salesman4[1] + salesman4[2] + salesman4[3] + salesman4[4];
      //all product totals
      allProductTotals = product1Total + product2Total + product3Total + product4Total + product5Total;
   }
   
   //************************************
   // displaySales
   //************************************
   private void displaySales(){
      System.out.printf(  "%10s%5s%5s%5s%5s%10s","Salesman: ","1","2","3","4","Total");
      System.out.printf("\n%10s%5d%5d%5d%5d%10d","Product 1:",salesman1[0],salesman2[0],salesman3[0],salesman4[0],product1Total);
      System.out.printf("\n%10s%5d%5d%5d%5d%10d","Product 2:",salesman1[1],salesman2[1],salesman3[1],salesman4[1],product2Total);
      System.out.printf("\n%10s%5d%5d%5d%5d%10d","Product 3:",salesman1[2],salesman2[2],salesman3[2],salesman4[2],product3Total);
      System.out.printf("\n%10s%5d%5d%5d%5d%10d","Product 4:",salesman1[3],salesman2[3],salesman3[3],salesman4[3],product4Total);
      System.out.printf("\n%10s%5d%5d%5d%5d%10d","Product 5:",salesman1[4],salesman2[4],salesman3[4],salesman4[4],product5Total);
      System.out.printf("\n%10s%5d%5d%5d%5d%10d","Totals:   ",salesman1Total,salesman2Total,salesman3Total,salesman4Total,allProductTotals);
   }
   
   //************************************
   // displayHistogram
   //************************************
   private void displayHistogram(){
      //products sold
      System.out.println("Product 1: " + printAsterisks(product1Total));
      System.out.println("Product 2: " + printAsterisks(product2Total));
      System.out.println("Product 3: " + printAsterisks(product3Total));
      System.out.println("Product 4: " + printAsterisks(product4Total));
      System.out.println("Product 5: " + printAsterisks(product5Total));
      System.out.println();
      //sold by salesmen
      System.out.println("Salesman 1: " + printAsterisks(salesman1Total));
      System.out.println("Salesman 2: " + printAsterisks(salesman2Total));
      System.out.println("Salesman 3: " + printAsterisks(salesman3Total));
      System.out.println("Salesman 4: " + printAsterisks(salesman4Total));
      System.out.println();
      //total sold
      System.out.println("Total: " + printAsterisks(allProductTotals));
   }
   
   //************************************
   // printAsterisks
   //************************************
   private String printAsterisks (int a){
      int numberOfAsterisks = a/100;
      String asterisks = "";
      for(int i = 0; i < numberOfAsterisks; i++){
         asterisks += "*";
      }
      return asterisks;
   }
}