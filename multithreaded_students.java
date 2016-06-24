class student
{
	
	student(String name , int marks){
		System.out.println("Student name is "+ " "+ name);
		System.out.println("Student marks are" + " " + marks);
		System.out.println(Thread.currentThread().getName());
	}
}

class runnable1 implements Runnable
{
	
	private String name;
	private int marks;
	runnable1(String name , int marks)
	{
		this.name = name ;
		this.marks = marks;
	}
	public void run()
	{
		student st = new student(name , marks);
		System.out.println(Thread.currentThread().getName());
	}
}
public class multithreaded_students {

	public static void main(String[] args)
	{
		runnable1 rn = new runnable1("Venkat",200);
		runnable1 rn1 = new runnable1("mangina",300);
		
		Thread t = new Thread(rn);
		Thread t1 = new Thread(rn1);
		
		t.start();
		t1.start();
	}
}
