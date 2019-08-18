package chapter8.example;

/**
 * 8.3.3 构造器内部的多态方法的行为
 * 
 * @author YJP
 *
 */
class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	public Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	public RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph(), radius = " + radius);
	}

	void draw() {
		System.out.println("RoundGlyph().draw(), radius = " + radius);
	}
}

public class PolyConstructors_8_3_3 {

	public static void main(String[] args) {
		new RoundGlyph(5);
	}

}
