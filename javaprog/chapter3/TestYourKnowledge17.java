class TestYourKnowledge17
{
 	static float X[]=new float [10];
 	static float A[][]=new float [10][10];
 	static int N=3;
 	static void input()
 	{
 		float B[][]={{0,0,0,0,0},{0,2,6,1,26},{0,3,1,2,17},{0,4,2,2,22}};
 		for (int I=1;I<=3;I++)
 		for (int J=1;J<=4;J++)
 		A[I][J]=B[I][J];
 	}
 	static void pivot (int K)
 	{
 		int L=K;
 		for (int I=K+1;I<=N;I++)
 		if (A[I][K]>A[L][K])L=I;
 		for ( int J=1;J<=N+1;J++)
 		{
 			float T=A[L][J];
 			A[L][J]=A[K][J];
 			A[K][J]=T;
 		}
 	}
 	static void elimination()
 	{
 		for (int k=1;k<=N-1;k++)
 		{
 			pivot (k);
 			for (int I=k+1;I<=N;I++)
 			{
 				float fact=(A[I][k]/A[k][k]);
 				for (int J=1;J<=N+1;J++)
 				A[I][J]=A[I][J]-A[k][J]*fact;
 			}
 		}
 	}
  	static  void backSub()
 	{
 		X[N]=A[N][N+1]/A[N][N];
 		for (int I=N-1;I>=1;I--)
 		{
 			float SUM=0;
 			for (int J=I+1;J<=N;J++)
 			SUM+=A[I][J]*X[J];
 			X[I] =A[I][N+1]-SUM/A[I][I];
 		}
 	}
 	public static void main (String args[])
 	{
 		input();
 		elimination();
 		backSub();
 		for (int I=1; I<=N;I++)
 		System.out.println("  "+X[I]);
 	}
}
