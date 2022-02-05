import java.io.*;
import java.util.*;

public class StockPrice{
	public static void main(String args[]){
		int profit=0;
		int arr[]=new int[]{20,30,12,40,100,53,400};
		//int arr[]=new int[]{10,18,26,31,4,53,69};
		//int arr[]=new int[]{98,75,48,15,6,5,2};
		int buy=arr[0];
		int sell=0;
		for(int i=1;i<arr.length-1;i++){
			if(arr[i+1]<arr[i] && arr[i]>buy){
				sell=arr[i];
				profit+=sell-buy;
				buy=arr[i+1];
			}
		}
		sell=arr[arr.length-1];
		profit+=sell-buy;
		if(profit<0){
			profit=0;
		}	
		System.out.println("Profit is "+profit);
	}
}