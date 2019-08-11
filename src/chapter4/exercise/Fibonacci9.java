package chapter4.exercise;

public class Fibonacci9 {
	int fib(int n) {
		if (n < 2) {
			return n;
		} else {
			return fib(n - 2) + fib(n - 1);
		}
	}

	public static void main(String[] args) {
		Fibonacci9 f = new Fibonacci9();
		int k = Integer.parseInt(args[0]);
		System.out.println("First " + k + " Fibonacci number(s): ");
		for (int i = 0; i < k; i++)
			System.out.println(f.fib(i));

	}

}
