public class TestYourKnowledge4 {
	public static void main(String args[]){
		int val, square;
		try{
			val= 9;
			square= val * val;
			System.out.println(" The Square is " + square); 
		}catch (ArithmeticException a)
		{
			a.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(" Finally block must be executed"); 
		}
	}
}

