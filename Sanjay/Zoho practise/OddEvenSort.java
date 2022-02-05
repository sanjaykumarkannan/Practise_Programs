/*2. Write a program to sort the elements in odd positions in descending order and elements in ascending order

Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 */
import java.io.*;

public class OddEvenSort{

    public static void main(String args[]){
        int a[]=new int[]{1,2,3,4,5,6,7,8,9};
        int oddSize=a.length/2+a.length%2;
        int evenSize=a.length/2;
        int oddNos[]=new int[oddSize];
        int evenNos[]=new int[evenSize];
        int oddIndex=0,evenIndex=0;

        //Printing input
        System.out.println("Input");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        for(int i=0;i<a.length;i++){
            if((i+1)%2!=0){
                oddNos[oddIndex]=a[i];
                oddIndex++;
            }
            else{
                evenNos[evenIndex]=a[i];
                evenIndex++;
            }
        }
        // for(int odd=0;odd<oddSize;odd++){
        //     System.out.println(oddNos[odd]);
        // }
        int temp=0;
        for(int i=0;i<oddNos.length;i++){
            for(int j=i+1;j<oddNos.length;j++){
                if(oddNos[i]<oddNos[j]){
                    temp=oddNos[i];
                    oddNos[i]=oddNos[j];
                    oddNos[j]=temp;
                }
            }
        }

        for(int i=0;i<evenNos.length;i++){
            for(int j=i+1;j<evenNos.length;j++){
                if(evenNos[i]>evenNos[j]){
                    temp=evenNos[i];
                    evenNos[i]=evenNos[j];
                    evenNos[j]=temp;
                }
            }
        }
        oddIndex=0;evenIndex=0;
        for(int i=0;i<a.length;i++){
            if((i+1)%2!=0){
                a[i]=oddNos[oddIndex];
                oddIndex++;
            }
            else{
                a[i]=evenNos[evenIndex];
                evenIndex++;
            }
        }

        //Printing output
        System.out.println("\nOutput");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
  
}        