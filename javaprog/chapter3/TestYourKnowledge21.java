class TestYourKnowledge21
{
 	public static void main(String args [])
 	{
 		int i,j,sum,Gsum=0;
 		int A[][]={{10,15,17,39},{16,26,39,60},{28,32,180,40}};
 		for(i=0; i<=2; i++)
 		{
 			sum=0;
 			System.out.println(" ");
 			for(j=0; j<=3; j++)
 			{
 				System.out.println(" "+A[i][j]);
 				sum+=A[i][j];
 			}
 			System.out.println("  "+sum);
 			Gsum+=sum;
 		}
 		System.out.println("   "+Gsum);
 	}
}
