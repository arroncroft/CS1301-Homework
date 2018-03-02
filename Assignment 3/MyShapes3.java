//*************************************************************
//	Purpose:	   MyShapes3 reads a radius and height to calculate        
//             circle, sphere, and cylinder measurements.	 
//	Input:		Radius and Cylinder Height                    
//	Output:		Displays input values, circle measurements,
//			      sphere measurements, and cylinder measurements
//             using the provided integers.
//	Author:		Arron Croft
//	Date:		   9/3/15
//	Class:		CS1301 A
//	Program:	   #3 (MyShapes3.java)
//*************************************************************
import java.util.Scanner;
import java.util.Date;
public class MyShapes3 {
   //Declarations
   static Scanner scan = new Scanner(System.in);
   static Date date = new Date();
   static int radius,cylinderHeight;
   static double circleArea,circumference;
   static double sphereVolume,sphereSurfaceArea;
   static double cylinderVolume,cylinderSurfaceArea;
   
   //**********************************************************
   //main method
   //**********************************************************
	public static void main (String [] args){
      readData();
      calculations();
      printHeader();
      printOutput();
      printFooter();
   }
   
   //**********************************************************
   //readData method
   //**********************************************************
   public static void readData() {
      System.out.printf("%-35s","Enter radius (integer):");
      radius = scan.nextInt();
      System.out.printf("%-35s","Enter cylinder height (integer):");
      cylinderHeight = scan.nextInt();
   }
   
   //**********************************************************
   //calculations method
   //**********************************************************
   public static void calculations() {
      //Circle
      circleArea = Math.PI*Math.pow(radius,2);
      circumference = 2*Math.PI*(radius);
      //Sphere
      sphereVolume = (double) 4/3*Math.PI*Math.pow(radius,3);
      sphereSurfaceArea = 4*Math.PI*Math.pow(radius,2);
      //Cylinder
      cylinderVolume = Math.PI*Math.pow(radius,2)*cylinderHeight;
      cylinderSurfaceArea = 2*Math.PI*radius*cylinderHeight;
   }
   
   //**********************************************************
   //printHeader method
   //**********************************************************
   public static void printHeader() {
      System.out.printf("\n********************** Shapes Report **********************");
      System.out.printf("\n%-15s%-20s","Name:","Arron Croft");          
      System.out.printf("\n%-15s%-20s","Course:","CS1301 A");             
      System.out.printf("\n%-15s%-20s","Date:",date.toString());
      System.out.printf("\n***********************************************************");
   }
   
   //**********************************************************
   //printOutput method
   //**********************************************************
   public static void printOutput() {
      System.out.printf ("\n\nInput values:");
      System.out.printf ("\n\t%-30s%10d","Radius:",radius);
      System.out.printf ("\n\t%-30s%10d","Height:",cylinderHeight);
      System.out.printf ("\n\nCircle Measurements:");
      System.out.printf ("\n\t%-30s%10.2f","Circle Area:",circleArea);
      System.out.printf ("\n\t%-30s%10.2f","Circle Circumference:",circumference);
      System.out.printf ("\n\nSphere Measurements:");
      System.out.printf ("\n\t%-30s%10.2f","Sphere Volume:",sphereVolume);
      System.out.printf ("\n\t%-30s%10.2f","Sphere Surface Area:",sphereSurfaceArea);
      System.out.printf ("\n\nCylinder Measurements:");
      System.out.printf ("\n\t%-30s%10.2f","Cylinder Volume:",cylinderVolume);
      System.out.printf ("\n\t%-30s%10.2f","Cylinder Surface Area:",cylinderSurfaceArea);
   }
   
   //**********************************************************
   //printFooter method
   //**********************************************************
   public static void printFooter() {
      System.out.print("\n\n********************* Have a good day *********************");
   }
}

