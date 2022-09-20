// biggest first & second no.
import java.lang.Math;
class TestYourKnowledge7
{
	public static void main (String args[])
	{
		int A[]={16,56,34,98,46,34,76,87};
		int BIG1=A[0];
		int n=A.length;
		for (int I=1; I<n-1; I++)
		if (BIG1<A[I])
		BIG1=A[I];
		System.out.println("Biggest No = " +BIG1);
		int I=0;
		while (A[I]==BIG1)
		++I;
		int BIG2=A[I];
		for (I=0; I<=n-1; I++)
		if ((BIG2<A[I])&&(A[I]!=BIG1))
		BIG2=A[I];
		System.out.println("Second Biggest = " +BIG2);
	}
}
