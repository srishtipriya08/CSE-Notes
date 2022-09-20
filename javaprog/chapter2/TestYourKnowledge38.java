//Program to display pyramid of numbers:
/*10 9 8 7 6 5 4 3 2 1
  9 8 7 6 5 4 3 2 1
  8 7 6 5 4 3 2 1
  7 6 5 4 3 2 1
  6 5 4 3 2 1
  5 4 3 2 1
  4 3 2 1
  3 2 1
  2 1
  1*/
class TestYourKnowledge38
{
	public static void main(String args [])
	{
		for (int K=10;K>=1;K--)
		{
			System.out.println(" ");
			for (int I=K;I>=1;I--)
			System.out.print(" "+I);
		}
	}
}
