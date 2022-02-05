package java8;
import java.util.ArrayList;
import java.util.List;

public class StreamsApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(300);
		list.add(200);
		list.add(400);
		
		list.forEach(action -> 
		{
		int count=0;
		count++;
		System.out.println("Value "+count+ " : "+action);
		}
		);
		
		
	}

}
