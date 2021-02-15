package pbweek3;


import java.util.*;
import java.io.*;

public class longestsubsequencewith_nonrepeatedchars {
  
    public static int lengthOfLongestSubstring(String s) {
    int i = 0, j = 0, max = 0;
  Set<Character> set = new HashSet<>();
  
  while (j < s.length()) {
      if (!set.contains(s.charAt(j))) {
          set.add(s.charAt(j++));
          max = Math.max(max, set.size());
      } else {
          set.remove(s.charAt(i++));
      }
  }
  
  return max;   
  }
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int te = sc.nextInt();
    while(te-->0)
    {
      String s = sc.next();
      System.out.println(lengthOfLongestSubstring(s));
      
    }
    
  }
}
/* testcase
2
prepbytes
codingplatform
*/