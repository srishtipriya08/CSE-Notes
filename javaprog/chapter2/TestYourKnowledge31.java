class TestYourKnowledge31
{
 	public static void main(String args[])
 	{
 		int N=21,F=2;
 		float Sum=0.0f,X=1.75f;
 		float term =X;
 		for(int I=1;I<=N;I++)
 		{
 			Sum=Sum+term;
 			term=(1+(I+1)*X)/F;
 			F=(F*(I+2));
 		}
 		System.out.println("Sum=  " +Sum);
 	}
}
