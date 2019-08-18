package chapter8.example;

/**
 * 8.5.2 向下转型与运行时类型识别
 * 
 * @author YJP
 *
 */
class Useful {
	public Useful() {
		System.out.println("Useful()");
	}

	public void f() {
		System.out.println("Useful.f()");
	}

	public void g() {
		System.out.println("Useful.g()");
	}
}

class MoreUseful extends Useful {
	public MoreUseful() {
		System.out.println("MoreUseful()");
	}

	public void f() {
		System.out.println("MoreUseful.f()");
	}

	public void g() {
		System.out.println("MoreUseful.g()");
	}

	public void u() {
		System.out.println("MoreUseful.u()");
	}

	public void v() {
		System.out.println("MoreUseful.v()");
	}

	public void w() {
		System.out.println("MoreUseful.w()");
	}
}

public class RTTI_8_5_2 {

	public static void main(String[] args) {
		Useful[] x = { new Useful(), new MoreUseful() };
		x[0].f();
		x[1].g();
		// !x[1].u();
		((MoreUseful)x[1]).u();
		((MoreUseful)x[0]).u();
	}

}
