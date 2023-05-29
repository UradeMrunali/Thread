
	class Example1 extends Thread{  
		 public void run(){  
		   System.out.println("Mrunnali"+" "+getPriority());  
		 }  
		}  
		  
		class Example2 extends Thread{  
		 public void run(){  
		   System.out.println("Yashasvi"+" "+getPriority());  
		 }  
		}  
		class Example3 extends Thread{  
			 public void run(){  
			   System.out.println("Ramcharan"+" "+getPriority());  
			 }  
			}  
		class Example4 extends Thread{  
			 public void run(){  
			   System.out.println("Rahul"+" "+getPriority());  
			 }  
			}  
		  
		 class Test3{  
		 public static void main(String args[]){  
		  Example1 t1=new Example1();  
		  Example2 t2=new Example2();  
		  Example3 t3=new Example3();  
		  Example4 t4=new Example4();  
		  
		  t1.start();  
		  t2.start(); 
		  t3.start();
		  t4.start();
		  t3.setPriority(Thread.MAX_PRIORITY);
		  t2.setPriority(Thread.MAX_PRIORITY-4);
		  t1.setPriority(Thread.MIN_PRIORITY);
		  t4.setPriority(Thread.NORM_PRIORITY);
		  
		 }  
		}  

