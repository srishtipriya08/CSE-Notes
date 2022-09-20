class INTERPOLATION
{
 	static void TABLE (int N,float Y[],float T[][])
 	{
 		int I=0;
 		for (I=0;I<=N;I++)
 		T[I][0]=Y[I];
 		for (int J=1;J<=N;J++)
 		T[I][J]=T[I+1][J-1]-T[I][J-1];
 	}
 	float CALCULATE (int N,float X,float X0,float H,float T[][])
 	{
 		int I=0;
 		float P=(X-X0)/H;
 		float SUM=T[0][0];
 		float TERM=1.0f;
 		float F=1.0f;
 		System.out.println(" " + TERM +" " + T[0][I]);
 		SUM=SUM+TERM*T[0][I];
 		F=F*(I+1);
 		System.out.println("ROOT="+ SUM);
 		return(SUM);
 	}
}
class TestYourKnowledge19
{
 	public static void main (String args[])
 	{
 		int N=7;
 		float H=1.0f,X0=1.0f,X=2.5f;
 		float Y[]={3,6,9,12,15,18,21,24};
 		float T[][]=new float [10][10];
 		INTERPOLATION obj=new INTERPOLATION();
 		obj.TABLE (N,Y,T);
 		for (int I=0;I<=7;I++)
 		{
 			System.out.println(" ");
 			for (int J=0;J<=N-I;J++)
 			System.out.print(" " + T[I][J]);
 		}
 		System.out.println(" ");
 		float ROOT=obj.CALCULATE (N,X,X0,H,T);
 		System.out.println("ROOT="+ROOT);
 	}
}
