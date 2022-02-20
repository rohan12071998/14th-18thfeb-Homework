package feb16th;

import java.util.Arrays;

public class DisplayingTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[][]= {{"Hello","Geekster"},{"Good","Day"}};
		SumOfString(str);

		

	}
	public static void SumOfString(String [][]str ) {
		int row=str.length;
		int col=str[0].length;
		String Rowsum=" ";
		for (int i=0;i<row;i++) {
			//System.out.println("Enter the value of rows :"+i+1);
			for(int j=0;j<col;j++) {
				//System.out.println("Enter the value col :"+j+1);
				Rowsum= Rowsum+ str[i][j];
				
			
				
			}
			System.out.println(" Rows "+i+"="+Rowsum);
		}
		
	}

}
