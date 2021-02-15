package pbweek1;
import java.util.*;
import java.io.*;
public class progression {





  public static boolean ispresent(int a , int b, int c)
  {
    int temp = (int) ((b-a)/c);
    System.out.println(temp);
    System.out.println(a+c*temp);
    if((a+c*temp == b))
    return true;
    else
    return false;
  }
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0)
    {
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     
     if(ispresent(a,b,c))
     {
       System.out.println("YES");
     }
     else
     System.out.println("NO");
     
     t--;
    }
  }
}