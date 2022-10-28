package Func_Intr;

@FunctionalInterface
interface Intr {
	void sayHello(String name);
}

class F_Intr_Impl {
	public static void main(String[] args) {
		Intr i1 = (s)->{
			System.out.println("Hi "+s);
		};
		i1.sayHello("subham");
	}

}

// argument list, Lambda operator, body