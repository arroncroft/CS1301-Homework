//***************************************
// Purpose: Course class
// Author:  Arron Croft and Zach Spencer
// Date:    10/16/15
// Class:   CS1301 A
//***************************************

import java.util.*;
public class Course {
   //variables
   private String courseName;
   public ArrayList<Student> studentList = new ArrayList<> ();
   
   public Course (String courseName) {
      this.courseName = courseName;
   }
   
   public void addStudent (Student newStudent) {
      studentList.add(newStudent);
   }
   
   public double average () {
      double classAverage = 0;
      for (int i=0; i<studentList.size(); i++){
         classAverage += studentList.get(i).average();
      }
      classAverage = (classAverage/studentList.size());
      return classAverage;
   }
   
   public void roll () {
      for(int i = 0; i < studentList.size(); i++) {
         System.out.print(studentList.get(i));
      }
   }
}