/*5.Largest Sum Contiguous Subarray
(Kadane' Algorithm )*/
/*
Algorithm:-
Initialize:
    max_so_far = 0
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_ending_here < 0)
            max_ending_here = 0
  (c) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
return max_so_far*/
class KadanesAlgorithm
{
  public static void main(String args[])
  {
  int arr[]={-2,-4,5,-1,-7,-2,4,8,-9}  ;
  int curr_max=0,max_so_far=0;
  for(int i=0;i<arr.length;i++)
  {
    curr_max+=arr[i];
    if(curr_max<0)
    {
      curr_max=0;
    }
    if(curr_max>max_so_far)
  {
    max_so_far=curr_max;
  }
  }
  System.out.println(max_so_far);
  }
}
