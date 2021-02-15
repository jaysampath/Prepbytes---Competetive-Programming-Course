package pbweek1;
import java.util.*;
public class codechef1 {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		
		while(testcases>0)
		{
		   int strength = sc.nextInt();
		   int w1 = sc.nextInt();
		   int w2 = sc.nextInt();
		   int w3 = sc.nextInt();
		   int sum1,sum2;
		   int sum = w1+w2+w3;
		   if(sum<=strength){
		   System.out.println("1");}
		   else{
		        sum1 = w1 + w2;
		        sum2 = w2 + w3;
		       if(sum1<= strength || sum2 <= strength){
		       System.out.println("2");}
		       else{
		       System.out.println("3");}
		   }
		   
		    
		    
		    testcases--;
		}
	}
}
