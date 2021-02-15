package pbweek3;


import java.util.*;
import java.io.*;

public class longeststringmultiply{
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0)
    {
      String num1 = sc.next();
      String num2 = sc.next();
      int n = num1.length();
      int m = num2.length();
      int[] ans = new int[n + m];
      for (int i = n - 1; i >= 0; i--) {
          for (int j = m - 1; j >= 0; j--) {
              int subres = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
              int p1 = i + j;
              int p2 = i + j + 1;
              subres += ans[p2];
              ans[p1] += subres / 10;
              ans[p2] = subres % 10;
              System.out.println((num1.charAt(i) - '0')+" "+(num2.charAt(j) - '0')+" "+subres+" "+ans[p1]+" "+ans[p2]);
          }
      }
     StringBuilder sb = new StringBuilder();
      boolean started = false;
      for (int i = 0; i < ans.length; i++) {
          if (ans[i] != 0) {
              started = true;
          }
          if (started) {
              sb.append(ans[i]);
          }
      }
      System.out.println((sb.length() == 0 ? "0" : sb.toString()));
      System.out.println(Arrays.toString(ans));
      
    }
  }
}