package Func_Intr;

public abstract class Method_Reference implements demo2{
	
	public static void main(String[] args) {
		
		demo2 d2 = Method_Reference::fun1;
		d2.method(0);
		
	}

	public static void fun1(int x) {
		// TODO Auto-generated method stub
		System.out.println(x);
		
	}
}

interface demo2{
	void method(int x);
}
