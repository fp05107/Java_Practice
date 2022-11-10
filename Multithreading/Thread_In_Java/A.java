package Thread_In_Java;

public class A implements Runnable{

	@Override
	public void run() {
//		try {
//			Thread.currentThread().sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Inside run method");
		
//		for(int i=0;i<20;i++) {
//			System.out.println("Inside loop of run method"+i);
//		}
		String s = "subham";
		Thread.currentThread().setName(s);
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("end of run() method");

	}
	

}
