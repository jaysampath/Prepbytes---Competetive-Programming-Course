package pbweek1;


import java.util.*;
import java.io.*;

public class fascinatingnumber {
	static long timer1 = System.nanoTime();
	   
  public static boolean isdistinct(int y)
  {
    List<Integer> lis = new ArrayList<Integer>();
    int i =0;
    int r = 1000;
    while(i<=3)
    {
      int dig = y/r;
      if(lis.contains(dig))
      {
      }
      else
      {
        lis.add(dig);
      }
      y=y%r;
      r=r/10;
      i++;
    }
  if(lis.size()==4)
  return true;
  else
  return false;
  }
  public static void main(String args[]) throws IOException {
    //write your code here
    Scanner s = new Scanner(System.in);
   // int n = s.nextInt();
    int n = 1;
   for(int i =1;i<=n;i++)
   {
    // int x = s.nextInt();
	   int x = 4444;
     if(isdistinct(x)==true)
     {
       x=x+1;
     }
    boolean  temp = false;
    while(temp == false)
    {
      temp = isdistinct(x);
      if(temp==true){
      continue;}
      x++;
    }
     System.out.println(x);
     }
   long timer2 = System.nanoTime();
   System.out.println((timer2-timer1)/1000000);
  }
}