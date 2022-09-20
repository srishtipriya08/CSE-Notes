class MethodByRefDemo
{
        int a=10;
	void check(MethodByRefDemo obj)
        {
          obj.a=obj.a+5;
          System.out.println("Value of a inside method definition "+a); 
        }
	public static void main(String args[])
	{ 
	  MethodByRefDemo obj = new MethodByRefDemo();
          System.out.println("Value of a before method invocation "+obj.a);
          obj.check(obj);
          System.out.println("Value of a after method invocation "+obj.a);
	}
}
