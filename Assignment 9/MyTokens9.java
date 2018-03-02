//*************************************************************************
// Purpose:  Read a data file line by line, token by token, and dissect
//           it into ArrayLists and count characters, numbers, etc.
// Author:   Arron Croft and Zach Spencer
// Date:     10/27/2015
// Course:   CS 1301 A
//*************************************************************************
import java.util.*;
import java.io.*;
public class MyTokens9 {
   //variables
   ArrayList<String> allLines = new ArrayList<String>();
   ArrayList<String> allTokens = new ArrayList<String>(); 
   ArrayList<String> alpha = new ArrayList<String>();
   ArrayList<String> others = new ArrayList<String>(); 
   ArrayList<Integer> numeric = new ArrayList<Integer>();
   String longestToken = "";
   int numberOfLines;
   int numberOfTokens;
   int numberOfCharacters;
   int numberOfLetters;
   int numberOfDigits;
   int numberOfAlphaTokens;
   int numberOfNumericValues;
   int numberOfOtherTokens;
   double averageOfNumericValue;
   
   //constructor
   public MyTokens9 (Scanner scan){
      numberOfLines = 0;
      String line;
      while(scan.hasNext()){
         line = scan.nextLine();
         allLines.add(line);
         numberOfLines++;
      }
   }
   
   public void processAllTokens(){
      String alphaPattern = "^[A-Za-z]*$";
      String integerPattern = "^[0-9]*$";
      String token;
      String line;
      for (int i=0; i<allLines.size(); i++){
         line = allLines.get(i);
         Scanner scanLine = new Scanner(line);
         scanLine.useDelimiter("[ .,:;!?]+");
         while(scanLine.hasNext()){
            token = scanLine.next();
            allTokens.add(token);
            if (token.matches(alphaPattern)){
               alpha.add(token);
               numberOfAlphaTokens++;
            }
            else if (token.matches(integerPattern)){
               numeric.add(Integer.parseInt(token));
               numberOfNumericValues++;
            }
            else {
               others.add(token);
               numberOfOtherTokens++;
            }
            numberOfTokens++;
         }
      }
      //find longest token
      int longest = 0;
      for (int i=0; i<allTokens.size(); i++){
         if (longest < allTokens.get(i).length()){
            longest = allTokens.get(i).length();
            longestToken = allTokens.get(i);
         }
      }
      //find number of characters
      for (int i=0; i<allLines.size(); i++){
         numberOfCharacters += allLines.get(i).length();
      }
   }
   
   public void processCharacters(){
      //count numberOfLetters in alpha and others
      int longest = 0;
      for (int i=0; i<alpha.size(); i++){
         numberOfLetters += alpha.get(i).length();
      }
      for (int i=0; i<others.size(); i++){
         String at = others.get(i);
         for (int j=0; j<at.length(); j++){
            if (Character.isLetter(at.charAt(j))){
               numberOfLetters++;
            }
         }
      } 
      //count numbersOfDigits in numeric 
      for (int i=0; i<numeric.size(); i++){
         String stringOfInteger = Integer.toString(numeric.get(i));
         numberOfDigits += stringOfInteger.length();
      }
      for (int i=0; i<others.size(); i++){
         String at = others.get(i);
         for (int j=0; j<at.length(); j++){
            if (Character.isDigit(at.charAt(j)))
               numberOfDigits++;
         }
      }
   }
   
   private void displayStringArrayList(ArrayList<String> list){
      for (int i=0; i<list.size(); i++){
         System.out.printf("\n%-5d%-30s",i+1,list.get(i));
      }
   }

   private void displayIntegerArrayList(ArrayList<Integer> list){
      for (int i=0; i<list.size(); i++){
         System.out.printf("\n%-5d%-30d",i+1,list.get(i));
      }
   }
   
   private void averageOfNumericValue(ArrayList<Integer> list){
      double sum = 0;
      for (int i=0; i<list.size(); i++){
           sum += list.get(i);
      }
      averageOfNumericValue = sum/list.size();
   }
   
   public void displayAllLists(){
      System.out.println("\n\n\tallLines:");
      displayStringArrayList(allLines);
      System.out.println("\n\n\talpha:");
      displayStringArrayList(alpha);
      System.out.println("\n\n\tothers:");
      displayStringArrayList(others);
      System.out.println("\n\n\tnumeric:");
      displayIntegerArrayList(numeric);
      averageOfNumericValue(numeric);
   }
   
   public String toString(){
      String result;
      result = "\nLongest Token:            \t" + longestToken +
               "\nNumber of Lines:          \t" + numberOfLines +
               "\nNumber of Tokens:         \t" + numberOfTokens +
               "\nNumber of Characters:     \t" + numberOfCharacters +
               "\nNumber of Letters:        \t" + numberOfLetters +
               "\nNumber of Digits:         \t" + numberOfDigits +
               "\nNumber of Alpha Tokens:   \t" + numberOfAlphaTokens +
               "\nNumber of Numeric Values: \t" + numberOfNumericValues +
               "\nNumber of Other Tokens:   \t" + numberOfOtherTokens + "\n" +
               "\nAverage of Numeric Value: \t" + averageOfNumericValue ;
      return result;
   }
}