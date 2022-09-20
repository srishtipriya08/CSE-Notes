interface  Cal
{
 	public int area();
}
class Rectangle implements Cal
{
 	public int length = 0;
 	public int bredth  = 0;
 	public int area()
 	{
 		return length * bredth;
 	}
}
class Square implements Cal
{
 	public int length = 0;
 	public int bredth  = 0;
 	public int area()
 	{
 		length = bredth;
  		return length * bredth;
 	}
}
public class TestYourKnowledge9 
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

