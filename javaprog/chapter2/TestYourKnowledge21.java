//Program to find the sum of a given series X+X2+X3+.......+Xn.
class TestYourKnowledge21
{
	public static void main (String args[])
	{
		float X=1.0f; // X value is defined by user
		float sum=0.0f;
		float term=X;
		for (int I=1;I<=20;I++)
		{
			sum=sum+term;
			term=term*X;
		}
	System.out.println("The Sum of given 	Expression is "+sum);
	}
}
