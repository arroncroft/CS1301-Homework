import java.io.*;
import java.util.*;

public class MyGrades10_Tester {
   public static void main (String [] args)throws IOException{
   //input text file
		File infile1 = new File ("data10B.txt"); //text lines
		Scanner scan = new Scanner (infile1);
      
      MyGrades10 mk = new MyGrades10 (scan);    
	} // end of main method

}// end of MyGrades10_Tester