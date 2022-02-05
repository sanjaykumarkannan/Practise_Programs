import java.io.*;
import java.util.*;
public class Digital_Question_1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int len=input.length();
		int i=0;
		while(i<len){
			System.out.println(input.charAt(i));
			if(input.charAt(i)=='7'){
				input=input.substring(0,i)+input.substring(i+1,len);
				len=input.length();
				i=i-1;
				//System.out.println(input);
			}
			else if(input.charAt(i) == '5'){
				if(input.charAt(i+1) == '6'){
					input=input.substring(0,i)+input.substring(i+2,len);
					len=input.length();
					i=i-1;
				}
			}
			i++;			
		}
		System.out.println("Length of string is "+len);
		System.out.println("Output "+input);
		
	}
}