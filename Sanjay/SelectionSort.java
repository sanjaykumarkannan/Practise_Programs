import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort
{

  public void selection(int arr[])
  {

    int l=arr.length;
    for(int i=0;i<l-1;i++)
    {
      for(int j=i+1;j<l;j++)
      {
        if(arr[i]>arr[j])
        {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length of array:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the array elements:");
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    SelectionSort s=new SelectionSort();
    s.selection(arr);
    System.out.println("Sorted array is:");
    for(int i=0;i<size;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
