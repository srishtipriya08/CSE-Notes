class OverloadedConstructorDemo
{
   
   int num1,num2; 
   OverloadedConstructorDemo(int a)
   {
      num1=num2=a;
   }
   OverloadedConstructorDemo(int a, int b)
   {
      num1=a;
      num2=b;
   }
   void calculate()
   {
     int result=num1*num2;
     System.out.println("The product of numbers= "+result);
   }
   public static void main(String ar[])
   {
     OverloadedConstructorDemo obj1=new OverloadedConstructorDemo(5);
     OverloadedConstructorDemo obj2=new OverloadedConstructorDemo(5,6);
     obj1.calculate();
     obj2.calculate();
   }
}