//Program to find the sum of the series X+A/2!-X+2A/3!+.... UPTO 20
class TestYourKnowledge24
{
	public static void main(String args[])
	{
		int sign=1;
		float sum=0.0f;
		float A=1.75f,X=2.0f,fact=2.0f;
		float term=X;
		for(int I=1;I<=20;I++)
		{
			term=(X+I*A)/fact*sign;
			sum+=term;
			if(I==10)
			System.out.println("Sum of 10 terms is "+sum);
			sign=-sign;
			fact=fact*(I+2);
		}
		System.out.println("Sum of 20 terms is "+sum);
	}
}
