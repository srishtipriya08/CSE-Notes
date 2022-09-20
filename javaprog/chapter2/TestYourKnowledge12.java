class TestYourKnowledge12
{
	public static void main(String args[])
	{
 		int NO=5;
 		int DV=2;
 		int K=(int)Math.sqrt(NO);
 		while ((NO%DV!=0)&&(DV<=K))
 		++DV;
 		if (DV>K)
 		System.out.println("The Given no. is Prime No.");
 		else
 		System.out.println("The given no. is not Prime No.");
	}
}
