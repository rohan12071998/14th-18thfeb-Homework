package feb14th;

public class StudentsDoingHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		    int[] startTime = {1,2,3};
		    int[] endTime = {3,2,7};
		    int queryTime = 4;
		    System.out.println(busyStudent(startTime, endTime, queryTime));
		  }
	}
	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n = startTime.length;
        int ans = 0;
        for(int i=0;i<n;i++)
            ans += ((startTime[i] <= queryTime && queryTime <= endTime[i]) ? 1 : 0);
        return ans;
    }
}
    
 