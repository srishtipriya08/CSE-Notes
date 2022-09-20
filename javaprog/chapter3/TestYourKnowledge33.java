class TestYourKnowledge33
{
 	public static void main(String args[])
 	{
 		int N,K,I,TEMP,BIG,LOC;
 		int A[]={52,36,96,58,47,41};
 		String SN[]={"AMEY","VINAYA","NIKHIL","RACHNA","PINKY","DHABBA"};
 		N=A.length;
 		String P=new String();
 		for(K=0;K<=N-1;K++)
 		{
 			BIG=A[K];
 			LOC=K;
 			for(I=K;I<=N-1;I++)
 			if(BIG<A[I])
 			{
 				BIG=A[I];
 				LOC=I;
 			}
 			TEMP=A[K];
 			A[K]=A[LOC];
 			A[LOC]=(TEMP);
 			P=SN[K];
 			SN[K]=SN[LOC];
 			SN[LOC]=P;
 		}
 		System.out.println("RESULTS");
 		for(I=0;I<=N-1;I++)
 		System.out.println(" "+SN[I]+" "+A[I]);
 	} 	
}
