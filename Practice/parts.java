package codes;

import java.util.Scanner;

public class parts {

	public static boolean isprime(int n) {
		int count =0;
		System.out.println(n);
		for(int i = 1; i<= n ; i++)
		{
			if(n%i==0)
		      count++;
		      
		}
		if(count==2) {
			System.out.println(n);
		return true;
		}
		else
			return false;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter d and p ");
		String input1 = sc.nextLine();
		sc.close();
		String[] temp1 = null;
		temp1 = input1.split(" ");
		int d = Integer.parseInt(temp1[0]);
		int p = Integer.parseInt(temp1[1]);
		int hours = d/p;
		System.out.println(hours);
		int res=0;
		int count =0;
		for(int i = 2; i< hours ; i++) 
		{
			count =0;
			if(isprime(i))
			{
				 count =1;
				for(int j = 1 ; j< p;j++)
				{
					if(isprime( i + j*hours))
						count++;
					
				}
			}
			if(count == p)
				res++;
		}
		
		System.out.println(res);
		
		
		
	}
	
}
