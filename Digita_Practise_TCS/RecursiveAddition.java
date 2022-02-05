import java.util.Scanner;
public class RecursiveAddition{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to which u want to find addtion of :");
        int inp=sc.nextInt();
        int output=recursiveAddition(inp);
        System.out.println("Added output is "+output);

    }
    public static int recursiveAddition(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+recursiveAddition(n-1);
        }
    }
}