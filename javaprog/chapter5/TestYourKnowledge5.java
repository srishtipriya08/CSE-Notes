class Super
{
 	String name = "Gopi";
 	String desg = "Cook";
 	public void show()
 	{
 		System.out.println("Name:" + name);
 		System.out.println("Designation:" + desg);
 	}
}
public class TestYourKnowledge5 extends Super
{
 	String address = "Delhi";
 	public void show()
 	{
 		System.out.println("City:" + address);
 	}
 	public static void main(String s[])
 	{
	 	Super ob1 = new Super();
 		TestYourKnowledge5 ob2 = new TestYourKnowledge5();
 		System.out.println("Executing Super:");
 		ob1.show();
 		ob1 = ob2;
 		ob1.show();
 	}
}

