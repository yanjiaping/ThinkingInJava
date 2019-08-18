package chapter7.example;

/**
 * 7.8.1 final Êý¾Ý
 * 
 * @author YJP
 *
 */
class Poppet {
	private int i;

	Poppet(int ii) {
		i = ii;
	}
}

public class BlankFinal_7_8_1__2 {
	private final int i = 0;
	private final int j;
	private final Poppet p;

	public BlankFinal_7_8_1__2() {
		j = 1;
		p = new Poppet(1);
	}

	public BlankFinal_7_8_1__2(int x) {
		j = x;
		p = new Poppet(x);
	}

	public static void main(String[] args) {
		BlankFinal_7_8_1__2 b1 = new BlankFinal_7_8_1__2();
		BlankFinal_7_8_1__2 b2 = new BlankFinal_7_8_1__2(47);
		System.out.println(b1.i);
		System.out.println(b1.j);
		System.out.println(b1.p);
		System.out.println(b2.i);
		System.out.println(b2.j);
		System.out.println(b2.p);
	}

}
