// Program to sort a list of students on the basis of their marks 
class TestYourKnowledge32
{
 	public static void main(String args[])
 	{
 		int M[]={85,67,45,76};
		String SN[]={"NSJ","VDP","IIS","ABB"};
		int N=M.length;
		int I;
		String P=new String();
		for(I=0;I<=N-1;I++)
		{
			int big=M[I];
			int loc=I;
			for(int J=I+1;J<=N-1;J++)
 			{
				if(big<M[J])
				{
					big=M[J];
					loc=J;
				}
 			}
			int temp=M[I];
			M[I]=M[loc];
			M[loc]=temp;
			P=SN[I];
			SN[I]=SN[loc];
			SN[loc]=P;
		}
		for(int k=0;k<=N-1;k++)
 		{
 			System.out.println(SN[k] );
 		}
	}
}
