//Program to find the sum of following series:
/* 21*26   30*35   39*44
  ------ + ----- + ------ + UPTO 10 terms
   14*16   19*21   24 *26
*/

import java.lang.Math;
class TestYourKnowledge25
{
	public static void main(String args[])
	{
		float sum=0.0f;
		float term=0.0f;
		int L=21,K=14;	
 		for (int I=1;I<=10;I++)
		{
			term=((float)L*(L+5)/(K*K+2));
			sum+=term;
			L+=9;
			K+=5;
		}
		System.out.println("Sum of expression is " +sum);
	}
}
