public class Test3
{
public static void main (String args[])
   {
	char arr[ ] = { 'H','E','L','L','O'};		
	char arr1[ ] = new char[10];
	
	System.arraycopy(arr, 1, arr1,0, 2);
	System.out.print("Array after copy is: " );
        for( int y=0; y<arr1.length; y++)
	{
	 System.out.print(arr1[y]);
	}
	

   }
}
