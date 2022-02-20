package feb14th;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,8,9};
		SecondLargestElement (arr);
	}
	public static void  SecondLargestElement(int arr[]) {
	int temp=1;
	int length=arr.length;
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	System.out.print(arr[length-2]);
	}
}
		
	
		

