//Write a program that creates integer array of 10 elements, accepts values of arrays and Find Sum, Average, Min, Max.
import java.util.*; 
class OneDArray3
{
   public static void main(String[] args) 
   { 
       int sum=0;
       double Average;
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter 10 array elements");
      int[] array=new int[10];
      for(int i=0; i<array.length; i++)
      {
        array[i]=sc.nextInt();
        //System.out.println(array[i] );
      }
      int max=array[0];
      int min=array[0];
      for(int j=0; j<array.length; j++)
      {
        if(min>array[j])
        {
            min=array[j];
        }
        if(max<array[j])
        {
            max=array[j];
        }
        sum+= array[j];
      }
      Average = (double) sum/ array.length;
      System.out.println("Min:"+min);
      System.out.println("Max:"+max);
      System.out.println("Sum:"+sum);
      System.out.println("Average:"+Average);
   } 
}