class TestYourKnowledge29
{
 	static int fact(int n)
 	{
 		int f=1;
 		for(int I=1;I<=n;I++)
 		f=f*1;
 		return(f);
 	}
 	public static void main(String args[])
 	{
 		int ncr;
 		ncr=fact(3)/fact(2)/fact(3-2);
 		System.out.println("ncr="+ncr);
 	}
}
