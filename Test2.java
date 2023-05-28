
public class Test2  extends Thread{  
		 public void run(){  
		   System.out.println("Mrunali"); 
		   
		 }  
		 public static void main(String args[]){  
		  Test2 t1=new Test2();  
		  Test2 t2=new Test2();  
		  Test2 t3=new Test2();  
		  
		  t1.start();  
		  t2.start();  
		  t3.start();  
		  
		 }  
}

