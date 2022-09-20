class SuperClass
{
  void display()
  {
    System.out.println("This is a super class method");
  }
}
class SubClass
{
  void display()
  {
    System.out.println("This is a sub class method");
  }
}
class MethodOverrideDemo
{
  public static void main(String ar[])
  {
    SuperClass objsuper=new SuperClass(); 
    SubClass objsub=new SubClass(); 
    objsuper.display();
    objsub.display();
  }
}