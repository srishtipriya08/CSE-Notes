import java.io.*;
class MATRIX
{
    int A[][] = new int [10][10];
    int M,N;

    public MATRIX()
    {
	int M=6,N=5;
	for (int i=1;i<=M; i++)
	for (int j=1;j<=N; j++)
	    A[i][j]=0;
    }

    void ReadMatrix () throws IOException
    {
	BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
	System.out.print("Please Enter M: ");	
	M=Integer.parseInt(obj.readLine());
	System.out.print("Please Enter N: ");	
	N=Integer.parseInt(obj.readLine());
	for (int i=1;i<=M; i++)
	for (int j=1;j<=N; j++)
	A[i][j]=Integer.parseInt(obj.readLine());
    }

    void MatADD (MATRIX M1, MATRIX M2)// Object as parameter
    {
	M= M1.M;
	N= M1.N;
	for (int i=1;i<=M; i++)
	for (int j=1;j<=N; j++)
	A[i][j] = M1.A[i][j] + M2.A[i][j];
    }

    void MatMult (MATRIX M1, MATRIX M2)// Object as parameter
    {
	for (int i=1;i<=M1.M; i++)
	for (int j=1;j<=M2.N; j++)
	{
	    A[i][j]  = 0;
	    for (int k=1;k<=M1.N; k++)		
	    A[i][j] += M1.A[i][k] * M2.A[k][j];
	}	
    }

    void MatTranspos()
    {
	if (M > N )
	{
	    int T = M;
	    M=N;
	    N=T;
	}
	
	for (int i=1;i<=M; i++)
	    for (int j=i;j<=N; j++)
	    {
		int T = A[i][j];
		A[i][j] = A[j][i];
		A[i][j]  = T;
	    }
    }

    void MatDisplay ()
    {
	for (int i=1;i<=M; i++)
	{
	    System.out.println();
	    for (int j=1;j<=N; j++)
		System.out.print("    " + A[i][j] );
	}	
    }
}

//MAIN 
class TestYourKnowledge13
{
    public static void main (String args[]) throws IOException
    {
	MATRIX M1 = new MATRIX();
	MATRIX M2 = new MATRIX();
	MATRIX M3 = new MATRIX();
	
	M1.ReadMatrix();
	M2.ReadMatrix();
	M3.MatADD(M1,M2);
	M3.MatDisplay();
	M3.MatMult(M1,M2);
	M3.MatDisplay();
	M3.MatTranspos();
	M3.MatDisplay();
    }
}
