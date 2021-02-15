package pbweek1;
import java.util.*;
import java.io.*;
public class timeangle {





  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    while(N>0)
    {
      int a = sc.nextInt();
      int b = sc.nextInt();
       if(a==12)
    	   a=0;
       
       if(b==60)
       {
    	   b=0;
    	   a++;
       }
      int temp = (int) b/2;
    
      int hourangle = (int) (a*30) + temp;
      int minangle = (int) (b/5)*30;
      int res = Math.abs(Math.max(hourangle,minangle) - Math.min(hourangle, minangle));
      
   
        System.out.print(Math.min(res, 360-res));
      N--;
    }
    
  }
}