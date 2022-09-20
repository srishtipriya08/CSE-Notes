class TestYourKnowledge30
{
	public static void main(String args[])
	{
		int N=16;
		float sum=0.0f;
		float X=2.00f;
		float term=X;
		for(int I=1;I<=N;I++)
		{
			sum=term;
			term=term*X;
		}
		System.out.println("sum="+sum);
	}
}
