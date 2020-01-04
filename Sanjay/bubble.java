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
      
      for(int i=size-1;i>0;i--)
      {
        for(int j=0;j<i;j++)
        {
          if(arr[j]>arr[j+1])
          {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
        }  
      }
      System.out.println("Array after sorting:");
      for(int i=0;i<size;i++)
      {
        System.out.println(arr[i]);
      }
      //System.out.println(Arrays.toString(arr));
  }
}
