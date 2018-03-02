//***********************************************************
//Purpose:  Tests MySales11
//Author:   Arron Croft and Zach Spencer
//Course:   CS1301 A
//Date:     11/26/2015
//Program:  MySales11_Tester.java
//************************************************************ 
import java.util.Scanner;
import java.io.*;

public class MySales11_Tester {
   public static void main (String [] args) throws IOException {
      //create Scanner for data11 input file
      Scanner scan = new Scanner (new File ("data11.txt"));
      //create MySales11 object that accepts above Scanner
      MySales11 ms11 = new MySales11(scan);
   }
}