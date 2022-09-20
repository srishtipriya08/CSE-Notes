import java.io.*;
class TestYourKnowledge10
{
	public static void main (String args[])throws IOException
	{
 	BufferedReader obj = new BufferedReader ( new InputStreamReader   		(System.in));
		System.out.println("Enter the number");
		int NO = Integer.parseInt(obj.readLine());
		int dv =2;
		int count= 0;
		while (NO>1)
		{
			if (NO%dv != 0)
				NO =NO *3 +1;
			else
				NO= NO/2;
				count++;	
				System.out.println(NO);
		}
		System.out.println("Number of iterations required = "+ count);
	}
}
