package codes;

public class stringpalindrome1 {
	public static int max(String s) {
	    int max = 0;
	    for (int i = 1; i < s.length()-1; ++i) {
	        String p1 = bestPalyndrome(s, 0, i);
	        String p2 = bestPalyndrome(s, i, s.length());
	       // System.out.println(p1 + " " + p2 + " -> " );
	        int prod = p1.length()*p2.length();
	        if (prod > max) {
	            System.out.println("4 "+p1 + " " + p2 + " -> " + prod);
	            max = prod;
	        }
	    }
	    return max;
	}

	private static String bestPalyndrome(String s, int start, int end) {
	    if (start >= end) {
	        return "";
	    } else if (end-start == 1) {
	    	//System.out.println("1 "+s.substring(start, end));
	        return s.substring(start, end);
	    } else  if (s.charAt(start) == s.charAt(end-1)) {
	    	//System.out.println("2 "+s.charAt(start) + bestPalyndrome(s, start+1, end-1)
           // + s.charAt(end-1));
	        return s.charAt(start) + bestPalyndrome(s, start+1, end-1)
	                + s.charAt(end-1);
	    } else {
	        String s1 = bestPalyndrome(s, start, end-1);
	        String s2 = bestPalyndrome(s, start+1, end);
	       // System.out.println("3 "+s1 + "  " +s2 );
	        return s2.length() > s1.length() ? s2 : s1;
	    }
	}
	
	public static void main(String[] args)
			{
		       String s = "acdapmpomp";
		       int maxproduc = max(s);
		       
		       System.out.println(maxproduc);
 			}

}
