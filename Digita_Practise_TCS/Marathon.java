import java.io.*;
import java.util.*;
public class Marathon {
	public static float[] maxDistCoverexExcludingFinishers(float R[]){
		ArrayList<Float> sorted=new ArrayList<Float>();
		int maxCoveredSize;
		for(int i=0;i<R.length;i++){
			if(R[i]<42.195 && R[i]>0.00){
				sorted.add(R[i]);
			}
		}
		if(sorted.size()>=3){			
			maxCoveredSize=3;
		}
		else{
			maxCoveredSize=sorted.size();
		}
		float maxCovered[]=new float[maxCoveredSize];
		int index=0;
		Collections.sort(sorted,Collections.reverseOrder());
		for (float val : sorted){
			if(index<3){
				maxCovered[index]=val;
				index++;
			}
		}
		System.out.println(sorted.toString());
		return maxCovered;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of participants :");
		int noOfPart=sc.nextInt();
		float R[]=new float[noOfPart];
		System.out.println("Total no of participants are "+R.length);
		System.out.println("Enter distance covered by each participant :");
		int index=0;
		for(int i=0;i<noOfPart;i++){
			float temp=sc.nextFloat();
			if(temp>0.00){
				R[index]=temp;
				index++;
			}
		}
		System.out.println("Valid values");
		for(int i=0;i<noOfPart;i++){
			System.out.println(R[i]);
		}
		//System.out.println(Marathon.maxDistCoverexExcludingFinishers(R));
		float maxCovered[]=Marathon.maxDistCoverexExcludingFinishers(R);
		System.out.println("Output");
		for(int j=0;j<maxCovered.length;j++){
			System.out.println(maxCovered[j]);
		}
	}
}