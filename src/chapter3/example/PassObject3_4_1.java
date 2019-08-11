package chapter3.example;

public class PassObject3_4_1 {
	static void f(Letter y) {
		y.c = 'z';
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1£ºx.c£º" + x.c);
		f(x);
		System.out.println("2£ºx.c£º" + x.c);

	}

}

class Letter {
	char c;
}