class TestYourKnowledge20
{
	static boolean sym(int n,int a[][])
	{
		boolean flag=true;
		for(int i=1;i<=n-1;i++)
		for(int j=i;j<=n-1;j++)
		if(a[i][j]!=a[j][i])
		flag=false;
		return(flag);
 	}
	public static void main(String args[])
	{
		int n=3;
		int a[][]= { {1,2,3},{2,5,6},{3,6,9}};
		if(sym(n,a))
		System.out.println("Matrix is symmetrical in nature");
		else
		System.out.println("Matrix is nonsymmetrical in nature");
	}
}
