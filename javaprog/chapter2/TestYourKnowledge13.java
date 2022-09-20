class TestYourKnowledge13
{
 	public static void main (String args [])
 	{
 		int NO=279;
 		int f1=1,f2=1;
 		while (NO>f1)
 		{
 			int  f=f1+f2;
 			f1=f2;
 			f2=f;
 		}
 		if
 		(NO==f1)
 		System.out.println("The term is fibbonacc");
 		else


 		System.out.println("The term is not fibbonacc");
 	}
}
