//***************************************
// Purpose: Student class
// Author:  Arron Croft and Zach Spencer
// Date:    10/16/15
// Class:   CS1301 A
//***************************************

public class Student
{
   //variables
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int test1, test2, test3, test4;
   private final double NUM_TESTS = 4;

   //-----------------------------------------------------------------
   //  Constructors: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Student(String first, String last, Address home,
                  Address school) {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
   }
   
   public Student(String first, String last, Address home,
                  Address school, int test1, int test2,
                  int test3, int test4) {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      this.test1 = test1;
      this.test2 = test2;
      this.test3 = test3;
      this.test4 = test4;
   }

   //-----------------------------------------------------------------
   //  Returns a string description of this Student object.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;
      
      result =  "----------------------------------\n";
      result += firstName + " " + lastName + "\n";
      result += "----------------------------------\n";
      result += "Home Address:\n" + homeAddress + "\n\n";
      result += "School Address:\n" + schoolAddress + "\n\n";
      result += "Test 1 Score: " + test1 + "\n";
      result += "Test 2 Score: " + test2 + "\n";
      result += "Test 3 Score: " + test3 + "\n";
      result += "Test 4 Score: " + test4 + "\n";
      result += "Average Test Score: " + average() + "\n\n";

      return result;
   }
   
   //-----------------------------------------------------------------
   //  setTestScore: Asks for and sets the number and score of the 
   //                test.
   //-----------------------------------------------------------------
   public void setTestScore (int testNumber, int score) {
      if (testNumber == 1) {
         test1 = score;
      }
      else if (testNumber == 2) {
         test2 = score;
      }
      else if (testNumber == 3) {
         test3 = score;
      }
      else if (testNumber == 4) {
         test4 = score;
      }  
   } 
   
   //-----------------------------------------------------------------
   //  getTestScore: Asks for number of test, and returns score.
   //-----------------------------------------------------------------
   public int getTestScore (int testNumber) {
      if (testNumber == 1) {
         return test1;
      }
      else if (testNumber == 2) {
         return test2;
      }
      else if (testNumber == 3) {
         return test3;
      }
      else if (testNumber == 4) {
         return test4;
      }
      return -99;
   }
   
   //-----------------------------------------------------------------
   //  Average: Calculates the average of the 4 test scores.
   //-----------------------------------------------------------------
   public double average () {
      double average = (test1 + test2 + test3 + test4)/NUM_TESTS;
      return average;
   }
}
