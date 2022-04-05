package datastructure;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		String name="Sanjay";
		char[] arr=new char[name.length()];
		Stack<Character> revData=new Stack<Character>();
		for(int ch=0;ch<name.length();ch++) {
			revData.push(name.charAt(ch));
		}
		//for(int i=name.length()-1;i>=0;i--) {
		for(int i=0;i<name.length();i++) {
			arr[i]=revData.pop();
		}
		//System.out.println(arr);
		System.out.println(new String(arr));
	}

}
