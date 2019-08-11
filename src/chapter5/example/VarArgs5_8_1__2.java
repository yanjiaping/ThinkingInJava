package chapter5.example;

/**
 * 可变参数列表
 * 
 * @author YJP
 *
 */
public class VarArgs5_8_1__2 {
	static void printArray(Object... args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 3.14, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		printArray(new Integer[] { 1, 2, 3, 4 });
	}

}
