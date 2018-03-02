//******************************************************
// Purpose: Driver that creates address objects, student  
//          objects, course objects, and assigns grades
//          to the students and finds class averages and
//          calls roll for both courses.
// Author:  Arron Croft and Zach Spencer
// Date:    10/16/15
// Class:   CS1301 A
//******************************************************

public class MyCourseList8 {
   public static void main (String [] args) {
      //create a school object
      Address school = new Address("800 Lancaster Ave.", "Villanova",
                                   "PA", 19085);
      //create home address objects for a number of students
      Address home1 = new Address("21 Jump Street", "Blacksburg",
                                  "VA", 24551);
      Address home2 = new Address("123 Main Street", "Euclid", "OH",  
                                  44132);
      Address home3 = new Address("5248 Fortress Circle", "Valdosta",
                                  "GA", 31605);
      Address home4 = new Address("505 Cedar Drive", "Nashville",
                                  "GA", 31639);
      //create students
      Student student1 = new Student("Rick","Sanchez",home1,school,99,100,97,94);
      Student student2 = new Student("Morty","Smith" ,home2,school,14,28,37,55);  
      Student student3 = new Student("Zach","Spencer",home3,school,98,89,86,95);
      Student student4 = new Student("Arron","Croft" ,home4,school,84,99,90,75);
      //create a CS1301 A course
      Course cs1301A = new Course("CS1301 A");
      //create a CS1301 B course
      Course cs1301B = new Course("CS1301 B");    
      //assign some students to CS1301 A
      cs1301A.addStudent(student1);
      cs1301A.addStudent(student2);
      //assign some students to CS1301 B
      cs1301B.addStudent(student3);                                    
      cs1301B.addStudent(student4);
      //get the averages of the 2 courses
      System.out.println("*** Averages of CS1301 Courses ***");
      System.out.println("CS1301 A: "+cs1301A.average());
      System.out.println("CS1301 B: "+cs1301B.average());
      //display the roll for the 2 courses
      System.out.println("\n*** Roll Call ***");
      cs1301A.roll();
      cs1301B.roll();                                      
   }
}