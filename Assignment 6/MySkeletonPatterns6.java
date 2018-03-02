//Purpose:	Skeleton for a menu-driven program
//Input:		User's selection
//Output:	Messages
//Author;	Fares
//Program:	
//Date:		
//

import java.util.Scanner; 
public class MySkeletonPatterns6{

	// Declarations
    Scanner scan = new Scanner(System.in);
	 String outputString, outMessage;
	 MyPatterns6 p;
	 int option = 1;
	 int lines;
	
	 public MySkeletonPatterns6(){
 	 
	 outputString =  "\n\t1  Display Pattern I" +
	 					  "\n\t2  Display Pattern II" +
      				  "\n\t3  Display Pattern III" +
						  "\n\t4  Display Pattern IV" + 
						  "\n\t5  Display Pattern V" +
						  "\n\t6  Display MyPattern" +
						  "\n\t7  Display All Patterns" +		
						  "\n\n\n\t0  Quit\n\n\n";
		displayMenu();
		}

  	public void displayMenu() {
		  	System.out.println(outputString);
			System.out.print("\tEnter your selection:   ");
			option = scan.nextInt();
			MyPatterns6 p = new MyPatterns6();	
			System.out.print("\tEnter (a single digit) number of lines:   ");
			lines = scan.nextInt();		
		  	
			 // Keep reading data until the user enters 0
		    while (option != 0) {
					    			
					switch (option) {
			
						case 1:  // write the code to invoke the method to display Pattern I
								 	p.displayPatternI (lines);
									break;
							
						case 2: 	// write the code to invoke the method to display Pattern II
									p.displayPatternII(lines);
			  						break;
					
						case 3:	// write the code to invoke the method to display Pattern III
		 							p.displayPatternIII(lines);
			  						break;
				
						case 4: 	// write the code to invoke the method to display Pattern IV
									p.displayPatternIV(lines);
									break;
					
						case 5: 	// write the code to invoke the method to display Pattern V
									p.displayPatternV(lines);
									break;
									
						case 6:  //write the code to invoke the method to display your own pattern
									p.displayPatternVI(lines);
									break;
		
						case 7: 	// write the code to invoke all the methods to display all Patterns
									p.displayPatternI(lines);
									p.displayPatternII(lines);
									p.displayPatternIII(lines);
									p.displayPatternIV(lines);
									p.displayPatternV(lines);
									p.displayPatternVI(lines);
									break;
					
						default: outMessage= "\nInvalid Selection\n";
			  						System.out.println(outMessage);
			  						break;
					}// end of switch
		
				System.out.println(outputString);
				System.out.print("\tEnter your selection:   ");
				option = scan.nextInt();	
			 
		    }// end of while loop
		
		    
		  }// end of main method
  
 
}// end of class
