class EvenNumException extends Exception
{
	EvenNumException(String str) // constructor of the class 
	{
		super(str); // used super to refer the super class constructor
	} 

	public static void main(String args[])
	{
		try
		{ 
			int arr[]= {2,4,6,9};
			int sum;
                                                                        int i;
			for(i=0; i<arr.length; i++)
			{
				sum = arr[i]%2;
                                                                                                 if(sum==0)
				{
				           System.out.println(arr[i]+" "+"is an even number");
					}
				else


			                             {
					EvenNumException exp= new EvenNumException("Not an even number"+arr[i]);
					throw exp;
				    }

			
			} 
			
		}
		catch(EvenNumException exp)
		{
			System.out.println("Exception is" + exp);
		}

	}
}

