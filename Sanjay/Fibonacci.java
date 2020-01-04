import java.io.*;
import java.util.*;
public class Fibonacci
{

    static int fiboArray[];
    
    public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter fibo list length:");
int fibListSize=sc.nextInt();
fiboArray=new int[fibListSize];

//fiboArray=
fillFiboData(fibListSize);
int val[]=new int[]{1,2,3};

Fibonacci obj=new Fibonacci();

int ans[]=obj.returnFiboValues(fiboArray,val);
System.out.println("\n\n\nANSWER:");
for (int i:ans)
{
    System.out.println(i);
}


}



public static void fillFiboData(int l)
{
    int a=-1,b=1,c=0;
    
    for (int i=0;i<l;i++)
    {
        c=a+b;
        fiboArray[i]=c;
        System.out.println(c);
        a=b;
        b=c;
    }
}

public int[] returnFiboValues(int[] fiboList,int[] input)
{
    int fibValuesToReturn[]=new int[10];
    int index=0;
    for(int i:input)
    {
        for(int j:fiboList)
        {
            if(i==j)
            {
                fibValuesToReturn[index]=i;
                index++;
            }
        }
    }
    return fibValuesToReturn;
}




}