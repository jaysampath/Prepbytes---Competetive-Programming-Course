package test;

/* Question
A food fest is organised at the JLN stadium. The stalls from different states and cities have been set up. To make the fest more interesting, multiple games have been arranged which can be played by the people to win the food vouchers.One such game to win the food vouchers is described below:

There are N number of boxes arranged in a single queue. Each box has an integer I written on it. From the given queue, the participant has to select two contiguous subsequences A and B of the same size. The selected subsequences should be such that the summation of the product of the boxes should be maximum. The product is not calculated normally though. To make the game interesting, the first box of subsequence A is to be multiplied by the last box of subsequence B. The second box of subsequence A is to be multiplied by the second last box of subsequence B and so on. All the products thus obtained are then added together.

If the participant is able to find the correct such maximum summation, he/she will win the game and will be awarded the food voucher of the same value.

Note: The subsequences A and B should be disjoint.

Example:

Number of boxes, N = 8

The order of the boxes is provided below:

1 9 2 3 0 6 7 8

Subsequence A

9 2 3

Subsequence B

6 7 8

The product of the subsequences will be calculated as below:

P1 = 9 * 8 = 72

P2 = 2 * 7 = 14

P3 = 3 * 6 = 18

Summation, S = P1 + P2 + P3 = 72 + 14 + 18 = 104

This is the maximum summation possible as per the requirement for the given N boxes.

Tamanna is also in the fest and wants to play this game. She needs help in winning the game and is asking for your help. Can you help her in winning the food vouchers?

Input Format

The first line of input consists of the number of boxes, N.

The second line of input consists of N space-separated integers.

Constraints

1< N <=3000

-10^6 <= I <=10^6

Output Format Print the maximum summation of the product of the boxes in a separate line.

Sample TestCase 1 input

8
1 9 2 3 0 6 7 8
output

104
*/
/* 
 C++ Solution
 #include <iostream>

#include <cassert>

using namespace std;

template<class T> inline void umax(T &a,T b){if(a<b) a = b ; }

template<class T> inline void umin(T &a,T b){if(a>b) a = b ; }

template<class T> inline T abs(T a){return a>0 ? a : -a;}

template<class T> inline T gcd(T a,T b){return __gcd(a, b);}

template<class T> inline T lcm(T a,T b){return a/gcd(a,b)*b;}

typedef long long ll;

typedef pair<int, int> ii;

const int inf = 1e9 + 143;

const ll longinf = 1e18 + 143;

inline int read()

{

int x;scanf(" %d",&x);

return x;

}

const int N = 20001;

int n;

int a[N];

void read_inp()

{

   n = read();

   assert(1 <= n && n <= 20000);

   for(int i = 1; i <= n; i++)

{

       a[i] = read();

       assert(abs(a[i]) <= int(1e6));

   }

}

int main()

{

#ifdef KAZAR

   freopen("f.input","r",stdin);

   freopen("f.output","w",stdout);

   freopen("error","w",stderr);

#endif

   read_inp();

   ll ans = -longinf;

   for(int i = 1; i <= n; i++)

{

       {

           int l = i - 1, r = i;

           ll best = 0ll, cur = 0ll;

           while(l >= 1 && r <= n)

  {

               ll val = (ll)a[l] * a[r];

               cur += val;

               umin(best, cur);

               umax(ans, cur - best);

               --l;

               ++r;

           }

       }

 {

           int l = i - 1, r = i + 1;

           ll best = 0ll, cur = 0ll;

           while(l >= 1 && r <= n)

  {

               ll val = (ll)a[l] * a[r];

               cur += val;

               umin(best, cur);

               umax(ans, cur - best);

               --l;

               ++r;

           }

       }

   }

   printf("%lld\n",ans);

   return 0;

}
 */
public class foodfest {
	public static void main(String[] args)
	{
		
	}

}
