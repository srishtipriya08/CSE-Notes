class TestYourKnowledge24
{
	public static void main (String args[])
	{
		char first_arr[ ] = { 'K','D','E','M','M','k'};		
		char second_arr[ ] = {'B','C','R','H','N','M','F','D','X','G'};
		System.out.print(" Elements in first array in between index 2 to 4 are --- ");
		
		for( int x=2; x<=4; x++)
		{
			System.out.print(first_arr[x]);
		}

		System.out.print(" \n" );
		System.out.print(" Elements in Second array in between index 2 to 4 are --- " );

		for( int j=2; j<=4; j++)
		{
		 	System.out.print(second_arr[j]);
		}
		
		System.arraycopy(first_arr, 2, second_arr,2, 3);
		System.out.print(" \n" );
		System.out.print("Elements in second array after coying are ---- " );

		for( int y=2; y<=4; y++)
		{
		 	System.out.print(second_arr[y]);
		}
	
		System.out.print(" \n" );
	}
}
