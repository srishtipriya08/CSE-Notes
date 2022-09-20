import java.util.Random;
public class TestYourKnowledge12
{
	static int count;
	static int number;
	static Random rndnum;
	public static void main(String ar[])
	{
		rndnum=new Random();
		for(count=1;count<=3;count++)
		{
			number=rndnum.nextInt();
			System.out.print("Number Count= "+ count);
			System.out.println("Next Random number= "+ number);
		}
	}
}

