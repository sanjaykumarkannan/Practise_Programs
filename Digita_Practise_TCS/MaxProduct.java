import java.io.*;
import java.lang.*;
import java.util.*;

public class MaxProduct{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int maxProduct=1;
		int maxQuadruplet[]=new int[4];
		System.out.println("Enter any no b/w 4 and 100,000");
		int n=sc.nextInt();
		
		if(n<4 || n>100000){
			System.out.println("Invalid Input");
		}
		else{
			System.out.println("No is okay");
			int arr[]=new int[n];
			System.out.println("Enter "+n+" values for the array :");
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println("**********Calculating Max Product**********");
			for(int i=0;i<n-3;i++){
				for(int j=i+1;j<n-2;j++){
					for(int k=j+1;k<n-1;k++){
						for(int l=k+1;l<n;l++){
							if(maxProduct<arr[i]*arr[j]*arr[k]*arr[l]){
								maxProduct=arr[i]*arr[j]*arr[k]*arr[l];
								maxQuadruplet[0]=i;
								maxQuadruplet[1]=j;
								maxQuadruplet[2]=k;
								maxQuadruplet[3]=l;
							}
						}
					}
				}
			}
			System.out.println("Max product is " + maxProduct);
			System.out.println("Max quadruplet is [" + maxQuadruplet[0] +","+ maxQuadruplet[1] +","+ maxQuadruplet[2] +","+ maxQuadruplet[3]+"]");
		}
	}
		
}