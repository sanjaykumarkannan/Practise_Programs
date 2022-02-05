// A Simple Java program to demonstrate working of 
// Pattern.matches() in Java 
import java.util.regex.Pattern; 

class Regex 
{ 
	public static void main(String args[]) 
	{ 
		// Following line prints "true" because the whole 
		// text "geeksforgeeks" matches pattern "geeksforge*ks" 
		System.out.println (Pattern.matches("https:\\/\\/gess.ultimatix.net\\/[a-zA-Z0-9?=.#/]{0,1500}", 
											"https://gess.ultimatix.net/travel/index.html?cd=")); 

		// Following line prints "false" because the whole 
		// text "geeksfor" doesn't match pattern "g*geeks*" 
		System.out.println (Pattern.matches("^[a-zA-Z0-9?=.#/]+$","WA15428564")); 
	} 
}
