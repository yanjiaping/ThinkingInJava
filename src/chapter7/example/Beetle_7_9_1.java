package chapter7.example;

/**
 * 7.9.1 ºÃ≥–”Î≥ı ºªØ
 * 
 * @author YJP
 *
 */
class Insect {
	private int i = 9;
	protected int j;

	public Insect() {
		System.out.println("i = " + i + ", j = " + j);// 4.i=9,j=0
		j = 39;
	}

	private static int x1 = printInit("static Insect.x1 initialized");// 1.static Insect.x1 initialized

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

public class Beetle_7_9_1 extends Insect {
	private int k = printInit("Beetle.k initialized");// 5.Beetle.k initialized

	public Beetle_7_9_1() {
		System.out.println("k = " + k);// 6.k=47
		System.out.println("j = " + j);// 7.j=39
	}

	private static int x2 = printInit("static Beetle.x2 initialized");// 2.static Beetle.x2 initialized

	public static void main(String[] args) {
		System.out.println("Beetle constructor");// 3.Beetle constructor
		Beetle_7_9_1 b = new Beetle_7_9_1();
	}

}
