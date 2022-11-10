package Thread_In_Java;

public class Demo2 {
	public static void main(String[] args) {
		A a = new A();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		t2.start();
		
		
		System.out.println("end of main");
		
	}

}
