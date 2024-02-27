import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		long low=0;
		long high=N;
		while(low<=high){
			long mid=(high-low)/2 + low;
			//System.out.println(mid+" .");
			if(mid*mid==N){
				return (int)(mid);
			}
			else if(mid*mid<N){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		if(low*low>N){
			return (int)(low-1);
		}
		else{
			return (int)(low);
		}
	
	}
}
