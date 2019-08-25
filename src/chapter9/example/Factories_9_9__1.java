package chapter9.example;

/**
 * 9.9 接口与工厂
 * 
 * @author YJP
 *
 */
interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	@Override
	public void method1() {
		System.out.println("Implementation1 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation1 method2");
	}
}

class Implementation1Factory implements ServiceFactory {
	@Override
	public Service getService() {
		return new Implementation1();
	}
}

class Implementation2 implements Service {
	@Override
	public void method1() {
		System.out.println("Implementation2 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation2 method2");
	}
}

class Implementation2Factory implements ServiceFactory {
	@Override
	public Service getService() {
		return new Implementation2();
	}
}

public class Factories_9_9__1 {
	public static void serviceComsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceComsumer(new Implementation1Factory());
		serviceComsumer(new Implementation2Factory());
	}
}
