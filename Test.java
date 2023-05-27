
class Mythread extends Thread
{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(getName()+" "+i+" "+getPriority());
		}
		
	}
}

public class Test {
	public static void main(String[] args) {
	
 Mythread m=new Mythread();
 Mythread m1=new Mythread();
 
 m.start();
 m1.start();
 m1.setName("hi");
 m.setPriority(Thread.MAX_PRIORITY);
}
}