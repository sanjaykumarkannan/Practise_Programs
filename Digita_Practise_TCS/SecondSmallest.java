import java.util.Scanner;
//Find 2nd smallest no in an array
public class SecondSmallest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of arr: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nSecond smallest "+arr[1]);
    }
}
