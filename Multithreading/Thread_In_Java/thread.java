package Thread_In_Java;

//Runnable/Thread
public class thread {
	
	public static void main(String[] args) {
		sampledemo A = new sampledemo("A");
		sampledemo B = new sampledemo("B");
		B.start();
		A.start();
		
	}
}

class sampledemo implements Runnable{
	
	private Thread t;
	private String threadname;
	
	sampledemo(String threadname) {
		this.threadname=threadname;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(threadname);
		}
		
	}
	public void start() {
		
		if(t==null) {
			t = new Thread(this,threadname);
			t.start();
		}
	}
	
	
}