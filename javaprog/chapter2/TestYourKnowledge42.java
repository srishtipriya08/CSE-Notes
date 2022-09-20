class TestYourKnowledge42
{
	public static void main(String args[])
	{

		int A[ ][ ]=new int[11][11];
		int M=10; // Number of rows
 		int N=9; // number of colums
		int I,J,K,count;
		for(I=1;I<=10;I++)
		for(J=1;J<=10;J++)
		A[I][J]=0;

		I=1;
		J=1;
		K=0;
		count=0;

		do
		{
			++count;

			do
			{
				 
					++K;
					A[I][J]=K;
				 
				 
				if (count %2!=0) ++J;
				else --J;
			}
			while ((J<=N) && (J>=1)&&(A[I][J]==0));

			if (count %2!=0) J--;
			else J++;

			if (count %2!=0) I++;
			else I--;
			 	do
			{
				 
				++K;
				if(	A[I][J]==0) A[I][J]=K;
				 
				if (count %2!=0) I++;
				else I--;
			}
			while((I<=M)&&(I>=1)&&(A[I][J]==0));
				
			if (count %2!=0) --I;
			else ++I;
			 	if (count %2!=0) --J;
				else ++J;
		}
		while(K<M*N);

		for(I=1;I<=M;I++)
		{
			System.out.println("\n");
			for(J=1;J<=N;J++)
			System.out.print("   "+A[I][J]);
		}
		System.out.println("\n");
	}
}
