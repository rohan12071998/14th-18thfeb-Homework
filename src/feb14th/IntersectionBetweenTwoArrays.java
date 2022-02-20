package feb14th;

import java.util.Arrays;

public class IntersectionBetweenTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,4,6,8,9,5,3};
		int arr2[]= {2,3,8,45,1,3,5};
		Intersection(arr1,arr2);
		

	}
	public static void Intersection(int arr1[],int arr2[]) {
		int l1=arr1.length;
		int l2=arr2.length;
		//int temp=;
		//int arr3[]=new int [l1];
		for(int i=0;i<l1;i++) {
			for(int j=0;j<l2;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]);
					
					//arr3=(arr1[i]==arr2[j]);
				}
			}
			
		}
		System.out.print("");
		
	}

}
