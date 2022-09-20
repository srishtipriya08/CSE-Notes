public class TestYourKnowledge10 implements Runnable {
	static Thread t1;
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[]) {
		TestYourKnowledge10 t=new TestYourKnowledge10();
		t1=new Thread(t);
		t1.start();
	}    
}
