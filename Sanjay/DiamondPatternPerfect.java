import java.io.*;
import java.util.Scanner;

public class DiamondPatternPerfect {
    public static void main(String args[])  {
        /*for(int i=0;i<5;i++) {
            System.out.println("i==>"+i);
        }*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter diamond size :");
        int inp=sc.nextInt();
        //System.out.println(inp);

        for(int i=inp;i>0;i--) {
            for(int k=0;k<i-1;k++){
                System.out.print(" ");
            }
            
            for(int j=i;j<=inp;j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=0;i<inp-1;i++) {//change here
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
            //System.out.print("Enna nadakudu");
            for(int j=i;j<inp-1;j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}