class Primenum
{
	public static void main(String args[])
	{
		int num[] ={2,4,5,6,7,9,11,13};
		int i,j;
		for(j=0;j<num.length;j++)
		{
			for(i=2; i<=num[j]; i++)
			{
		     		int n = num[j]%i;
				if(n == 0 )
				{
				break;
				}
			}

			if(i == num[j])
			{
				System.out.println("Prime" + num[j]);
			}
		}		

	}
}
