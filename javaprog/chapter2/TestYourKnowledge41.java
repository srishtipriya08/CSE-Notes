class TestYourKnowledge41
{
	public static void main (String args[]) 
	{
		int N=10;// Number Rows of Pyramid
		int j=0;

		for (int K = 1; K<=N;K++)
		{
			System.out.println();
			for (int i = 1 ; i<=K;i++)
			{
				++j;
				System.out.print (" " + j);
			}
		}
	}
}
