abstract class Cal
{
 	int length;
 	int bredth;
 	abstract int area();
}
class Rectangle extends Cal
{
 	int area()
 	{
 		return length * bredth;
 	}
}
class Square extends Cal
{
 	int area()
 	{
 		length = bredth;
 		return length * bredth;
 	}
}
class TestYourKnowledge8
{
 	public static void main(String s[])
 	{
 		System.out.print("Calculating area of rectangle:");
 		Rectangle ob1 = new Rectangle();
 		ob1.length = 5;
 		ob1.bredth = 7;
 		System.out.println(ob1.area());
 		System.out.print("Calculating area of square:");
 		Square ob2 = new Square();
 		ob2.length = 5;
 		ob2.bredth = 7;
 		System.out.println(ob2.area());
 	}
}

