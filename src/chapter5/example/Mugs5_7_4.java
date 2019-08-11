package chapter5.example;

/**
 * 非静态实例初始化
 * 
 * @author YJP
 *
 */
class Mug {
	Mug(int marker) {
		System.out.println("Mug(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

public class Mugs5_7_4 {
	Mug mug1;
	Mug mug2;

	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug2 initialized");
	}

	Mugs5_7_4() {
		System.out.println("Mugs5_7_4()");
	}

	Mugs5_7_4(int i) {
		System.out.println("Mugs5_7_4(int)");
	}

	public static void main(String[] args) {
		System.out.println("Inside main()");
		new Mugs5_7_4();
		System.out.println("new Mugs5_7_4() completed");
		new Mugs5_7_4(1);
		System.out.println("new Mugs5_7_4(1) completed");
	}

}
