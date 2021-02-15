package pbweek1;


import java.util.*;
import java.io.*;

public class housenumber {
/*  public static boolean noofdigits(int y)
  {
    List<Integer> lis = new ArrayList<Integer>();
    
  }*/
  public static void main(String args[]) throws IOException {
    //write your code here
    Scanner s = new Scanner(System.in);
   // int n = s.nextInt();
    int n =1;
   for(int i =1;i<=n;i++)
   {
    long x = 999999999;
     long timer1 = System.nanoTime();
  long sum =0;
  long temp1 = x;
  
  while(temp1>0)
  {
    if(temp1<=9)
    sum++;
    else{
      long temp2 = temp1;
      while(temp2>0)
      {
        sum++;
        temp2=temp2/10;
      }
    }
    temp1--;
  }
  System.out.println(sum);
  long timer2 = System.nanoTime();
  System.out.println((timer2-timer1)/1000000000);
  
   }
  }
}