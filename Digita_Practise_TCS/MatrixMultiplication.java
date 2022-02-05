import java.io.*;
public class MatrixMultiplication{
    public static void main(String args[]){
        int noOfRows=3,noOfColumns=3;
        
        int mat1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int mat2[][]={{1,2,3},{4,5,6},{7,8,9}};
        int result[][]=new int[noOfRows][noOfColumns];
        System.out.println("Matrix 1 : ");
        MatrixMultiplication.display(mat1,noOfRows,noOfColumns);

        System.out.println("Matrix 2 : ");
        MatrixMultiplication.display(mat2,noOfRows,noOfColumns);

        for(int i=0;i<noOfRows;i++){
            for(int j=0;j<noOfColumns;j++){
                    result[i][j]=0;
                    for(int k=0;k<3;k++){
                    result[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        
        System.out.println("Result : ");
        MatrixMultiplication.display(result,noOfRows,noOfColumns);
    }

    public static void display(int output[][],int noOfRows,int noOfColumns){
        for(int i=0;i<noOfRows;i++){
            for(int j=0;j<noOfColumns;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}