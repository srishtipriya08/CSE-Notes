import java.io.*;
public class Ques10
{
	public static void main (String args[]) throws IOException 
	{
	
	 
       BufferedReader obj=new BufferedReader(new InputStreamReader (System.in));
	System.out.println("Enter the names of five Asian countries");
                        System.out.println(" Enter 'Q' or 'q' to quit");
	String str [] = new String [300];
	for (int i=0; i<15;i++)
	{
		str[i]=obj.readLine(); // reading the entered text
		if (str[i].equals("Q") || str[i].equals ("q"))
		{
			break;
		}
	}
	System.out.println("Text entered by you is......." );
	for (int i=0; i<15;i++)
	{

		if (str[i].equals("Q") || str[i].equals ("q"))
		{

			break;
		}
		System.out.println(str[i]);

	}
	}
}
