class LabelBreakDemo
{
	public static void main(String[] args) 
        {
		int i = 1;
		breaking:while (true) // loop will execute infinitely 
		{
			if (i >10) 
			{
				break breaking;
			}
			System.out.println(i);

			i=i+2; 
		}
	}
}
