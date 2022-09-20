abstract class abs
{
 	abstract public void abs();
}
class TestYourKnowledge7 extends abs
{
 	public void abs()
 	{
 		System.out.println("Abstract method implemented!");
 	}
 	public static void main(String s[])
 	{
 		TestYourKnowledge7 obj = new TestYourKnowledge7();
 		obj.abs();
 	}
}
