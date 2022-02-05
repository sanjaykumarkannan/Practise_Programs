/*
Your task is to implement the function strstr. The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s. The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).

Note: You are not allowed to use inbuilt function.

Example 1:
Input:
s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.

Example 2:
Input:
s = GeeksForGeeks, x = For
Output: 5
Explanation: For is present as substring
in GeeksForGeeks from index 5 (0 based
indexing).
*/
import java.io.*;
import java.util.*;

public class StringIndex{
	
	public static void main(String args[]){
		
//		System.out.println("Index is "+findIndex("GeeksForGeeks","Fr"));
		System.out.println("Index is "+findIndex("SanjayKumarKannan","Kannan"));
	}
	
	public static int findIndex(String main,String sub){
		char f=sub.charAt(0);
		boolean match=false;
		for(int i=0;i<main.length();i++){
			if(f == main.charAt(i)){
				match=isSubstring(main.substring(i,main.length()),sub);
				if(match){
					return i;
				}
				else{
					continue;
				}
			}
		}
		return -1;
	}
	
	public static boolean isSubstring(String main,String sub){
		boolean match=false;
		int len=sub.length();
		int count=0;
		for(int i=0;i<sub.length();i++){
			if(sub.charAt(i)==main.charAt(i)){
				count++;
			}
		}
		if(count==len){
			match=true;
		}
		return match;
	}
}