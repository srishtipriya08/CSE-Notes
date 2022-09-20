//Program to evaluate x/1 + (x sq)/2 + (x cube)/3+   x 4/ 4....upto 16terms
import java.lang.Math;
class TestYourKnowledge27
{
	public static void main(String args [])
	{
		float X=1.75f, N=16 , I;
		float SUM= 0 ;
		int K =2;
		float TERM=X ;
		for (I=1;I<=N;I++)
		{
			SUM=(SUM+TERM);
			TERM = TERM*X/K ;
			++K ;
		}
 		System.out.print("SUM="+SUM);
 	}
}
