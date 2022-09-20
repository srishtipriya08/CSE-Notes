class Emp {
 	String name = "Niraj";
 	String desg = "Programmer";
 	public void display1()
 	{
 		System.out.println("NAME:" + name);
 		System.out.println("DESG:" + desg);
 	}
}
class TestYourKnowledge1 extends Emp
{
 	int sal = 5000;
 	public void display2()
 	{
 		System.out.println("SALARY:" + sal);
 	}
 	public static void main(String s[])
 	{
 		TestYourKnowledge1 obj = new TestYourKnowledge1 ();
 		obj.display1();
 		obj.display2();
 	}
}
