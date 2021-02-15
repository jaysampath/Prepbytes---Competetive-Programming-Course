package codes;

public class diet {
	
	public static void main(String[] args) {
		
		
		
		int x = 100, y=130,z=130;
		int[] arr1 = {10,20,30};
		int[] arr2 = {20,30,20};
		int[] sum1 = new int[3];
		int[] sum2 = new int[3];
		int[] sum3 = new int[3];
		int summ1 =0,summ2=0,summ3=0;
		int j = 1;
		while( summ1<= x && summ2 <= y && summ3 <= z  )
		{
			        summ1 =0;
					summ2=0;
					summ3=0;
			for(int i =0;i<3;i++)
			{
				//arr1[i]=arr1[i]*j;
				//arr2[i]=arr2[i]*j;
			}
			
		//	for(int i =0;i<3;i++)
		//	{
				summ1 = summ1 + arr1[0]*j + arr2[0]*j;
				summ2 = summ2 + arr2[1]*j + arr1[1]*j;
				summ3 = summ3 + arr2[2]*j + arr1[2]*j;
				
		//	}
				if(summ1<= x && summ2 <= y && summ3 <= z)
					break;
			j++;
		}
		
		System.out.println((summ1)+" " + (summ2) + " " +  (summ3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
