public class Ques5 {
	public void myMethod() throws Exception {
	try {
		throw new Exception();}
		finally {
			System.out.println("Testing Finally");
		}
	}
	public static void main(String args[]) {
		Ques5 obj=new Ques5();
		try {
			obj.myMethod();
		}
		catch(Exception ex) {
			System.out.println("Exception:"+ex);
		}
	}
}
