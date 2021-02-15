import java.util.*;

public class intrestingarrayusinghash {
	// we can use hashset if we dont need te index just the pair of elements itself. It works in O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	      //write your code here
	      // TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      while(t-->0){
	        long n = sc.nextLong();
	        long[] arr = new long[(int)n];
	        for(int i =0; i<n ; i++){
	        arr[i] = sc.nextInt();}
		      	long k = sc.nextLong();
			      long min=0,max=0;
			      long l =0;
			      long r = n-1;
			    
					  while(l<r)
					  {
					    if(arr[(int)l] + arr[(int)r] == k)
					    {
					             
					            System.out.println(l+" "+r);
					            min =1;
					            break;
					    }
					    else
					    {
					      min =2;
					    }
					    if (arr[(int)l] + arr[(int)r] < k) 
	                l++; 
	            else // A[i] + A[j] > sum 
	                r--; 
					  }
					 
					if(min == 2)
					{
					  System.out.println("no answer");
					}
					
	      } 
	}

}
