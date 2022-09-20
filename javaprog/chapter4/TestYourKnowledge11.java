import java.io.*;
class TestYourKnowledge11
{
    public static void main (String args[])throws IOException
    {
	String CN[] = new String [10];
	int P[] = new int [10];
	BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
	System.out.print("Enter Number of Companies Quoted   : ");
	int N= Integer.parseInt(obj.readLine());
	
	for (int i =1; i<=N;i++)
	{
	    System.out.print(i  + "  Company Name ");
	    CN[i] = obj.readLine();
	    System.out.print("       Quoated Price ");
	    P[i] = Integer.parseInt(obj.readLine());
	}
	
	int small = P[1];
	for (int i = 1;i<=N;i++)
	if (small >P[i])
		small = P[i];
	
	System.out.println("Loweset Quoate Price : " + small);
	System.out.println(" Company names who quoted the lowest price are given below:");

	for (int i = 1;i<=N;i++)
	if (small== P[i])
		System.out.println(CN[i]);
	}
}
