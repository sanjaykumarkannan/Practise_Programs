/*4.
Given an array A[] and a number x,
check for pair in A[] with sum
as x.

Eg : Input {1, 2, 4, 3, 5, 6}
SUM : 5
Output : 2 (1, 4) & (2, 3)*/
class Program2
{
  public static void main(String args[])
  {
    Program2 p2=new Program2();
    int arr[]={1,2,3,4,5};
    int no=7;
    int count=0;
    for(int i=0;i<arr.length-1;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]+arr[j]==no)
        {
          count++;
          System.out.println("("+arr[i]+","+arr[j]+")");
        }
      }
    }
    System.out.println("Totally "+count+" combinations of this array makes "+no);
  }
}
