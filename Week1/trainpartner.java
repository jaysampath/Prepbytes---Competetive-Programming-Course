package pbweek1;
//support@prepbytes.com

import java.util.*;
import java.io.*;
public class trainpartner {




  public static void main(String args[]) throws IOException {
   
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0)
    {
      int x = sc.nextInt();
      int c = (int) x/8;
      
      if(c==0)
      c=1;
      
      

     
     
       if(x == 7*c){
         System.out.println((x+1)+"SU");
         }
    if(x == 8*c){
         System.out.println((x-1)+"SL");
        }
      if(x == 1*c){
        System.out.println((x+3)+"LB");
        }
      if(x == 4*c){
         System.out.println((x-3)+"LB");
         }
      if(x == 2*c){
         System.out.println((x+3)+"MB");
        }
      if(x == 5*c){
         System.out.println((x-3)+"MB");
         }
      if(x == 3*c){
         System.out.println((x+3)+"UB");
        }
      if(x == 6*c){
         System.out.println((x-3)+"UB");
        }
       
     
     
      
      
      
      
      
      t--;
    }
  }
}