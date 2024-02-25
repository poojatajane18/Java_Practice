package com.variables;
class Task implements Runnable{
	private Thread thread;
	public Task(String name) {
		this.thread=new Thread(this,name);//the object whose run method is invoked when this thread is started.
		this.thread.start();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(this.thread.isDaemon()) {
			System.out.println(this.thread.getName()+" is user thread");
		}
		else
			System.out.println(this.thread.getName()+" is Daemon thread");
		
	}
	
}

public class Program {
	public static void main(String args[]) {
		Thread thread = Thread.currentThread();//reference
		if(thread.isDaemon()) {
			System.out.println(thread.getName()+" is user thread "+thread.getPriority());//getName -->returns the thread name
		}
		else
			System.out.println(thread.getName()+" is Daemon thread "+thread.getPriority());
	
	Task t1 = new Task("Thread#1");

}
}

