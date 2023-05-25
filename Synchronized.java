class Reserve2 implements Runnable
{
//available berths are 1
	int available=1;
	int wanted;
		Reserve2(int i)
		{
		//accept berth at runtime
		wanted = i;
	    }	
	public void run()
	{
		synchronized(this)
		{ 
			//synchronized the current object
			
			//display the available berths
			System.out.println("Available Berths = " +available);
			//if available berths are more than wanted berths
			if(available>=wanted)
			{
				String name = Thread.currentThread().getName();
				//alot berths to him
				System.out.println(wanted+" Berths Reserve For "+name);
				try{
					Thread.sleep(1500);//wait for printing ticket
					available = available-wanted;
				}
				catch(InterruptedException ie){
					System.out.println(ie);
				}
			}
			else System.out.println("Sorry No Berths Available");
	    }
	}
}
public class Synchronized {
	public static void main(String args[]){
		Reserve2 obj = new Reserve2(1);
		Thread t1 = new Thread(obj);
		Thread t2= new Thread(obj);
		
		t1.setName("Mrunali");
		t2.setName("Yashu");
		
		t1.start();
		t2.start();
	}
}
