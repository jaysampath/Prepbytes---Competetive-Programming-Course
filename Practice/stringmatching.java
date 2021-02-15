
public class stringmatching {
	
	public static void main(String[] args)
	{
		String s = "YH12234Hello#22lllu091$$#98";
		String[] temp1 = s.split("[0-9]+");
		String[] temp2 = s.split("[^0-9]+");
		for(int i =0;i<temp1.length;i++)
		{
			System.out.println(temp1[i]);
		}
		
		for(int i =0;i<temp2.length;i++)
		{
			System.out.println(temp2[i]);
		}
		
		String res1 = null;
		int res2 =0;
		for(int i =0;i<temp1.length;i++)
		{
			res1 = res1 + temp1[i];
		}
		res1 = res1.substring(4);
		for(int i =0;i<temp2.length;i++)
		{
			
				if(temp2[i].length()>0)
				res2+= Integer.parseInt(temp2[i]);
			
		}
		System.out.println(res1);
		System.out.println(res2);
		
		
		
		
		
		
		
	}

}
