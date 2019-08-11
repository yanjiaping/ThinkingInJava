package chapter5.example;

/**
 * ³õÊ¼»¯Ë³Ðò
 * 
 * @author YJP
 *
 */
class Window {
	Window(int marker) {
		System.out.println("Window(" + marker + ")");
	}
}

class House {
	Window w1 = new Window(1);

	House() {
		System.out.println("House()");
		w3 = new Window(33);
	}

	Window w2 = new Window(2);

	void f() {
		System.out.println("f()");
	}

	Window w3 = new Window(3);
}

public class OrderOfInitialization5_7_1 {

	public static void main(String[] args) {
		House h = new House();
		h.f();
	}

}
