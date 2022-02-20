package feb15th;

public class AdTwo2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{2,8,4},{6,4,5},{9,8,7}};
		int arr2[][]= {{9,8,7},{6,5,4},{3,2,1}};
		SumOfTwoArrays(arr1,arr2);
		

	}
	public static void SumOfTwoArrays(int [][]arr1,int [][]arr2) {
		int rows=arr1.length,col=arr1[0].length;
		//int rows1=arr1.length,col1=arr1[0].length;
		int arr3[][]=new int [rows][col];
		for (int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
	

		}
			

	

}
