package codes;

import java.util.LinkedList;
import java.util.List;

public class maxsum {
	public static void main(String[] args) {
		List<Integer> arr = new LinkedList<Integer>();
		arr.add(2);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		int temp =0;
		List<Integer> sum = new LinkedList<Integer>();
		List<Integer> temp1 = arr;
		try {
		for(int j=0; j < temp1.size();j++) {
			temp =0;
		for(int i =0;i< arr.size();i++)
		{
			
			temp = temp + arr.get(i+1)*arr.get(i) + arr.get(i-1);  
		}
		sum.add(temp);
		
		}
		
	}
		catch(Exception e)
		{
			
		}
		System.out.println(sum);
	}
}
