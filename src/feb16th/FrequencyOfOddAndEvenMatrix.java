package feb16th;

public class FrequencyOfOddAndEvenMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		OddAndEven(arr);
		

	}
	public static void OddAndEven(int [][]arr) {
		int oddcount=0,evencount=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]%2==0) {
					evencount++;
					//System.out.print(evencount);
				}else {
					oddcount++;
					//System.out.print(oddcount);
				}
				
				
			}
		}
		System.out.println("frequency of odd "+(oddcount));
		System.out.println("frequency of even "+evencount);
	}

}
