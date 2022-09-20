class MethodParaDemo
{
	int with_para(int j, int k) 
	{
		int s= j+k;
		return s;
	}
	public static void main(String args[])
	{ 
	     MethodParaDemo get_sum = new MethodParaDemo();
          int sum=get_sum.with_para(7,8);
          System.out.println("The Sum returned from the with_para() method is "+ sum);
	}
}
