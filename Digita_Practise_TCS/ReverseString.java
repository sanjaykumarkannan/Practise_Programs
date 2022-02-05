import java.util.Scanner;
public class ReverseString{
	public static void main(String args[]){
		String revString="";
		int pos_holder=0;
		System.out.println("Reverse string starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string :");
		String value=sc.nextLine();
		System.out.println(value.substring(0,2));
		//System.out.println(value.substring(10,21));
		pos_holder=value.length();
		System.out.println("String length is "+pos_holder);
		for(int i=pos_holder-1;i>=0;i--){
			if(value.charAt(i) == ' '){
				revString+=value.substring(i+1,pos_holder)+" ";
				pos_holder=i;
			}
			if(i==0){
				revString+=value.substring(i,pos_holder);
			}
		}
		System.out.println(revString);
		//for(value)
	}
}