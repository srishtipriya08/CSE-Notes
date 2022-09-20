class TestYourKnowledge13
{
 	public static void main(String args [])
 	{
 		int N,K,I,TEMP,LOC,small;
 		float MEDIAN=0.0f;
 		int A[]={52,36,96,58,47};
 		N=A.length;
 		for (K=0;K<=N-1;K++)
 		{
 			small=A[K];
 			LOC=K;
 			for (I=K+1;I<=N-1;I++)
 			if (small>A[I])
 			{
 				small=A[I];
 				LOC=I;
 			}
 			TEMP=A[K];
 			A[K]=A[LOC];
 			A[LOC]=TEMP;
 			int NN=(N-1)/2;
 			if(NN%2==0)
 			MEDIAN=A[NN];
		}
 		System.out.println("MEDIAN="+MEDIAN);
 	}
}
