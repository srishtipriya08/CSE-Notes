import java.io.*;
class TestYourKnowledge12
{
    public static void main (String args[])throws IOException
    {
	String SN[] = new String [70];
	int M[] = new int [70];
	BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
	System.out.print("Enter Number of Student   : ");
	
	int N= Integer.parseInt(obj.readLine());
	for (int i =1; i<=N;i++)
	{
	    System.out.print(i  + " Student Name ");
	    SN[i] = obj.readLine();
	    System.out.print("       Marks ");
	    M[i] = Integer.parseInt(obj.readLine());
	}

	int t= 0;
	for (int j = 1 ; j <= N-1; j++)
	    for (int i = 1;i<=N-j;i++)
		if (M[i] >M[i+1])
		{
		    t = M[i];
	 	    M[i]= M[i+1];
		    M[i+1] = t;
		    String	st = SN[i];
		    SN[i]= SN[i+1];
		    SN[i+1] = st;	
		}

		System.out.println("Name of Students As per their Marks");
		System.out.println("Student's Name    Marks");
	
		for (int i = 1;i<=N;i++)
		{
			System.out.println(SN[i] + "              " +M[i] );
		}	
    }
}

