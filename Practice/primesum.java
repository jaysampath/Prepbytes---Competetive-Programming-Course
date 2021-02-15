package codes;
import java.util.*;
class primesum {
	 
    public static int prime(int b) {
        int j,cnt;
        cnt=0;
        for (j = 2; j <= b; j++) {
            if(b%j==0)
                cnt++;
        }
        if(cnt==1)
        return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n=0,cnt,c=0,sum=0,count=0,k=0;
     //   Main t = new Main();
        int[] a = new int[50];
        System.out.println("Enter no");
        n = sc.nextInt();
        sc.close();
       for (i = 2; i <=n ; i++) {
            cnt=0;
            for (j = 2; j <= i; j++) {
                if(i%j==0) {
                    cnt++;
                    
                }
            }
            if(cnt==1) {
                a[k]=i;
               // System.out.println(a[k]);
                k++;
            }
            
        }
       System.out.println(Arrays.toString(a));
       System.out.println("hi");
        for (i = 0; i < k; i++) {
            sum=sum+a[i];
            if(sum>n) {
            break;
            }
            c= prime(sum);
            if(c==1 ) {
            	System.out.println(sum);
            	 count++;
            }
               
        }
        
        System.out.println(count-1);
    }

}