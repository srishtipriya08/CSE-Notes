class ArrayExample4
{
  
 
public static void main (String args[])
   {
	char start_arr[ ] = { 'D','e','e','p','a','k',' ' ,'g', 'u', 'p', 't', 'a'};		
	char target_arr[ ] = new char[15];
	System.out.print(" Starting Array has name ---- " );
	for( int x=0; x<start_arr.length; x++)
	{
	 System.out.print(start_arr[x]);
	}
	System.out.print(" \n" );
	System.arraycopy(start_arr, 0, target_arr,0, 12);
        System.out.print(" After copying the Target Array has name ---- " );
	for( int y=0; y<target_arr.length; y++)
	{
	 System.out.print(target_arr[y]);
	}
	System.out.print(" \n" );

   }
}