import java.io.*;
import java.util.*;
import java.lang.*;
public class ArrayPlay {
    public static void main(String args[]){
        ArrayList<Integer> intArray=new ArrayList<Integer>();
        intArray.add(10);
        intArray.add(100);

        System.out.println(intArray.toString());

        intArray.remove(0);
        System.out.println(intArray.toString());

        String name="MyNameIsSanjay";
        for(char c:name.toCharArray())
        {
            System.out.println(c);
        }
        
    }
}
