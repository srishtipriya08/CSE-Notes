class SampleThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread Test");
		}
	}
}
public class TestYourKnowledge1
{
	public static void main(String ar[])
	{
		SampleThread thrd=new SampleThread();
		Thread newThread=new Thread(thrd);
		newThread.start();
	}
}
