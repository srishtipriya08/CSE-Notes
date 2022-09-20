class TestYourKnowledge36
{
 	public static void main (String args[]) 
 	{

 		for (int i=1000;i<9999;i++)
 		{
 			int k =(int) Math.sqrt(i);
 			if (k*k == i)
 			{
 				int LN =i/100;
 				int RN = i%100;
 				int LK = (int) Math.sqrt(LN);
 				int RK = (int) Math.sqrt(RN);
 				if((LK *LK == LN) && (RK *RK == RN))

 				System.out.println(i);
 			}
 		}
 	}
}
