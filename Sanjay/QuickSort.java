import java.io.*;
import java.util.Arrays;
class QuickSort
{
  public int partition(int arr[],int low,int high)
  {
    int pivot=arr[high];
    int i=low-1;
    //int j=low;
    for(int j=low;j<high;j++)
    {
      if(arr[j]<=arr[high])
      {
        i++;
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
      }
    }
    //this step puts the pivot element in its right position
    int temp=arr[i+1];
    arr[i+1]=pivot;
    arr[high]=temp;
    return i+1;
  }
  public void quick_sort(int arr[],int low,int high)
  {
    if(low<high)
    {
      int pi=partition(arr,low,high);
      quick_sort(arr,low,pi-1);
      quick_sort(arr,pi+1,high);
    }
  }
  public static void main(String args[])
  {
    int arr[]={10,5,30,35,20,5,40};
    int len=arr.length;
    QuickSort qs=new QuickSort();
    qs.quick_sort(arr,0,len-1);

    for(int i=0;i<len-1;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
