//import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class bubble
{
  public static void main(String args[])
  {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of your array:");
      int size=s.nextInt();
      int arr[]=new int[10];
      for(int i=0;i<size;i++)
      {
        arr[i]=s.nextInt();
      }
      System.out.println("Your new array is:");
      for(int i=0;i<size;i++)
      {
        System.out.println(arr[i]);
      }
      //System.out.println(Arrays.toString(arr));
  }
}
