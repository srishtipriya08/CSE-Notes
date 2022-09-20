// Program to find sum of 16 terms of the form
// x +x2 + x3 + x4 + x5...
class TestYourKnowledge26
{
	public static void main (String args [ ])
	{
		float X=(float)1.75;
		int N=16;
		float SUM=(float) 0.0,I;
		float TERM= (float)X;
		for (I=1;I<=N;I++)
		{
			SUM=SUM+TERM;
			TERM= TERM*X;
		}
		System.out.println("SUM="+SUM);
	}
}

