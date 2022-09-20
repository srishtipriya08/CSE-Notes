class TestYourKnowledge16
{
 	public static void main(String args[])
 	{
		int A[][]={{1,2,3,4},{2,3,4,5},{3,4,5,6}};
		float sum=0.0f;
		int k=0;
		for (int I=0;I<=3;I++)
		for (int J=I+1;J<=3;J++)
		{
			 sum+=A[I][J];
			 ++k;
		}
		System.out.println("Sum of matrix is "+sum);
		System.out.println("Avg. of matrix is "+(float)sum/k);
	}
}
