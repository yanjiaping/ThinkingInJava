package chapter3.exercise;

public class StringCompare14 {
	static void f(boolean b) {
		if (b == true)
			System.out.println(true);
		else
			System.out.println(false);
	}

	static void stringTest(String s, String t) {
		f(s == t);
		f(s.equals(t));
		f(t.equals(s));
		f(s != t);
		// f(!s);
		// f(!t);
		// s = s && t;
		// s = s || t;
		// s = ~t;
		// s = s & t;
		// s = s | t;
		// s = s ^ t;
		// s &= t;
		// s ^= t;
		// s |= t;
	}

	public static void main(String[] args) {
		String s = "one", t = "two";
		StringCompare14.stringTest(s, t);
	}

}
