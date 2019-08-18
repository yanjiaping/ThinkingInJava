package chapter7.example;

/**
 * 7.2.1 初始化基类
 * 
 * @author YJP
 *
 */
class Art {
	Art() {
		System.out.println("Art()");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing()");
	}
}

public class Cartoon_7_2_1__1 extends Drawing {
	public Cartoon_7_2_1__1() {
		System.out.println("Cartoon()");
	}

	public static void main(String[] args) {
		Cartoon_7_2_1__1 c = new Cartoon_7_2_1__1();
	}

}
