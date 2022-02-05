/*
3. Write a program to print the following output for the given input. You can assume the string is of odd length

Eg 1: Input: 12345
       Output:
1       5
  2   4
    3
  2  4
1      5
*/ 
import java.io.*;

public class CrossProgram{
    public static void main(String args[]){
        String input="geeksforgeeks";
        int start=0,end=input.length()-1;
        for(int i=0;i<input.length();i++){
            for(int j=0;j<input.length();j++){
                if(j==start || j==end){
                    System.out.print(input.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            start+=1;
            end-=1;
            System.out.println();
        }
    }
}