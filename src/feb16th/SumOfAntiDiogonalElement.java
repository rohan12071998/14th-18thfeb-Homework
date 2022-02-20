package feb16th;

public class SumOfAntiDiogonalElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,5,7},{2,6,8},{5,8,2}};
		System.out.print( SumofAntidiogonalElement(arr));
		

	}
	public static int  SumofAntidiogonalElement(int arr[][]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				//if(i==j) {
				//sum+=arr[i][j];
				if(i+j==arr.length-1) {
				sum+=arr[i][j];
				
				}
				
				
			}
				
		}
			
		return (sum);
	}
		

}
