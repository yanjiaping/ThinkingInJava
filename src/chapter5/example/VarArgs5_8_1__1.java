package chapter5.example;

/**
 * 可变参数列表
 * 
 * @author YJP
 *
 */
class A {
}

public class VarArgs5_8_1__1 {
	static void printArray(Object[] args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new Object[] { new Integer(47), new Float(3.14), new Double(11.11) });
		printArray(new Object[] { "one", "two", "three" });
		printArray(new Object[] { new A(), new A(), new A() });
	}

}
