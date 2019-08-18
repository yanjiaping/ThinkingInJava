package chapter8.example;

/**
 * 8.2.5 »±œ›£∫”Ú”Îæ≤Ã¨∑Ω∑®
 * 
 * @author YJP
 *
 */
class StatucSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}

	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StatucSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}

	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}

public class StaticPolymorphism_8_2_5__2 {

	public static void main(String[] args) {
		StatucSuper sup = new StaticSub();
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}

}
