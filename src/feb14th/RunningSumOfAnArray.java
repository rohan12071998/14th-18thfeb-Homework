package feb14th;
import java.util.*;

public class RunningSumOfAnArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		sum(arr);
	
	}
	public static void sum(int arr[]) {
		int sum=0;
	
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			System.out.print(sum+",");
		}
		
	}
		
		    

}
