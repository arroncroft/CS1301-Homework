//*************************************************************************
//Purpose:  Processing text files and ArrayLists
//
//Author:   Fares
//Date:     10/20/2015
//Course:   CS1301
//
//*************************************************************************
import java.util.*;
import java.io.*;
public class MyTokens9_Tester {
   public static void main (String [] args) throws IOException {
      //input text file
		File infile1 = new File ("data9.txt"); //text lines
		Scanner scan = new Scanner (infile1);
      
      MyTokens9 mt = new MyTokens9 (scan);
      
      mt.processAllTokens();
      mt.processCharacters();
      mt.displayAllLists();
      System.out.println();
      System.out.println (mt);
       
   }
}