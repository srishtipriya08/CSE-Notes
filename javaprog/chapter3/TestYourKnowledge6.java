class TestYourKnowledge6
{
 	public static void main(String args [])
 	{
 		int N,K,I,BIG;
 		int F[]=new int[20];
 		int A[]={25,24,26,25,26,26,26,24,26,27,27,25,26,27,27};
 		N=A.length;
 		for(K=0;K<=N-1;K++)
 		{
 			F[K]=0;
 			for(I=0;I<=N-1;I++)
 			{
 				if(A[K]==A[I])
 				++F[K];
 			}
 		}
 		BIG=F[0];
 		int LOC=0;
 		for(I=1;I<=N-1;I++)
 		{
 			if (BIG<F[I])
 			{
 				BIG=F[I];
 				LOC=I;
				System.out.print("MODE = " +A[LOC]);
 			}
 		}
 	}
}
