class pub_mem {
 	public String intro ;
}
class TestYourKnowledge4 extends pub_mem {
 	public String getIntro(String str) 	{
 		intro = str;
 		return intro;
 	}	
 	public static void main(String[] args) 	{
 		TestYourKnowledge4 obj = new TestYourKnowledge4();
 		String name = obj.getIntro("user");
 		System.out.println("You’re:" +name);
 	}
}
