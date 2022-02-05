import java.io.*;

public class SimpleSort{
    public static void main(String args[]){
        int a[]=new int[]{89,12,43,45,73,11};
        System.out.println("Array before sorting");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int temp=0;
        for (int i=0;i<a.length;i++)    {
            for(int j=i+1;j<a.length;j++)   {
                if(a[i]>a[j])   {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("Array after sorting");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}