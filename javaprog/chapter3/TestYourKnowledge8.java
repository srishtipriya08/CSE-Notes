class TestYourKnowledge8
{
 	public static void main(String args[])
 	{
 		int count=0,N,I,SUM=0;
 		float AVG=0.0f;
 		int A[] = {10,22,11,30,49,31,42,27,39,61,93,76};
 		N=A.length;
 		for (I=0;I<N;I++)
 		if (A[I]%2==0)
 		{
 			SUM+=A[I]; ++count;
 			AVG=(float) (SUM/count);
 		}
 		System.out.println("SUM="+SUM);
 		System.out.println("AVG="+AVG);
 	}
}
