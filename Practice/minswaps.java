/*public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
     }
}*/
import java.util.*;
public class minswaps {
    
    public static void main(String []args){
        String s = "abaab";
        int res1 = minswaps(s.toCharArray());
        System.out.println(res1);
        
        int n = 5,i=2;
    	long[] arr = new long[(int) n];
        long res =arr[0];
    	res = res + (int) (Math.abs((arr[i] - arr[i-1])));
     }
     
private static boolean isPalindrome(char[] s1) {
	HashSet<Character> hs = new HashSet<>();
	for(char c: s1) {
		if(hs.contains(c)) {
			hs.remove(c);				
		}				
		else {
			hs.add(c);
		}				
	}
	System.out.println(hs);
	return hs.size() < 2;
}

private static void swap(char[] s2, int i, int j) {
	char tmp = s2[i];
	s2[i] = s2[j];
	s2[j] = tmp;
}

public static int minswaps(char[] s1) {
	int result = 0;
	if(!isPalindrome(s1))
		return -1;
	int i = 0;
	int j = s1.length - 1;
	int k = j;
	while(i < j) {
		k = j;
		System.out.println("k= "+k);
		while(s1[i] != s1[k] && k > i){
		    System.out.println(s1[i]+" "+ s1[k] + " k= "+k);
		
			k--;
		}
		System.out.println("k= "+k);
		if(s1[i] == s1[k] && i != k) {
			while(k < j) {
			    System.out.println("k= "+k);
				swap(s1,k,k+1);
				k++;
				result++;
				System.out.println(Arrays.toString(s1));
				System.out.println(k+" "+result);
			}
			i++;
			j--;
		}
		else {
			swap(s1,i,i+1);
			result++;
		}
		
	}
	return result;
	
}
}