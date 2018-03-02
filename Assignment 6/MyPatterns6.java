public class MyPatterns6 {
	public MyPatterns6() {
	}
	
	public void displayPatternI(int lines) {
	   System.out.println("\n\tPattern I\n");
		for (int i = 1; i <= lines; i++){
		   for (int j = 1; j <= i; j++)
			   System.out.print (j + " " );
			System.out.println();
		}
	}
 
 	public void displayPatternII (int lines) {
  		System.out.println("\n\tPattern II\n");
	   for (int i = lines; i >= 0; i--){
		   for (int j = 1; j <= i; j++)
			   System.out.print (" " + j);
			System.out.println();
		}
   }

 	public void displayPatternIII (int lines) {
  		System.out.println("\n\tPattern III\n");
	   for (int i = lines; i >= 0; i--){
		   for (int j = 1; j <= i; j++)
			   System.out.print (" ");
         for (int j = lines; j >= i+1; j--)
			   System.out.print (j);
			System.out.println();
		}
   }


	public void displayPatternIV (int lines) {
     	System.out.println("\n\tPattern IV\n");
	   for (int i = lines; i >= 0; i--){
		   for (int j = 1; j <= i; j++)
			   System.out.print (" ");
         for (int j = 1; j <= lines-i; j++) 
			   System.out.print (j);                                   
			System.out.println();
		}
   }

	public void displayPatternV (int lines) {
  		System.out.println("\n\tPattern V\n");
      for (int i = 1; i <= lines; i++){  
         for (int j = 1; j <= lines - i; j++)  
             System.out.print(" ");  
         for (int k = i; k >= 1; k--)  
             System.out.print(k);  
         for (int k = 2; k <= i; k++)  
             System.out.print(k);  
         System.out.println();  
      }
	}

	public void displayPatternVI (int lines){                                       
  		System.out.println("\n\tMy Own Pattern\n");
      System.out.print("\tThis pattern adds 1 to the middle\n");
      System.out.print("\tnumber as it goes down, and      \n");
      System.out.print("\tcounts outward to 1 on each side.\n");
		for (int i = 1; i <= lines; i++){  
         for (int j = 1; j <= lines - i; j++)  
             System.out.print(" ");
         for (int k = 1; k <= i; k++)
             System.out.print(k);  
         for (int k =(i-1); k >= 1; k--)  
             System.out.print(k);    
         System.out.println();  
        }
   }
}