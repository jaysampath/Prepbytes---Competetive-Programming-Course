import java.util.*;
import java.io.*;

public class bankmanager {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int n = 1;
   for(int i =1;i<=n;i++)
   {
     long x = 1000000000;
     long count =1;
     StringBuffer s = new StringBuffer("p");
     while(s.length()!=x)
     {
       s=s.append("p");
      
       if(2*s.length() == x )
       {
         s=s.append(s);
         count+=2;
       }
      
       count+=1;
       
       System.out.println(s);
       System.out.println(count);
     }
     
  /*   if(x%2==1){
     
     System.out.println(x);
     }
     else{
       int k = x/2;
         System.out.println( k+2);
     }*/
     
   
   }
  }
}
