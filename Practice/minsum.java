package codes;
import java.util.*;

public class minsum {
	
	
	public static void main(String[] args) {
		
		List<Integer> arr = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println(" Size and repetitions in one line ");
		String input1 = sc.nextLine();
		System.out.println("Enter elements of the array on one line ");
		String input2 = sc.nextLine();
		sc.close();
		int size=0,k=0;
		String[] temp1 = null;
		String[] temp2 = null;
		
		temp1 = input1.split(" ");
	    temp2 = input2.split(" ");
	  
		 size = Integer.parseInt(temp1[0]);
		 k  = Integer.parseInt(temp1[1]);
	

		for(int ite =0; ite< size; ite ++)
		{
			int temp = Integer.parseInt(temp2[ite]);
			arr.add(temp);
			
		}
		
	for(int ite =0;ite<k; ite ++)
		{
		int max =  Collections.max(arr);
		int index = arr.indexOf(max);
		arr.remove(index);
		arr.add(max/2);
			 
	}
	int sum =0;
	for(int ite =0; ite<size; ite ++)
	{
		sum+= arr.get(ite);
	}
	
	
	
		System.out.println(sum);

}
	
}
//
