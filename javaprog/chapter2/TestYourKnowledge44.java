class TestYourKnowledge44
{
	public static void main(String[] args) 
	{
		int i = 10;
		breaking:
		while (true) 
		{
			if (i >50) 
			{
				break breaking;
			}
			System.out.print(i+" ");
			i=i+10; 
		}
	}
}
