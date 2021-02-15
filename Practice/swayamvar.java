import java.util.*;

public class  swayamvar{
	
	static String result(int n, String s1 , String s2)
	{
		//StringBuilder s1 = s11.;
	  
		int res=0;
		int temp=0;
		try {
		
		int i=0;
		while(i<n)
		{
			System.out.println(s1.charAt(0));
			int index = s2.indexOf(s1.charAt(0));
			System.out.println(index);
			if(index<0)
				return s1;
		
			s2= s2.substring(index+1) + s2.substring(0, index);
			
			s1 = s1.substring(1);

			
			i++;
			res = s1.length();
			System.out.println(s1);
			System.out.println(s2);
		}
		
		}
		catch(Exception e) {
			
		}
		
		
		return s1;
	}	
		
		
	public static void main(String[] args)
	{
		//Scanner s = new Scanner(System.in);
		
		int n = 8;
		
		String s1 = "mrmr";
	//System.out.println("Enter grooms");
		String s2 = "rmmm";
		
		String res = result(n,s1,s2);
		
		System.out.print("result:" + res.length());
	
	}
	
	
	
}
