package java8.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(300);
		list.add(200);
		list.add(400);
		
		list.stream().forEach(action -> 
		{
		int count=0;
		count++;
		System.out.println("Value "+count+ " : "+action);
		}
		);
		
		System.out.println();
		
		//Unordered List
		List<Integer> unordList=new ArrayList<Integer>();
		unordList.add(500);
		unordList.add(400);
		unordList.add(100);
		unordList.add(300);
		unordList.add(200);
		
		List<Integer> sorted=unordList.stream().sorted().collect(Collectors.toList());
		sorted.stream().forEach(System.out::println);
		
	}

}
