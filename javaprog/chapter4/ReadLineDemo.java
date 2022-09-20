import java.io.*;
import java.io.Reader.*;
public class ReadLineDemo
{
	public static void main (String args[]) throws IOException 
	{
	
	 
                          BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter some text, 'Q' or 'q' to quit");
	String str [] = new String [200];
	for (int i=0; i<10;i++)
	{
		str[i]=obj.readLine(); // reading the entered text
		if (str[i].equals("Q") || str[i].equals ("q"))
		{
			break;
		}
	}
	System.out.println("Text entered by you is......." );
	for (int i=0; i<10;i++)
	{

		if (str[i].equals("Q") || str[i].equals ("q"))
		{

			break;
		}
		System.out.println(str[i]);

	}
	}
}
