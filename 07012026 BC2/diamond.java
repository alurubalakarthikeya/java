import java.util.Scanner;

class diamond
{
	public static void main( String [] parameters )
	{
		int n;
        Scanner kbrd       =          new               Scanner ( System.in );
//     class    reference assignment  operator          class     paramter to constructor
//                                    memory allocation		
	    n = kbrd.nextInt();
		// n = int(input())
		int row;
		int col;
		char whatToPrint;
		whatToPrint= 'A';
		for ( row = 1; row <= n ; row++,System.out.println())
		{
		    // spaces
			for( col = 1; col <= n-row ; col++)
			{
			   System.out.printf("  ");
			}

			// stars
			for( col = 1; col <= row + row - 1 ; col++)
			{
			   System.out.printf("%c ", whatToPrint);
			   whatToPrint++;
			   if ( whatToPrint > 90 )
				   whatToPrint = 'A';
			}

		}
		// mirror
	     for ( row = n-1; row > 0 ; row--,System.out.println())
		{
		    // spaces
			for( col = 1; col <= n-row ; col++)
			{
			   System.out.printf("  ");
			}
//217483647
//217483647
//2147483647
			// stars
			for( col = 1; col <= row + row - 1 ; col++)
			{
			   System.out.printf("%c ", whatToPrint);
			   whatToPrint++;
			   if ( whatToPrint > 90 )
				   whatToPrint = 'A';
			}

		}

	}

}