
import java.util.*;
import java.io.*;

public class minusminusplus {
  public static boolean solve(String st, String t)
  {
    int index =0 ;
    char[] c = t.toCharArray();
    char[] s = st.toCharArray();
    for(char tx : c)
    {
      if (index == s.length) {
			   return false;
		    }
		if (s[index] == tx) {
			index++;
		} else {
			if (tx == '-') {
				return false;
			}
			if (index + 1 == s.length || s[index + 1] == '+') {
				return false;
			}
			index += 2;
		}
	}
	return index == s.length;
    }
  
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int te = sc.nextInt();
    while(te-->0)
    {
      String s = sc.next();
      String t = sc.next();
      
  /*  int i =0,j=0;
    while(i<s.length() && j<t.length())
{
      if(s.charAt(i) == t.charAt(j))
      {
        i++;
        j++;
        continue;
      }
     
        if((t.charAt(j)=='+')  && (i+1< s.length() )&&(s.charAt(i) == '-') && (s.charAt(i+1) =='-'))
        {
          i=i+2;
          j++;
          continue;
        }
      
    
    } */

   
    System.out.println( ( (solve(s,t)) ? "YES" : "NO"));
    
      
    }
    
  }
}
