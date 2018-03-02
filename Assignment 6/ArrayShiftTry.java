public class ArrayShiftTry{
   public static void main(String[] args){
      int[]array=new int[10];
      for(int i=0;i<array.length;i++){
      array[i]=i;
      }
      int shift = 4;
      
      for(int i = 0; i < array.length; i++){
      System.out.print(array[i]+ "  ");
      }
         
      int[]backup=new int [4];
      for(int i=array.length-shift, j=0;i<array.length;i++,j++){
      backup[j]=array[i];
      }
      
      for(int i=array.length-1;i>=shift;i--){
      array[i]=array[i-shift];
      }
      
      for(int i=0;i<shift;i++){
      array[i]=backup[i];
      }
      
      System.out.printf("\n\n");

      for(int i=0;i<array.length;i++){
      System.out.print(array[i]+ "  ");
      }
      
   }
}