package tcs;
import java.util.*;

public class weightedpark{
public static void main(String args[]){
int i,j,M,N;
Scanner sc =new Scanner(System.in);
//sc.useDelimiter(",|\n");
N = sc.nextInt();
int a[][]=new int[N][N];
for(i=0;i<N;i++)
{for(j=0;j<N;j++)
{a[i][j] = sc.nextInt();
}}
i=0;j=0;M=1;
/*while(i!=(N-1)||j!=(N-1)){
if(j==N-1){
i++;
if(a[i][j]>M){
M=a[i][j];}
}
else if(i==N-1){
j++;
if(a[i][j]>M){
M=a[i][j];}
}
else if(a[i][j+1]<a[i+1][j]){
if(a[i][j+1]>M){
M=a[i][j+1];}
j++;
}
else if(a[i+1][j]<a[i][j+1]){
if(a[i+1][j]>M){
M=a[i+1][j];}
i++;}
}*/
int dp[][] = new int[N][N];
try {
for(i=0;i<N;i++)
{for(j=0;j<N;j++)
{
	dp[i][j] = Math.max(a[i][j],Math.max(a[i+1][j], a[i][j+1]));
	
}
}
}
catch(Exception e)
{
	
}
System.out.println(dp[N-1][N-1]);
}
}
/*
4 
1 8 21 7
19 17 10 20
2 18 23 22
14 25 4 13
*/

/*
5
 1 29 40 24 12 
 13 31 40 31 33 
 29 40 17 35 32 
 15 39 28 3 31 
 15 21 31 38 24
*/