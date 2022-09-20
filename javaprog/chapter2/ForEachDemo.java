class ForEachDemo
{
	public static void main(String args[])
	{

	int arr[]={1,3,5,7,9,11,13,15,17,19}; //declare an array with 10 elements 
	System.out.println("First 10 odd numbers are as follows:");
	for(int i:arr) // use for each to retrieve elements from an array
	{
		System.out.println(i); // i represents each element of array
	}
	}
}
