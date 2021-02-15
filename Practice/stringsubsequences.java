
public class stringsubsequences {
	
	public static void printSubSeqRec(String str, int n,int index,String curr)
	{
		if (index == n) { 
            return; 
        } 
        if (curr != null && !curr.trim().isEmpty()) { 
            System.out.println(curr); 
        } 
        for (int i = index + 1; i < n; i++) { 
            curr += str.charAt(i); 
            printSubSeqRec(str, n, i, curr); 
  
            // backtracking 
            curr = curr.substring(0, curr.length() - 1);         }		}
        static void printSubSeq(String str, int n) 
        { 
            int index = -1; 
            String curr = ""; 
      
            printSubSeqRec(str, n, index, curr); 
        } 
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cab";
		int size = s.length();
		printSubSeq(s,size);	}}+

