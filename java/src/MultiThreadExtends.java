class process1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Process 1: " +i);
		}
	}
}
class process2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Process 2: " +i);
		}
	}
}
public class MultiThreadExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process1 p1 = new process1();
		process2 p2 = new process2();
		p1.start();
		p2.start();

	}

}
