/*
 * Sample program for movie 01_03
 */
package java8.lambdas.part1;

import java.math.BigInteger;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/**
 *
 * @author MFisher
 */
public class Lambdas_01_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IntFunction<String> intToString = num -> Integer.toString(num);
        System.out.println("expected value 3, actual value: " + 
                intToString.apply(123).length());
     
        //static method reference using ::
        IntFunction<String> intToString2 = Integer::toString;
        System.out.println("expected value 4, actual value:  " + 
                intToString2.apply(4567).length());
        
        //lambdas made using a constructor
        Function<String,BigInteger> newBigInt = BigInteger::new;
        System.out.println("expected value: 123456789, actual value: "+ 
                newBigInt.apply("123456789"));
        
        //example of a lambda made from an instance method
        Consumer<String> print = System.out::println;
        print.accept("Coming to you directly from a lambda...");
        
        //these two are the same using the static method concat
        UnaryOperator<String> greeting = x -> "Hello, ".concat(x);
        System.out.println(greeting.apply("World"));
        
        UnaryOperator<String> makeGreeting = "Hello, "::concat;
        System.out.println(makeGreeting.apply("Peggy"));
        
        //Added by sanjay
        UnaryOperator<String> smaller= String::toLowerCase;
        System.out.println(smaller.apply("HELLO! MY NAME IS SANJAY!"));
        
        BinaryOperator<String> concat= String::concat;
        System.out.println(concat.apply("Functional Programmin ", "is too good"));
        
        BinaryOperator<String> concatAndBig= (str1,str2) -> {
        	String r=str1+str2;
        	
        	return r.toUpperCase();
        };
        System.out.println(concatAndBig.apply("Life is ", "vera level machii! "));
        
    }
    
}
