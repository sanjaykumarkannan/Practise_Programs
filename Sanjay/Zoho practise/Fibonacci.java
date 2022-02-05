import java.io.*;
import java.util.Scanner;

public class Fibonacci  {
    public static void main(String args[])  {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a=-1,b=1,c=0;
        for (int put=0;put<size;put++)  {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}