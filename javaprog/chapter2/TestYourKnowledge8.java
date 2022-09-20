//Program to display biggest number out of three given numbers using if and   		//else statements
class TestYourKnowledge8
{
	public static void main(String args [])
	{
		int a=19,b=26,c=11;
		if(a>b)
		if(a>c)
		System.out.println("BIG="+a);
		else
		System.out.println("BIG="+c);
		else
		if(b>c)
		System.out.println("BIG="+b);
		else
		System.out.println("BIG="+c);
	}
}
