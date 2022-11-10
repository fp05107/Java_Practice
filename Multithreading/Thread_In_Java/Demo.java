package Thread_In_Java;

public class Demo {
	
	public static void main(String[] args) {
		A a = new A();
		Thread ta = new Thread(a);
//		a.run();
		ta.start();
		
		System.out.println("Inside main ");
		
//		for(int i=20;i<40;i++) {
//			System.out.println("Inside main "+i);
//		}
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("End of main.....");
		
	}
}
