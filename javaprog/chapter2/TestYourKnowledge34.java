class TestYourKnowledge34
{
	public static void main (String args[]) 
	{
		int D,SUM;
		int NO;
		for (int I=100;I<=9999;I++)
		{
			NO= I;
			SUM =0;
			while (NO>0)
			{
				D = NO%10;
				SUM = SUM + D*D*D;
				NO=NO/10;
			}
			if (SUM == I)
			System.out.println(I);
			
		}
	
}
}
