class Book {
 	public void buy() { System.out.println("Purchaged a book"); }
}
class Title extends Book {
 public void name() { System.out.println("Java Programming"); }
}
class TestYourKnowledge3 extends Title
{
 	public void auth() { System.out.println("Khalid Mugal"); }
	public static void main(String[] args) {
		System.out.println("Shopping Schedule");
		TestYourKnowledge3 a = new TestYourKnowledge3(); a.buy(); a.name();a.auth();
	}
}
