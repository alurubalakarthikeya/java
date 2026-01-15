// populate
// priming
// process
//
/*
a number 'a' that divides and it leaves no remainder then 'a' is a called of
'x'
x/a = q
n
200

check       jodi
1           200
2           100
4           50
5           40
8           25
10          20

11          18.xx
12          16.xx
13          15.xx
14          14.xx
15          13.xx
16
17
18
19
20
cf          quo

quo = num / cf

quo>= cf
cf <= quo

cf * cf <= num
            200
            cf
            1
            2
            3
            4
            5
            6
            7
            8
            9
            10
            11
            12
            13
            14
            15





























*/
// 2147483647
#include<stdio.h>
#include<stdlib.h> // etch or aitch
#include<time.h>
#include<math.h>
typedef long long int lli;
int main()
{
   long long int n;
   scanf("%lld", &n);
   lli check_for_factor;
   int flag;
   clock_t start_time;
//   sof_n = 0;
   start_time = clock();
   flag = 0;
   lli until;
   until = sqrt ( n );
   for( check_for_factor = 2 ; check_for_factor <= until;  check_for_factor+=1)
   {
      if ( n % check_for_factor == 0)
      {
           flag = 1;
           break;
       }
           //sof_n += check_for_factor;
        // printf("%d ", check_for_factor);


   }

   clock_t end_time = clock();
   double diff = ( end_time - start_time ) / CLOCKS_PER_SEC;
   printf("\n%s \nTime taken = %.3f", flag == 0 ? "Prime":"Composite", diff);
return EXIT_SUCCESS;
}
