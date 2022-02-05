//
import java.io.*;
import java.util.*;
import java.lang.*;
public class Digital_Question_2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int inp=sc.nextInt();
		int product=1;
		int quotient=0;
		while(inp>0){
			product=product * (inp%10);
			inp=inp/10;
		}
		System.out.println("Output "+product);
	}
}