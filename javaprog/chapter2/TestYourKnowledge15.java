class TestYourKnowledge15
{
	public static void main(String args[])
	{
		int no=3452;
		int d,sum=0;
		do
		{
			d=no%10;
			sum+=d;
			no=no/10;
		}
		while(no>0);
		System.out.println("Sum of given number is" +sum);
	}
}
