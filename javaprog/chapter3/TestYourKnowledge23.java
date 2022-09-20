class TestYourKnowledge23
{
 	public static void main(String args [])
 	{
 		int A[][]={{8,2,3},{2,4,6},{2,8,7},{4,1,3}};
		int B[][]={{4,2,3},{8,7,1},{6,4,2}};
		int C[][]=new int [4][3];
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<3; j++)
 			{
 				C[i][j]=0;
				for (int k=0; k<3;k++)
				C[i][j]+=A[i][k]*B[k][j];
			}
		}

		for(int i=0; i<=3; i++)
		{
			System.out.println( );
			for(int j=0; j<3; j++)
			{
				System.out.println(" "+C[i][j]);
			}
		}
}
}
