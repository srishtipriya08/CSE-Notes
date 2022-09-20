class TestYourKnowledge3 {
	public void area(int a)	{
		System.out.println("Area of Square is: "+(a*a));
	}
	public void area(int length, int width) {
		System.out.println("Area of Rectangle is: "+(length*width));
	}
	public static void main(String ar[])	 {
		TestYourKnowledge3 ob=new TestYourKnowledge3 ();
		ob.area(5);
		ob.area(5,6);
	}
}
