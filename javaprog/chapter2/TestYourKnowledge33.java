class TestYourKnowledge33
{
 	static int fact(int N)
 	{
 		int F=1;
 		for(int I=1;I<=N;I++)
 		F=F*I;
return(F);
 	}
 	static float sumXY(int N,int K,int X[])
 	{
 		float sum=0.0f;
 		for (int I=0;I<=N;I++)
 		sum=+X[I]*X[I];
 		return(sum/fact(K));
 	}
 	public static void main(String args[])
 	{
 		int N=5,K1=6,K2=7;
 		float T;
 		int X[]={1,3,5,8,11,16};
 		int Y[]={2,4,8,16,18,20};
 		T=sumXY(N,K1,X)+sumXY(N,K2,Y);
 		System.out.println("sum="+T);
 	}
}
