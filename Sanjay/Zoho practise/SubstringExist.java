/*
4. Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1*/

public class SubstringExist{
    public static void main(String args[]){
        String str1="test123string";
        String str2="t123";
        int index=str1.indexOf(str2);
        if(index>=0){
            System.out.println(str2+" and index is "+index);
        }
        else{
            System.out.println(index);
        }

    }
}        