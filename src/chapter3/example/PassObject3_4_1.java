package chapter3.example;

/**
 * ���������еı�������
 * 
 * @author YJP
 *
 */
public class PassObject3_4_1 {
	static void f(Letter y) {
		y.c = 'z';
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1��x.c��" + x.c);
		f(x);
		System.out.println("2��x.c��" + x.c);

	}

}

class Letter {
	char c;
}