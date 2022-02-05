import java.io.*;
import java.util.*;

public class QToExit{
	public static void main(String args[]){
		ArrayList<Integer> array=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		String inp="";
		//System.out.println(Integer.parseInt("q"));
		while(!"q".equals(inp)){
			inp=sc.nextLine();
			if("q".equals(inp))
			{
				break;
			}
			else
			{
				array.add(Integer.parseInt(inp));
			}
		}
		System.out.println("Program closing bcoz u entered q!");
	}
}