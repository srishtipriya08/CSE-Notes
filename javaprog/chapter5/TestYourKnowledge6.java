class Super
{
 	int value = 123;
}
class TestYourKnowledge6 extends Super
{
 	int value = 123;
 	public void print()
 	{
 		System.out.println("From superclass:" + super.value); 
 		System.out.println("From subclass:" + value); 
 	}
 	public static void main(String s[])
 	{
 		System.out.println("Using super:"); 
 		TestYourKnowledge6 ob = new TestYourKnowledge6();
 		ob.print();
 	}
}
