public class SwitchBreakDemo
{
	public static void main(String args[])
	{
		char country='i';// country is set to ?i?
		switch(country)
		{
			case 'a': System.out.println("America");
				break;
			case 'c': System.out.println("Canada");
				break;
			case 'i': System.out.println("India");
				break;
			case 'e': System.out.println("England");
				break;
			default: System.out.println("No Country");
		}
	}
}
