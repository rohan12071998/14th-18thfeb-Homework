package feb15th;

public class PrintInSpiralOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
		SpiralOrder(arr);

	}
	public static void SpiralOrder(int arr[][]) {
		int n=arr.length;
		int m=arr[0].length;
		int rowstart=0;
		int rowend=n-1;
		int colstart=0;
		int colend=m-1;
		while (rowstart<=rowend && colstart<=colend) {
			for(int col=colstart;col<=colend;col++) {
				System.out.print(arr[rowstart][col]+" ");
				
			}
			rowstart++;
			for(int row=rowstart;row<=rowend;row++) {
				System.out.print(arr[row][colend]+" ");
			}
				
			
			colend--;
			for(int col=colend;col>=colstart;col--) {
				System.out.print(arr[rowend][col]+" ");
				
			}
			rowend--;
			for(int row=rowend;row>=rowstart;row--) {
				System.out.print(arr[row][colstart]+" ");
			}
			colstart++;
		}
		
	}

}
