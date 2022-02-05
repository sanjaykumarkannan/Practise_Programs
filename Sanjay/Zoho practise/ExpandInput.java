/*
1. Write a program to give the following output for the given input

Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.*/

import java.io.*;
import java.util.regex.Pattern;

public class ExpandInput	{
	public static void main(String args[]){
		String input="a4b5c6";
		String val="";
		int valSize=0;
		char charHolder;
		String value="";
		int valueSize=0;
		for(int i=0;i<input.length();i++)	{
			//System.out.println(input.charAt(i));
			val+=input.charAt(i);
			if(Pattern.matches("^[a-zA-Z]+$",val)){
				//charHolder=input.charAt(i);
				value=val;
				//System.out.println(val);
			}
			
			if(Pattern.matches("^[0-9]+$",val))	{
				valueSize=Integer.parseInt(val);
				//System.out.println(valueSize);
			}
			
			if(value.length()>0 && valueSize>0){
				//System.out.print("\n\n");
				for(int j=0;j<valueSize;j++){
					System.out.print(value);
				}
			value="";
			valueSize=0;	
			}
			val="";
		}
	}
}