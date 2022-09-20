class TestYourKnowledge15
{
 	public static void main (String args[])
 	{
 		int A[] = {0,2,5,2,5,8,2,5,8,8,6,3,7,8,5,5,9,2,7,2,8,6};
 		int N = A.length-1;
 		int loc= 0,BIG=0;
 		for (int i = 1 ; i <= N; i++)
 		{
			int count= 0;
			for (int j = 1;j<=N;j++)
			if (A[i] == A[j]) count++;
 			if (BIG  <count)
			{BIG = count;
			loc = i;
		}
}
System.out.println("Mode is " + A[loc]);
}
}
