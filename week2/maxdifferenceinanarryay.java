package pbweek2;


import java.util.*;
import java.io.*;

public class maxdifferenceinanarryay {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0)
    {
      long n = sc.nextInt();
      long arr[] = new long[(int) n];
      int diff = 0;
      int max =0;
       for(int i =0; i<n ;i++)
      {
        arr[(int) i] = sc.nextLong();
      }
      long[] a1 = new long[(int)n];
      long[] a2 = new long[(int)n];
      
      for(int i =0; i<n ;i++)
      {
        a1[(int) i] = arr[(int)i] + i;
        a2[(int)i] = arr[(int)i] -i;
      }
     // int p = Collections.min(Arrays.asList(a1));
    //  int q = Collections.min(Arrays.asList(a2));
    Arrays.sort(a1);
    Arrays.sort(a2);
  //  System.out.println(Arrays.toString(a1));
    
  //  System.out.println(Arrays.toString(a2));
    long res1 = a1[(int)n-1] - a1[(int)0];
    long res2 = a2[(int)n-1] - a2[(int)0];
      
      System.out.println(Math.max(res1,res2));
    }  
      
  }
}