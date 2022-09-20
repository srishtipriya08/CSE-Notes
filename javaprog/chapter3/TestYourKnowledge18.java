class TestYourKnowledge18
{
	public static void main(String args[])
	{
		int M=2;
		int L=4;
		int N=2;
		int A[]={0,1,2,3,4,5,6,7,8,9};
		int B[]={0,1,2,3,4,5,6,7,8,9};
		int C[][]=new int [3][3];
		int F,G,I,J,K;
		F=0;
		System.out.println("  ");
		for (I=1;I<=M;I++)
		{
			G=0;
			for (J=1;J<=N;J++)
			{
				C[I][J]=0;
				F=I*L-L;
				for (K=1;K<=L;K++)
				C[I][J] += A[++F]*B[++G];
			}
		}
		for (I=1;I<=N;I++)
		{

			System.out.println();
			for (J=1;J<=N;J++)
	  	 	System.out.print("  "+C[I][J]);
		}
	}
}
