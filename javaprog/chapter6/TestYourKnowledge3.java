public class TestYourKnowledge3 implements Runnable 
{
	static Thread t1;
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[]) {
		TestYourKnowledge3 t=new TestYourKnowledge3 ();
		t1=new Thread(t);
		t1.start();
		System.out.println(t1.getPriority());
	}    
}

