package codes;

public class mindistance {
	
	public static void main(String[] args)
	{
		String word1 = "hi";
		String word2 = "hello";
		int n1 = word1.length(); //length of word1
        int n2 = word2.length(); //length of word2
        // declaring a dp double dimension array
        // dp[i][j] = min num of opers to perform to make
        // word1 upto length i and word2 upto length j equal
        int[][]  dp = new int[n1+1][n2+1];
 
        //base conditions as discussed above
        for(int i=0;i<=n1;i++) dp[i][0] = i;
        for(int i=0;i<=n2;i++) dp[0][i] = i;
         
        // looping through all cases
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)) //when current state contains same characters
                    dp[i][j] = dp[i-1][j-1];
                else //different, so minimum of all three opers with +1
                    dp[i][j] = Math.min( Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
            }
        }
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
       System.out.print( dp[n1][n2]+" "); 
            }
            System.out.println();
        }//min opers to make word1 equal to word2 or vice versa
	}

}
