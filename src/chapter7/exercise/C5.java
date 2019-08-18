package chapter7.exercise;

class A {
	public A() {
		System.out.println("A()");
	}
}

class B extends A {
	public B() {
		System.out.println("B()");
	}
}

public class C5 extends A {
	private B b = new B();

	public static void main(String[] args) {
		C5 c = new C5();
	}

}
