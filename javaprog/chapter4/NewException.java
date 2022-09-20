class NewException extends Exception
{
	NewException(String str) // constructor of the class 
	{
		super(str); // used super to refer the super class constructor
	} 

	public static void main(String args[])
	{
		try
		{ 
			int arr[]= {9,7,14,6,28};
			int sum=0;
			for( int i=0; i<arr.length; i++)
			{
				sum = sum + arr[i];
			} 
			System.out.println ("Sum of the array elements is " + sum); 
			if (sum<100)
			{
				NewException exp= new NewException("Total sum of the array elements is less than 100"); 
				throw exp;
			}
		}
		catch(NewException exp)
		{
			System.out.println("Exception is" + exp);
		}

	}
}

