class MethodOverloadDemo
{
        void sum(int a, int b)
        {
            int sum=a+b;
            System.out.println("Sum of two integers= "+sum);
        }
        void sum(float x, float y)
        {
          float sum=x+y;
          System.out.println("Sum of two floats= "+sum);
	}

	public static void main(String args[])
	{ 
	  MethodOverloadDemo obj = new MethodOverloadDemo();
          obj.sum(20,25);
          obj.sum(15.5f,20.5f);
	}
}
