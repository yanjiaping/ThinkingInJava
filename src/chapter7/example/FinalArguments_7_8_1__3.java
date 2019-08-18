package chapter7.example;

/**
 * 7.8.1 final ²ÎÊý
 * 
 * @author YJP
 *
 */
class Gizmo {
	public void spin() {
		System.out.println("spin()");
	}
}

public class FinalArguments_7_8_1__3 {
	void with(final Gizmo g) {
		// !g = new Gizmo();
	}

	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}

	/*
	 * void f(final int i) { i++; }
	 */
	int g(final int i) {
		return i + 1;
	}

	public static void main(String[] args) {
		FinalArguments_7_8_1__3 fa = new FinalArguments_7_8_1__3();
		fa.with(null);
		fa.without(null);
	}

}
