/*2. Given an array of integers of size n. Convert the array in such a way that if next valid number is same as current number,
 double its value and replace the next number with 0.
After the modification, rearrange the array such that all 0�s are shifted to the end.

Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0

Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output : 4 2 12 8 0 0 0 0 0 0*/
class Program1
{
  public static int arr[]=new int[]{2,3,1,1,0,4,4,6};
  public void arrange(int arr1[])
  {
    for(int i=0;i<arr1.length-1;i++)
    {
      if(arr1[i]==arr1[i+1])
      {
        arr1[i]=2*arr1[i];
        arr1[i+1]=0;
      }
    }
    for(int i=0;i<arr1.length;i++)
    {
      arr[i]=arr1[i];
    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+"\t");
    }
    System.out.print("\n");
    int counter=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==0)
      {
        continue;//this continue statement breaks current loop iteration and goes to next iteration
      }
      else
      {
        arr[counter]=arr[i];
        counter++;
      }
    }
    for(int i=counter;i<arr.length;i++)
    {
      arr[i]=0;
    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+"\t");
    }
  }
  public static void main(String args[])
  {
    Program1 p=new Program1();
    p.arrange(arr);
  }
}
