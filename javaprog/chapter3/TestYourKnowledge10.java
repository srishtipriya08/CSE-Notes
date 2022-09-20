class TestYourKnowledge10
{
 	public static void main (String args[])
 	{
		int count=0,N,I,SUM=0;
		int A[]={10,22,11,36,49,31,42,27,39,27,39,61,93,76};
		N=A.length;
		for (I=0;I<=N-1;I++)
		{
			if (A[I]%2!=0)
			{
				SUM+=A[I];
				++count;
			}
			
		}
		System.out.println("SUM="+ SUM);
	}

}
