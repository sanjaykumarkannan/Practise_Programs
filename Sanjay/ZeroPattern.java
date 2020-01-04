import java.io.*;
import java.util.*;

public class ZeroPattern
{
    public static void main(String args[])
    {
        int n=4;
        int matrix[][]={{1,1,1,0},{0,0,1,1},{1,0,1,1},{0,0,1,1}};
        
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print("\n");
        }
        findRoute(n,matrix);
    }

    public static void findRoute(int val,int matrix[][])
    {
        
        System.out.println(val);

    }
}