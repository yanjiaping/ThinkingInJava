package chapter5.example;

/**
 * 显示的静态初始化
 * 
 * @author YJP
 *
 */
class Cup {
	Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;

	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	Cups() {
		System.out.println("Cups()");
	}

}

public class ExplicitStatic5_7_3 {

	public static void main(String[] args) {
		System.out.println("Inside main()");
		Cups.cup1.f(99);
	}
	
	static Cups c1 = new Cups();
	static Cups c2 = new Cups();

}
