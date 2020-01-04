import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
class MergeSort
{
  public void merge(int arr[],int l,int m,int r)
  {
  int  a1=m-l+1;
  int  a2=r-m;
    int L[]=new int[a1];
    int R[]=new int[a2];
    for(int i=0;i<a1;i++)
    {
      L[i]=arr[l+i];
    }
    for(int j=0;j<a2;j++)
    {
      R[j]=arr[m+1+j];
    }
  int i=0,j=0,k=l;
  while(i<a1 && j<a2)
  {
    if(L[i]<=R[j])
    {
      arr[k]=L[i];
      i++;
      k++;
    }
    else
    {
      arr[k]=R[j];
      j++;
      k++;
    }
  }

  while(i<a1)
  {
    arr[k]=L[i];
    i++;
    k++;
  }

  while(j<a2)
  {
    arr[k]=R[j];
    j++;
    k++;
  }
  }

  public void sort(int arr[],int l,int r)
  {
    if(l<r)
    {
    int m=(l+r)/2;
    sort(arr,l,m);
    sort(arr,m+1,r);

    merge(arr,l,m,r);
    }
  }
  public static void main(String args[])
  {
    int arr[]={10,1,20,30,15,7,48};
    int len=arr.length;
    MergeSort ms=new MergeSort();
    ms.sort(arr,0,len-1);

    System.out.println("Sorted array is:");
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
