class thread_creation implements Runnable
{
	
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println(i);
		}
	}
}
public class sleep {

	public static void main(String[] args)
	{
		
		thread_creation tc = new thread_creation();
		Thread t = new Thread(tc);
		
		t.start();
	}
}
