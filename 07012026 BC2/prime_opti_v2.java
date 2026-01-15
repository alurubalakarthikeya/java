// 2503
// 50.xx
// 51
/*
2 
3 5 7 9 11 13 15 17 19 21 23 25 27 29 31
33 35 37 39 41 43 45 47 49 51

2 3
5 7 11 13 17 19 23 25 29 31 35 37 41 41 47 49
 6    12    18    24 
        ?     ?      
 2   3  4  5  6  7
 8   9  10 11 12 13
 14 15  16 17 18 19
 20 21  22 23 24 25
 
 
 
 
 
 
 
 
 
 
 
 
*/
import java.util.Scanner;
class prime_opti_v2
{

public static void main( String [] popo)
{
   long n;
   Scanner kbrd = new Scanner ( System.in );
   n = kbrd.nextLong();
   long check_for_factor;
   boolean flag;
   long start_time = System.currentTimeMillis();
//
   flag = false;
   long until;
   until = (long) Math.sqrt ( n );
   if ( n % 2 == 0)
	   flag = true;
   else
   for( check_for_factor =3; check_for_factor <= until;  check_for_factor+=2)
   {	   
       if ( n % check_for_factor == 0)
       {
       flag = true;
       break;
	   }

   }

   long end_time = System.currentTimeMillis();
   double diff = ( end_time - start_time ) / 1000.0;
   System.out.printf("\n%s \nTime taken = %.3f", flag == false ? "Prime":"Composite", diff);

}

}