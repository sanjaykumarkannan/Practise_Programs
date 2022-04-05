package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {

	public static void main(String[] args) {
		//int skillArr[]=new int[] {12,4,6,13,5,10}, minPlayers=3, minLevel=4, maxLevel=10;
		int skillArr[]=new int[] {4,8,5,6}, minPlayers=1, minLevel=5, maxLevel=7;
		List<Integer> skills=new ArrayList<Integer>();
		for(int s : skillArr) {
			skills.add(s);
		}
		
		int output=countTeams(skills,minPlayers,minLevel,maxLevel);
		System.out.println(output);
	}
	
	
	public static int countTeams(List<Integer> list, int minPlayers, int minLevel, int maxlevel) {
		List<Integer> filteredList = list.stream().filter(val -> (val >= minLevel && val <= maxlevel))
				.collect(Collectors.toList());
		System.out.println(filteredList);
		int waysToSelect=0;
		while(filteredList.size()>=minPlayers) {
			waysToSelect+=factorial(filteredList.size()) / factorial(minPlayers);
			minPlayers++;
		}
		//System.out.println("Factorial "+waysToSelect);
		return waysToSelect;
	}
	
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n* factorial(n-1);
		}
	}
	
	
}
