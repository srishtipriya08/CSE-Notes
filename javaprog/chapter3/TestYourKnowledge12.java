class TestYourKnowledge12
{
 	public static void main(String args [])
 	{
 		int N,I,J,TEMP,LOC;
 		int A[]={52,36,96,58,47,41,67,49,16,28};
 		N=A.length;
 		for (I=0;I<=N-1;I++)
 		{
 			int small=A[I];
 			LOC=I;
 			for (J=I+1;J<=N-1;J++)
 			if (small>A[J])
 			{
 				small=A[J];
 				LOC=J;
 			}
 			TEMP=A[I];
 			A[I]=A[LOC];
 			A[LOC]=TEMP;
 		}
 		for (I=0;I<=N-1;I++)
 		System.out.print(" "+A[I]);
 	}
}
