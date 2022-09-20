import java.lang.Math;
//SUM OF 10th+18th+27th TERM of series 
//((x+a)/2!)-((x+2a)/3!)+((x+3a)/4!)....
class TestYourKnowledge28
{
 	public static void main(String args[])
 	{
 		int SIGN=1;
 		double SUM=0.0,TERM,A=1.75,FACT=2.0,X=1.9;
 		for (int I=1;I<=27;I++)
 		{
 			TERM=(X+I*A)/FACT*SIGN;
 			SUM+=TERM;
 			SIGN=-SIGN;
 			FACT=FACT*(I+2);
 			if(I==10)
 			System.out.println("Sum of 10 terms ="+SUM);
 			if(I==18)
 			System.out.println("Sum of 18 terms ="+SUM);
 		}
 		System.out.println("Sum of 27 terms ="+SUM);
 	}
}
