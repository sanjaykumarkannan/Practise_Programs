/*
 Given two sorted arrays, merge them such that the elements are not repeated

Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 
*/

public class MergeArray{
    public static void main(String args[]){
        int arr1[]=new int[]{2,4,5,6,7,9,10,13};
        int arr2[]=new int[]{2,3,4,5,6,7,8,9,11,15};
        int mergedArray[]=new int[100];
        int a1index=0;
        int a2index=0;
        int mergedIndex=0;
        while(a1index<arr1.length || a2index<arr2.length){
            if(arr1[a1index]<arr2[a2index]){
                mergedArray[mergedIndex]=arr1[a1index];
                a1index++;
            }
            else if(arr1[a1index]>arr2[a2index]){
                mergedArray[mergedIndex]=arr2[a2index];
                a2index++;
            }
            else{
                mergedArray[mergedIndex]=arr1[a1index];
                a1index++;
                a2index++;
            }

            if(a1index>=arr1.length && a2index<arr2.length){
                while(a2index<arr2.length){
                    mergedArray[mergedIndex]=arr2[a2index];
                    a2index++;
                    mergedIndex++; 
                }
            }
            
            if(a1index<arr1.length && a2index>=arr2.length){
                while(a1index<arr1.length){
                    mergedArray[mergedIndex]=arr1[a1index];
                    a1index++;
                    mergedIndex++;
                }
            }
            mergedIndex++;
        }
        
        System.out.println("Output");
        for(int i=0;i<mergedArray.length;i++){
            System.out.print(mergedArray[i]+" ");
        }
    }
}