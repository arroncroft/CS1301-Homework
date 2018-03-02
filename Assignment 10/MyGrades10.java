//***********************************************************
//Purpose:  Handles course grading. It receives course information
//          and students data.
//
//Input:    Passed from driver:
//          course information and student data.
//          Look at the data file. 
//          Have it work with the provided data file, but,
//          for bonus, make it general. variable number of students 
//          and variable number of tests
//
//Output:   See handout:
//          A header with course information
//          Students data. labels, names, scores, and grades
//          A footer. Tests averages and students with highest and 
//             lowest scores.
//
//Author:   Arron Croft and Zach Spencer
//Course:   CS1301 A
//Date:     11/7/2015
//Program:  MyGrades10.java
//************************************************************           
import java.text.*;
import java.util.Scanner;
public class MyGrades10 {
   //Declarations
   //Arrays and variables
	private String courseName;
	private String instructorName;
	private String semester;
	private String school;
	private int year;
	private int numberOfStudents;
	private int numberOfTests;
	private int studentWithHighestScore;
	private int studentWithLowestScore;
	
	private String [] names;
	private int [][] scores;
	private int [] studentsTotals;
	private char [] grade;
	private double [] testsAverages;
     
   private int lowestNumber = 0;
   private int highestNumber = 0;
   //********************************************************
   //Constructor: 
   //1. received arguments
   //2. functions:
   //   a. implemented in constructor
   //   b. implemented in other methods:
   //      1. computeStudentsTotals ();
   //      2. computeGrades();
   //      3. computeTestsAverages ();
   //      4. findStudentWithHighestTotal();
   //      5. findStudentWithLowestTotal();
   //      6. displayOutput();
   //         a. displayHeader();
   //         b. displayStudentsRecords ();
   //         c. displayFooter ();
   //******************************************************** 
   public MyGrades10 (Scanner scan){ 
		//reading course information
		courseName = scan.nextLine();
		instructorName = scan.nextLine();
		numberOfStudents = scan.nextInt();
		numberOfTests = scan.nextInt();
      scan.nextLine();
 		school = scan.nextLine();
		semester = scan.nextLine();
		year = scan.nextInt();
			
	   //create needed arrays
		names = new String [numberOfStudents];
		scores = new int [numberOfStudents][numberOfTests];
		studentsTotals = new int [numberOfStudents]; 
		grade = new char [numberOfStudents];
		testsAverages = new double [numberOfTests];
                     
      //reading students records
		for (int i=0; i<numberOfStudents; i++){
			names [i] = scan.next();
			for (int t=0; t<numberOfTests; t++)
				scores [i][t] = scan.nextInt();
		}//end of outer loop
		            
      //computing students' totals, grades, test averages,
      //highest total index, and lowest total index
      computeStudentsTotals();
      computeGrades();
      computeTestsAverages();
      findStudentWithHighestTotal();
      findStudentWithLowestTotal();
      
      //Printing output
      displayOutput();
   }
   
   //supportive methods
   private void computeStudentsTotals(){
      for (int i=0; i<scores.length; i++){
         for (int j=0; j<scores[0].length; j++){
            studentsTotals[i] += (scores[i][j]);
         }
      }
   }
   
   //******************************************
   // computeGrades: finds letter grade for
   //    students test average
   //******************************************
   private void computeGrades(){
      for (int i=0; i<grade.length; i++){
         if (studentsTotals[i]/numberOfTests >= 90)
            grade[i] = 'A';
         else if (studentsTotals[i]/numberOfTests >= 80)
            grade[i] = 'B';
         else if (studentsTotals[i]/numberOfTests >= 70)
            grade[i] = 'C';
         else if (studentsTotals[i]/numberOfTests >= 60)
            grade[i] = 'D';
         else
            grade[i] = 'F';
      }
   }
   
   //******************************************
   // computeTestsAverages: finds average of
   //    first and second test
   //******************************************
   private void computeTestsAverages(){
      for (int i=0; i<scores.length; i++){
         for (int j=0; j<scores[0].length; j++){
            testsAverages[0] += scores[i][0];
            testsAverages[1] += scores[i][1];
         }
      }
      testsAverages[0] = testsAverages[0]/(numberOfStudents*2);
      testsAverages[1] = testsAverages[1]/(numberOfStudents*2);
   }
   
   //******************************************
   // findStudentWithHighestTotal: finds the
   //    student with the highest total
   //******************************************
   private void findStudentWithHighestTotal(){
      studentWithHighestScore = studentsTotals[0];
      for (int i=0; i<studentsTotals.length; i++){
         if (studentsTotals[i]>studentWithHighestScore){
            studentWithHighestScore = studentsTotals[i];
            highestNumber = i;
         }
      }
   }
   
   //******************************************
   // findStudentWithLowestTotal: finds the
   //    student with the lowest total
   //******************************************
   private void findStudentWithLowestTotal(){
      studentWithLowestScore = studentsTotals[0];
      for (int i=0; i<studentsTotals.length; i++){
         if (studentsTotals[i]<studentWithLowestScore){
            studentWithLowestScore = studentsTotals[i];
            lowestNumber = i;
         }
      }
   }
   
   //******************************************
   // displayOutput: displays the header,
   //    body, and footer of the program
   //******************************************
   private void displayOutput(){
      displayHeader();
      displayStudentsRecords();
      displayFooter();
   }
   
   //******************************************
   // displayHeader: displays the header
   //    of the program, with the course name,
   //    semester, school, year, and 
   //    instructor's name
   //******************************************
   private void displayHeader(){
      System.out.print("*******************************************************************");
      System.out.println();
      System.out.print("\n\tCourse Name:       \t" + courseName);
      System.out.print("\n\tInstructor's Name: \t" + instructorName);
      System.out.print("\n\tSemester:          \t" + semester);
      System.out.print("\n\tYear:              \t" + year);
      System.out.print("\n\tSchool:            \t" + school);
      System.out.println();
      System.out.println();
      System.out.print("********************************************************************");
      System.out.println();
   }
   
   //******************************************
   // displayStudentsRecords: displays the
   //    main body of the program, the
   //    students' test scores and totals
   //******************************************
   private void displayStudentsRecords(){
      //top
      System.out.printf    ("\n%10s%15s%10s%10s%10s%10s","NUMBER","NAME",
                              "TEST1","TEST2","TOTAL","GRADE");
      System.out.println();
      //everything else
      for (int i=0; i<numberOfStudents; i++){
         System.out.printf ("\n%10d%15s%10d%10d%10d%10s",i+1,names[i],
                              scores[i][0],scores[i][1],studentsTotals[i],grade[i]);
      }
   }
   
   //******************************************
   // displayFooter: displays the averages
   //    of the tests and the lowest and 
   //    highest scoring students
   //******************************************
   private void displayFooter(){
      //averages
      System.out.printf("\n\n%25S%13.2f%10.2f","AVERAGES",testsAverages[0],testsAverages[1]);
      //student with lowest
      System.out.println("\n\n\tStudent with lowest average:");
      System.out.printf("%10s%15s%10d%10d%10d%10s","",names[lowestNumber],
                        scores[lowestNumber][0],scores[lowestNumber][1],
                        studentsTotals[lowestNumber],grade[lowestNumber]);
      //student with highest
      System.out.println("\n\n\tStudent with highest average:");
      System.out.printf("%10s%15s%10d%10d%10d%10s","",names[highestNumber],
                        scores[highestNumber][0],scores[highestNumber][1],
                        studentsTotals[highestNumber],grade[highestNumber]);
      System.out.println();
      System.out.print("********************************************************************");
   }
   
 }//end of class