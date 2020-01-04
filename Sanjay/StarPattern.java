import java.io.*;
import java.util.*;

public class StarPattern
{
    public static void main(String args[])
    {
        printPattern(5);
    }
    public static void printPattern(int val)
    {
        int rows=val;
        while(rows>0)
        {
        for(int i=0;i<rows;i++)
        {
            System.out.print(" ");
        }
        rows--;
        for(int j=0;j<(val-rows);j++)
        {
            System.out.print("* ");
        }
            System.out.println("\n");
        }
    }
}