// Find the extra element and its index
// Input : [ 10, 20, 30, 12, 5 ]
//     [ 10, 5, 30, 20 ]
// Output : 12 is the extra element in array 1 at index 4

import java.io.*;
import java.util.*;
public class ExtraValue
{
static int[] a={10, 20, 30, 5,9};
static int[] b={10, 20, 30, 5};
public static void main(String args[])
{
ExtraValue obj=new ExtraValue();
int index=obj.extraVal(a,b);
if(index==-1)
{
System.out.println("All elements are matching");    
}
else{
System.out.println("Index is "+ index + " values is "+a[index]);
}


}

public int extraVal(int[] a,int[] b)
{
int returnIndex=0,j=0;
for(int i=0;i<a.length;i++)
{
    for(j=0;j<b.length;j++)
    {
        if(a[i]==b[j])
            break;
    }
    if(j==b.length)
    {
    return i;
    }
}
return -1;
}
}