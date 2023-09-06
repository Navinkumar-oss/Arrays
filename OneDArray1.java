// Write a program that creates integer array of 10 elements, accepts values of arrays and then displays the values.
import java.util.*; 
class OneDArray1
{
   public static void main(String[] args) 
   { 
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter 10 array elements");
      int[] array=new int[10];
      for(int i=0; i<array.length; i++)
      {
        array[i]=sc.nextInt();
        //System.out.println(array[i] );
      }
      for(int j=0; j<array.length; j++)
      {
        System.out.print(array[j] +" ");
      }
   } 
}