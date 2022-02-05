import java.util.*;
import java.io.*;

public class CasinoProgram{
	static int profit=0;
	static ArrayList<Integer> maxContiguous=new ArrayList<Integer>();
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();			
		}
		checkProfit(arr);
		System.out.println(maxContiguous.toString());
		System.out.println("Profit is "+Collections.max(maxContiguous));
	}
	public static void checkProfit(int arr[]){
		profit+=arr[0];
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]){
				profit+=arr[i+1];
			}
			else{
				//profit+=arr[i+1];//adding before storing in array
				maxContiguous.add(profit);
				profit=arr[i+1];
			}
		}
		maxContiguous.add(profit);
	}
}