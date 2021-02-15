import java.io.*; // for handling input/output
import java.util.*;
public class shopping {
	
	
	public static void main(String[]  args)
    {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int J = sc.nextInt();
  int arr[] = new int[N];
  
  System.out.println(N);
  System.out.println(K);
  System.out.println(J);
	for(int i =0; i <N ; i++){
	arr[i] = sc.nextInt();}

	int minsum =0;
	int temp = arr[J-1];
System.out.println(temp);
	if(K == 1)
	{
		System.out.print(temp);
	}
	else
	{
		Arrays.sort(arr);
		for(int i =0 ; i < K-1 ; i++)
		{
			minsum += arr[i];
			System.out.println(arr[i]+" "+minsum);
		
		}
		System.out.print(minsum+temp);
	}
    }

}
