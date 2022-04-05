import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

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
		
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println(cores);
		
		//Learning to iterate maps using lambda expression
		Map<String,Integer> testMap=new HashMap<String,Integer>();
		testMap.put("Sanjay", 25);
		testMap.put("Praveen", 35);
		testMap.put("Ammu", 21);
		
		testMap.forEach((k,v)-> System.out.println("key "+k+" value "+v));
	}

}
