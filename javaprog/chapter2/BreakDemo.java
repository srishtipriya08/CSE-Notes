class BreakDemo
{

	public static void main(String[] args) 
        {
	  int i = 0;
	  while (true) // loop will execute infinitely 
	  {
		i=i+2; 
		if (i >10) 
		{
		break;   // when the condition becomes true break will get execute
		}
		System.out.println(i);
	   }
	}
}
