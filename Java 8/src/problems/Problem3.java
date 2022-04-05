package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3 {

	public static void main(String[] args) {
		//Remove duplicates in a ArrayList using set
		List<String> data=new ArrayList<String>();
		data.add("Sanjay");
		data.add("Praveen");
		data.add("Sanjay");
		data.add("Amruthaa");
		data.add("Nivi");
		data.add("Nivi");
		
		System.out.println(data.toString());
		
		Set<String> uniqueData=new HashSet<String>(data);
		
		System.out.println(uniqueData.toString());
	}

}
