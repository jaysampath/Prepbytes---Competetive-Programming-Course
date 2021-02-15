

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class freinds {
	public static void main (String[] args) {
                      // Your code here

	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	long len = s.length();
	long sum = 0;
	for(int i = 0 ; i < len ; i++)
	{
		for(int j = i+1 ; j< len ; j++)
		{
            if(s.charAt(i) == s.charAt(j))
			{
            	System.out.println(s.charAt(i)+" "+ i +" "+s.charAt(j)+" "+ j +" ");
				sum = sum + (j-i);
				System.out.println(sum);
			}
		}
	}
	System.out.println(sum);
	}
}