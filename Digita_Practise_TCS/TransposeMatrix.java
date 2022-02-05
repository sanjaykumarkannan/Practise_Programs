public class TransposeMatrix{
    public static void main (String args[]){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int size=matrix.length;
        System.out.println("Matrix input :");
        TransposeMatrix.display(matrix, size);

        int transposeMatrix[][]=new int[size][size];
        for (int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                transposeMatrix[j][i]=matrix[i][j];
            }
        }

        System.out.println("Matrix output :");
        TransposeMatrix.display(transposeMatrix, size);

    }

    public static void display(int output[][],int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}