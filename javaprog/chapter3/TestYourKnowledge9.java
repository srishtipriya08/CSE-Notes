class TestYourKnowledge9
{
 	public static void main(String args[])
 	{
 		int A[]={0,14,26,39,11,46,36,59,18};
 		int N= A.length-1;
 		System.out.println("Array before deletion of elements is:   ");
 		for(int k=0;k<=N;k++)
 		{
 			System.out.print(" " + A[k]);
 		}
 		int I=0,loc;
 		while(A[++I]!=11);
 		loc=I;
 		for(I=loc;I<=N-1;I++)
 		A[I]=A[I+1];
 		N=N-1;
 		System.out.println("  ");
 		System.out.println("Array after deletion of elements is:   ");
 		for(I=1;I<=N;I++)
 		System.out.print("  "+A[I]);
 	}
}
