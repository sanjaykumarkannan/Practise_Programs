package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsProblem1 {
	public static void main(String[] args) {
		//Find all no's starting with 2 using map and filter
		
		Integer arr[]=new Integer[]{0,2,10,12,22,24};
		//String arr[]=new String[] {"0","2","10","22","28","32"};
		List al=Arrays.asList(arr);
		System.out.println("Size of array : "+al.size());
		
		List<String> finalArr=(List) al.stream()
				.map(val -> String.valueOf(val))
				.filter(val -> ((String)val).charAt(0)=='2')
				.collect(Collectors.toList());
		
		System.out.println("Values after filtering : ");
		finalArr.forEach(val -> System.out.println(val));
	}
}
