
public class main_thread implements Runnable {
	String[] args= null;
	public void run()
	{
		main_thread mn = new main_thread();
		mn.main(args);
		
	}

	public static void main(String[] args)
	{
		System.out.println("Infinite Thread Created");
		main_thread mn = new main_thread();
		
		Thread t = new Thread(mn);
		
		t.start();
	}
}
