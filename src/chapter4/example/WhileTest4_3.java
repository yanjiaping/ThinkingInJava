package chapter4.example;

public class WhileTest4_3 {
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.println(result + ", ");
		return result;
	}

	public static void main(String[] args) {
		while (condition()) {
			System.out.println("Inside 'while'");
		}
		System.out.println("Exited 'while'");
	}

}
