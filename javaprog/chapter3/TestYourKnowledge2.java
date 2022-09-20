class TestYourKnowledge2
{
 	public static void main(String args[])
 	{
 		int x[]={8,7,2,9,6,1,3,78,25,15};
 		int temp;
 		int y=x.length;
 		for(int j=0; j<y; j++)
 		{
 			for(int m=1; m<(y-j); m++)
 			{
 				if(x[m-1]>x[m])
 				{
 					temp = x[m-1];
 					x[m-1] = x[m];
 					x[m] = temp;
 				}
 			}
 		}
 		for(int k=0; k<y;k++)
 		{
 			System.out.print(x[k] + " ");	
 		}
 	}
}
