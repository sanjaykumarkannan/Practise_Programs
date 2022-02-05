import java.io.*;
import java.util.*;

public class LongestPrefix{
	static String longPrefix="";
	public static void main(String args[]){
		//String arr[]=new String[]{"geeksforgeeks", "geeks", "geek", "geezer"};
		String arr[]=new String[]{"hello", "world"};
		//System.out.println(arr[0].substring(0,4));
		findLongestPrefix(arr);
		if(longPrefix!="")
			System.out.println("Longest prefix is "+longPrefix);
		else	
			System.out.println("There is no common prefix for the passed strings ! ");
	}
	
	public static void findLongestPrefix(String arr[]){
		int size=1;
		String smallString=findSmallestString(arr);
		String str=smallString.substring(0,size);
		boolean loopOut=false;
		for (int s=0;s<smallString.length();s++){
			for(int i=0;i<arr.length;i++){
				if(arr[i].indexOf(str) == -1){
					loopOut=true;
					break;
				}
			}
			if(loopOut){
				break;
			}
			else{
				size++;
				str=smallString.substring(0,size);
			}
		}
		longPrefix=str.length()>1 ? str : "" ;
	}
	
	public static String findSmallestString(String arr[]){
		int indexOfSmallest=0;
		for(int i=1;i<arr.length;i++){
			if(arr[indexOfSmallest].length()>arr[i].length()){
				indexOfSmallest=i;
			}
		}
		return arr[indexOfSmallest];
	}
}