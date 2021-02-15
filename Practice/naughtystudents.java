package tcs;
import java.util.*;
class naughtystudents
{
  
 static HashMap<String,Integer> h = new HashMap<String,Integer>(); 
  public static void sortbykey() 
    { 
        ArrayList<String> sortedKeys = 
                    new ArrayList<String>();
  //h.forEach((key,value)  -> sortedKeys.add((String) key) ) ;
        for(String sa : h.keySet())
        {
        	sortedKeys.add(sa);
        }
        Collections.sort(sortedKeys);  
  System.out.println(h);
     
        for (String x : sortedKeys)  
            System.out.println( x + " " + h.get(x));      
    } 
  public static void main(String args[])
  {
    //Try out your code here
  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n-->0)
    {
      String s = sc.next();
      if(h.containsKey(s))
      {
        h.put(s,h.get(s)+1);
      }
      else
      {
        h.put(s,1);
      }
    }
    
    System.out.println(h);
 
   sortbykey();
 
  }
}