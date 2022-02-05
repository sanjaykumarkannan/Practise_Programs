/*
Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. 
It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7
*/

public class KthSmallestElement{
	
	public static void main(String args[]){
		
		//int arr[]=new int[]{7,10,4,3,20,15};
		//int k=3;
		
		int arr[]=new int[]{7,10,4,20,15};
		int k=4;
		
		System.out.println("K th smallest element is "+findKthSmallest(arr,k));
	}
	
	public static int findKthSmallest(int arr[],int k){
		int sortedArray[]=sortArray(arr);
		System.out.println("Sorted array is :"+sortedArray.toString());
		return sortedArray[k-1];
	}
	
	public static int[] sortArray(int arr[]){
		int sArr[]=new int[arr.length];
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}