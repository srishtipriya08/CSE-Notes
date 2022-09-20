//Identify the given number is a perfect square root.
import java.lang.Math;
class TestYourKnowledge7
{
	public static void main(String args [])
	{
		int NO=3600,K;
		K=(int) Math.sqrt(NO);
		if (NO==K*K)
		System.out.println("Number is perfect square");
		else
		System.out.println("Number is not perfect square");
	}
}
