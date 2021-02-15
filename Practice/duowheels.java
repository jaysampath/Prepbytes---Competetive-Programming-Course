package test;

/*Duo Wheel - Interview Question
Singapore is building another giant wheel, the Duo Wheel. This is created for couples to enjoy Singapore's breath taking 
beauty in peace and quite. There are N cabins in the Duo Wheel. Couples wait at the entrance. Cabins pass the entrance one
by one, and when a free cabin passes the entrance, the couple may enter that cabin. The cabins are designed to accomodate
only one couple, so if the cabin passing by the entrance is already occupied, the couple waiting at the entrance will have
to wait for the next one to arrive. If that cabin is also occupied, the couple will have to wait for the next one after
that, and so on, until a free cabin arrives. Whenever a couple is done with their sight seeing, couples exit the cabin
before the entrance. The cabins move slow enough to allow couples to exit first and then enter. Couples enter the cabin,
and then rotate with the wheel for a very long time. For current purposes, all couples sightsee in their cabins till
all cabins are filled. Management of Duo Wheel wants to make sure people are not disappointed because of long waiting
times, and so have introduced a flexible pricing scheme: when a person approaches the wheel, and the first cabin
passing by the entrance is free, they pay N dollars for the ride. If the first cabin is occupied and the couple has
to wait for the second one, they pays N-1 dollars for the ride. If the first two cabins are occupied and they have
to wait for the third one, they pays N-2 dollars for the ride. Generally, if she has to wait for K occupied cabins
to pass by, they pay N-K dollars. In the worst case, when they have to wait for all but one cabin to pass, they
 will pay just 1 dollar. Let's assume that people approach our wheel at random moments in time, so for each
couple approaching the wheel, the next cabin to pass the entrance is taken as the first one they wait for.
Let's also assume that nobody will come to the wheel while there's already at least one couple waiting to
enter, so that we don't have to deal with queueing. A couple will always take the first free cabin that
passes the entrance. You are given the number of cabins and which cabins are already occupied. How much
money are we going to make, on average, until all cabins become occupied? Input Number of cabins followed
by a line containing '.' and 'X'. '.' are free cabins and 'X' is occupied. Since it is a wheel you can
take, the first cabin follows after the last one. Ouput Average amount of money that the Duo Wheel
will make when all cabins are occupied. Please calculate upto 5th decimal point .
 Input 3 .X. Output 4.66667 
 Input 4 X.X. Output 6.00000 
 Input 4 .XX. Output 5.75000
 
 */

import java.io.*;
import java.util.*;
class duowheels {
  public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Character> lis = new ArrayList<Character>();
    List<Float> v = new ArrayList<Float>();
    List<Character> w3 = new ArrayList<Character>();
    
    String temp = sc.nextLine();
    String s1 = sc.nextLine();
    
    String[] s2 = s1.split(" ");
    for(int i = 0; i < s2.length; i++)
    {
        lis.add(s2[i].charAt(0));
    }
   // System.out.println(lis);
   int countx = 0;
   for(int i = 0; i < lis.size(); i++)
   {
       if(lis.get(i) == 'X')
       countx++;
   }
   
   for( int z = 0; z < n-countx ; z++)
   {
       for( int k = 0; k < n ; k++)
       {
           w3.clear();
           for( int m = k ; m < lis.size(); m++)
           {
               w3.add(lis.get(m));
           }
           for( int m = 0 ; m < k; m++)
           {
               w3.add(lis.get(m));
           }
           
           v.add( (float) n-w3.indexOf('O'));
       }
       lis.set(lis.indexOf('O'),'X') ;
      // System.out.println(lis);
   }
   float sum =0;
   for( int y = 0; y < v.size() ; y++)
   sum += v.get(y);
   
   float res = sum/n ;
   System.out.printf("%.5f",res);
  }
}
