//Program to find sum of the given series X/1+X2/2+.... up to 20 terms  
class TestYourKnowledge22
{
	public static void main (String args[])
	{
		float K=1.0f;
		float X=1.0f;
		float sum=0.0f;
		float term=X;
		for (int I=1;I<20;I++)
		{
			sum=sum+term;
			term=term*X/K;
			++K;
		}
		System.out.println("The sum of expression is"+sum);
	}
}
