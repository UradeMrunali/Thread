class Reserve implements Runnable{
	//available berths are 1 
	int available = 1;
	int wanted;
	 Reserve(int i){
		 wanted = i;
	}
	public void run(){
		//displaying available berths
		System.out.println("Available Berths= " +available);
		//if available berths are more then wanted berths
		if(available>=wanted){
			String name = Thread.currentThread().getName();
			//allot the berths
			System.out.println(wanted + " Berths reserve for "+name);
			try{
				Thread.sleep(1500);
				//update the no of available berths
				available = available - wanted;
			}catch(InterruptedException ie){}
		}else
			System.out.println("No Berth are Available");
	}
}
public class UnSynchronized {
	public static void main(String args[]){
		Reserve obj= new Reserve(1);
		Thread t1 =  new Thread(obj);
		Thread t2 =  new Thread(obj);
		
		t1.setName("First Person");
		t2.setName("Second Person");
		
		t1.start();
		t2.start();
	}
}
