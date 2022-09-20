import java.io.*;
class LMN
{
	public void disp() throws IOException
	{
		System.out.println("It is a super class");
	}	
}
class XYZ extends LMN
{
	public void disp() throws IOException
	{
		System.out.println("It is a super class");
	}	
}
class TestYourKnowledge5 extends LMN
{
	public void disp() throws EOFException, FileNotFoundException
	{	
		System.out.println("It is a sub class named Program4 ");
	}
	public static void main (String args[]) throws IOException
	{
		 TestYourKnowledge5 obj = new TestYourKnowledge5 ();
		obj.disp();	
	}
}
