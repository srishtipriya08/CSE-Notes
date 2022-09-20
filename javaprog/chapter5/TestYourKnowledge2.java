class Super
{
		public void msgsuper() { System.out.println("Executing Superclass"); } 
	}	
class Sub1 extends Super {
	public void msgsub1() { System.out.println("Executing Subclass one"); }
}
class TestYourKnowledge2 extends Super {
	public void msgsub2() { System.out.println("Executing Subclass two"); }
	public static void main(String[] args)
	{
	 	Sub1 c = new Sub1(); 
		c.msgsuper();
		c.msgsub1();
		System.out.println();
		c.msgsuper();
		TestYourKnowledge2 j = new TestYourKnowledge2 (); 
		j.msgsub2();
	}
}

