// I am creating two threads on the same object
// and letting on thread to slow down so the other gets processed fast.

class thread_runnable implements Runnable 
{
	
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			if(Thread.currentThread().getName().equals("second"))
			{
			try{
			Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				
			}
		}
			System.out.println(Thread.currentThread().getName());
		}
	}
}


public class synchronization {

	public static void main(String[] args)
	{
		thread_runnable rn = new thread_runnable();
		thread_runnable rn1 = new thread_runnable();
		
		Thread t = new Thread(rn,"first");
		Thread t1 = new Thread(rn1,"second");
		t.start();
		t1.start();
	}
}
