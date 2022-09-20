//CREATE ARRAY OF COMPANY NAME & LOWEST PRICE QUOTED
class TestYourKnowledge26
{
 	public static void main(String args [])
 	{
 		int N,I;
 		String comp[]={"KMC","NMC","SMC","MCGM","PMC"};
 		int price[]={45,69,58,39,98};
 		N=price.length;
 		int small=price[0];
 		for (I=1;I<=N-1;I++)
 		if (small>price[I])
 		small=price[I];
 		for (I=0;I<=N-1;I++)
 		if (small==price[I])
 		System.out.println(comp[I]);
 	} 
}
