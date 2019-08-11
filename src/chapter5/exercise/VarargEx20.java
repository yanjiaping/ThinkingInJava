package chapter5.exercise;

public class VarargEx20 {

	public static void main(String... args) {
		for (String s : args) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
