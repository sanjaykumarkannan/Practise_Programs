package corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListExplore {

	public static void main(String[] args) {
		int i=1;
		List<Integer> al=new ArrayList<Integer>();
		while(i<=11) {
			System.out.println(i);
			al.add(i);
			i++;
		}
		
		Map<String,String> hmap=new HashMap<String,String>();
		hmap.put("name","Sanjay");
	}

}
