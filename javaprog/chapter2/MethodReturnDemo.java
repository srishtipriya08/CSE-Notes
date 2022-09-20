class MethodReturnDemo
{
	int no_para() 
	{
		int j=5;
		int k=6;
		int s= j+k;
		return s;
	}
	public static void main(String args[])
	{ 
		MethodReturnDemo get_sum = new MethodReturnDemo();
                int sum=get_sum.no_para();
                System.out.println("The Sum returned from the no_para() method is "+ sum);
	}
}
