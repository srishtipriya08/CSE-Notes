interface One
{
 	public void mesg1();
}
interface Two extends One
{
 	public void mesg2();
}
class TestYourKnowledge10 implements Two
{
 	public void mesg1()
 	{
 		System.out.println("Executing SuperInterface");
 	}
 	public void mesg2()
 	{
 		System.out.println("Now Executing SubInterface");
} 
 	public static void main(String s[])
 	{
 		TestYourKnowledge10 obj = new TestYourKnowledge10();
 		System.out.println("Extending Interfaces:");
 		obj.mesg1();
 		obj.mesg2();
 	}
}

