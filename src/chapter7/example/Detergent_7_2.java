package chapter7.example;

/**
 * 7.2 ºÃ≥–”Ô∑®
 * 
 * @author YJP
 *
 */
class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}

public class Detergent_7_2 extends Cleanser {
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub();
		;
	}

	public void foam() {
		append(" foam()");
	}

	public static void main(String[] args) {
		Detergent_7_2 x = new Detergent_7_2();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class");
		Cleanser.main(args);
	}

}
