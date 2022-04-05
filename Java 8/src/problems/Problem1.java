package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {

	public static void main(String[] args) {
		int n=4;
		int k=3;
		int cars[]=new int[] {2,10,8,17};
		//int cars[]=new int[] {6,2,12,7};
		//n=5;k=3;int cars[]=new int[] {15,10,2,27,21};
		
		System.out.println("Smallest roof covering minimum cars is : "+carParkingRoof(n, k, cars));
	}
	
	public static int carParkingRoof(int n,int k, int cars[]){
		List<Integer> orderedList=new ArrayList<Integer>();
		List<Integer> finalList=new ArrayList<Integer>();
		for(int c : cars) {
			orderedList.add(c);
		}
		Collections.sort(orderedList);
		int comparisons=cars.length-k+1;
		int j=cars.length-comparisons;
		for(int i=0;i<comparisons;i++) {
			finalList.add((orderedList.get(j)-orderedList.get(i))+1);
			j+=1;
		}
		Collections.sort(finalList);
		System.out.println(finalList.toString());
		return finalList.get(0);
	}

}
