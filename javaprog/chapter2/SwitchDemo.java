class SwitchDemo
{
	public static void main(String args[])
	{
		char country='i'; // country is set to ‘i’
		switch(country)
		{
			case 'a': System.out.println("America");
			case 'c': System.out.println("Canada");
			case 'i': System.out.println("India");
			case 'e': System.out.println("England");
			default: System.out.println("No Country");
		}
	}
}
