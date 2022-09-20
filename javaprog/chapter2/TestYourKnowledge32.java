import java.lang.Math;
class TestYourKnowledge32
{
 	public static void main(String args[])
 	{
 		float SUM=0.0f,TERM=1.0f,A=1.75f,FACT=2.0f;
 		int I;
 		for (I=1;I<=20;I++)
 		{
 			TERM=((1+(I+1)*A)/FACT);
 			SUM=+TERM;
 			FACT=FACT*(I+2);
 		}
 		System.out.println("SUM ="+SUM);
 	}
}
