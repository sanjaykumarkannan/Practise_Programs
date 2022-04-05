package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem4 {

	public static void main(String[] args) {
		String arr[]= {"https://www.google.com","https://www.microsoft.com","https://www.google.com","https://www.apple.com",
				"https://www.apple.com","https://www.apple.com","https://www.citibank.com","https://www.amadeus.com"};
		List<String> urlsList=Arrays.asList(arr);
		Set<String> uniqueUrls=new HashSet<String>(urlsList);
		//uniqueUrls.stream().forEach(v -> System.out.println(v));
		List<Website> websiteList=new ArrayList<Website>();
		
		int highestFrequency=0;
		int occurence=0;
		for(String url : uniqueUrls) {
			occurence=Collections.frequency(urlsList, url);
			websiteList.add(new Website(url, occurence));
			if(highestFrequency<occurence) {
				highestFrequency=occurence;
			}
		}
		System.out.println("Most visited count : "+highestFrequency);
		
		Collections.sort(websiteList);
		
		Comparator<Website> visitsComparator= (Website obj1, Website obj2) -> {
			if(obj1.visits<=obj2.visits){
				return 1;
			}
			else {
				return -1;
			}
			
		};
		
		Collections.sort(websiteList,visitsComparator);
		
		websiteList.stream().forEach(v -> System.out.println(v.url));
		/*
		 * uniqueUrls.stream().forEach(url -> { if(highestFrequency <
		 * Collections.frequency(uniqueUrls, url)) {
		 * highestFrequency=Collections.frequency(uniqueUrls, url); } });
		 */
		
	}

}

class Website implements Comparable<Website>{
	String url=null;
	int visits=0;
	
	public Website(String url, int visits) {
		super();
		this.url = url;
		this.visits = visits;
	}

	@Override
	public int compareTo(Website o) {
		// TODO Auto-generated method stub
		return this.url.compareTo(o.url);
	}
	
	
}