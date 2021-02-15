package practice1;
import java.util.*;
public class partitionproblem {
	public static int findpartition(int a[],int i,int sumcalc , int sumtot)
	{
		int minindex =0;
		int sum2 =0;
		int mindiff = 0;
	/*	for( int i = l-1; i >= 0 ; i--)
		{
			sumcalc = sumcalc + a[i];
			sum2 = sumtot - sumcalc;
			
			if(mindiff < Math.abs(sum2 - sumcalc))
			{
				minindex = i;
				
			}
			mindiff = Math.abs(sum2 - sumcalc);
		//	System.out.println(sumtot +" "+ sumcalc+" " + sum2+ " " + mindiff +" " + minindex);
		}*/
		  if (i == 0) {
            return Math.abs((sumtot-sumcalc) - sumcalc); }
		  
		  System.out.println(sumtot +" "+ sumcalc+" " + sum2+ " " + Math.abs((sumtot-sumcalc) - sumcalc) +" " + minindex);
return Math.min(findpartition(a, i - 1, sumcalc + a[i-1], sumtot),findpartition(a, i-1, sumcalc, sumtot));
		
		
		//return minindex;
		
	}
	public static void main(String[] args)
	{
		int a[] = {1, 6, 11, 5};
		int sumtotal = 0;
		for(int i = 0; i< a.length ; i++)
			sumtotal = sumtotal + a[i];
		
		Arrays.sort(a);
		int i = findpartition(a,a.length,0,sumtotal);
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for( int in =0; in < a.length ; in++)
		{
			
		}
		for(int in =0; in <=i ; in++)
		{
			list1.add(a[in]);
		}
		for(int in = i+1; in < a.length ; in++)
		{
			list2.add(a[in]);
		}
		System.out.println(i);
		System.out.println(list1);
		System.out.println(list2);
	}

}
