package working;

public class LongestIncreasing {
	static int incre_subseq(int req_arr[], int len){
	      int arr[] = new int[len];
	      int i, j, max = 0;
	      for (i = 0; i < len; i++)
	         arr[i] = 1;
	      for (i = 1; i < len; i++)
	      for (j = 0; j < i; j++)
	      if (req_arr[i] > req_arr[j] && arr[i] < arr[j] + 1)
	      arr[i] = arr[j] + 1;
	      for (i = 0; i < len; i++)
	      if (max < arr[i])
	      max = arr[i];
	      return max;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int req_arr[] = { 22,46,12,20,15,30,77,68,98,100,57,42};
	      int len = req_arr.length;
	      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(req_arr, len));
	}

}
