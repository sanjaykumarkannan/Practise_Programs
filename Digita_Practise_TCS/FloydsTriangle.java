import java.util.Scanner;

public class FloydsTriangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("what is the size of the scanner you want ?");
        int row=sc.nextInt();
        recursiveMethod(1,5,1);

    }
    public static void recursiveMethod(int index,int row,int start)
    {
        if (row>=0){
            for(int i=0;i<index;i++){
                System.out.print(start+" ");
                start++;
            }
            index++;
            row--;
            System.out.println();
            recursiveMethod(index,row,start);
        }
    }
}