package chapter5.example;

/**
 * √∂æŸ¿‡–Õ£¨ordinal()
 * 
 * @author YJP
 *
 */
public class EnumOrder5_9__1 {

	public static void main(String[] args) {
		for (Spiciness s : Spiciness.values()) {
			System.out.println(s + ", ordinal " + s.ordinal());
		}

	}

}
