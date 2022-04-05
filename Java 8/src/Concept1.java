import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Concept1 {

	public static void main(String[] args) {
		String s1=new String("Hi There");
		String s2=new String("Hi There");
		String s3=s1;
		String s4="Hi There";
		StringBuffer s5 = new StringBuffer(s4); 
		StringBuilder s6 = new StringBuilder(s4);
		String s7="Hi There";
		
		//System.out.println(s1+" , "+s2+" , "+s3);
		System.out.println("s1 and s2 comparison :: both are string objects");
		System.out.println(s1==s2); // == Compares object
		System.out.println(s1.equals(s2)); // .equals Compares value
		
		System.out.println("s1,s2 and s3 comparison");
		System.out.println(s1==s3);
		System.out.println(s2.equals(s3));
		
		System.out.println("s1 and s4 comparison");
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		
		System.out.println("s5 and s6 comparison");
		System.out.println(s5.toString()==s6.toString());
		System.out.println(s5.toString().equals(s6.toString()));
		
		System.out.println("s4 and s7 comparison :: both are string literals");
		System.out.println(s4==s7);
		System.out.println(s4.equals(s7));
		
		//By calling intern() method on string object, you can explicitly move it to pool
		//String literals by default call intern() method and go to pool
		System.out.println("s1 and s4 comparison , using intern() method");
		System.out.println(s1.intern()==s4);
		System.out.println(s1.intern().equals(s4));
		
		//----------------------------------------
		
		System.out.println();
		System.out.println("INTEGER COMPARISON");
		Integer i1=100;
		Integer i2=100;

		System.out.println(i1==i2);
		
		//Hashmap 
		Map map=new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three",3);
		
		//Hashmap stores keys in set because sets dont allow duplicates and keys shouldnt be duplicate
		System.out.println(map.keySet());
		
		Set keys=map.keySet();
		keys.stream().forEach(key -> System.out.println(key));
	}

}
