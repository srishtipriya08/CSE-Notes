class TestYourKnowledge35
{
 	public static void main (String args[]) 
 	{
 		for (int NO=10000;;NO++)
 		{
 			int p = NO*4;
 			int sum = 0,d;
 			while (p>0)
 			{
 				d= p%10;
 				sum = sum *10+ d;
 				p= p/10;
 			}

 			if (sum == NO)
 			{
 			System.out.println("Five digit Number which on Multiplication by 4 reverses its order   IS:   "+ NO);
 				break;
 			}
 			else
 			++NO;
}
}
}
