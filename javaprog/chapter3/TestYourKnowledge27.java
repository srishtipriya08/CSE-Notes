class TestYourKnowledge27
{
	public static void main(String args[])
	{
		String str=new String("Hello Java");
 		int len=str.length();
 		for(int x=len-1; x>=0; x--)
		{
 			System.out.print(" " + str.charAt(x));
 		}
	}
}
