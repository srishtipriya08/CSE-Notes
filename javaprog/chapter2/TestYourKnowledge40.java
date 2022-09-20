class TestYourKnowledge40
{
 	public static void main(String args[])
 	{
		int I=0,J=0,K=0,L=0;
		for (I=1;I<=5;I++)
		for (J=I+1;J<=5;J++)
		for  (K=J+1;K<=5;K++)
	 	{
			L=I+J+K;
			if (L<=15)
			System.out.println(" "+I+" "+J+" "+K+" "+L);
 	}
 	}
}

