
public class subarraysum {
	public static int findsubarraysum(int[]arr, int size) {
		int res =0;
		
		/* measuring the occurences of each sub element in all the subarrays. 
		 * For example first element occcurs in size-1 times. 
		 * second element occurs size-2 starting times and size-2 times as second. 
		 * that is the ith element occurs (i+1)*(size-i) times*/ 
		for(int i =0; i< size;i++)
		{
		//	System.out.printf("%d\t occured %d times\n",arr[i],((i+1) * (size-i)));
			res = res+ (arr[i] * (i+1) * (size-i));
			
		}		
		
		return res;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,3,4};
		int size = arr.length;
		int res = findsubarraysum(arr,size);
		System.out.println(res);

	}

}
