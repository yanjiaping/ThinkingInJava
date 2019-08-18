package chapter7.example;

import java.util.Random;

/**
 * 7.8.1 final Êý¾Ý
 * 
 * @author YJP
 *
 */
class Value {
	int i;

	public Value(int i) {
		this.i = i;
	}
}

public class FinalData_7_8_1__1 {
	private static Random rand = new Random(47);
	private String id;

	public FinalData_7_8_1__1(String id) {
		this.id = id;
	}

	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	public static final int VALUE_THREE = 39;
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);

	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);

	private final int[] a = { 1, 2, 3, 4, 5, 6 };

	public String toString() {
		return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
	}

	public static void main(String[] args) {
		FinalData_7_8_1__1 fd1 = new FinalData_7_8_1__1("fd1");
		// ! fd1.valueOne++;
		fd1.v2.i++;
		fd1.v1 = new Value(9);
		for (int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++;
			// ! fd1.v2 = new Value(0);
			// ! FinalData_7_8_1__1.VAL_3 = new Value(1);
			// ! fd1.a = new int[3];
		}
		System.out.println(fd1);
		System.out.println("Creating new FinalData");
		FinalData_7_8_1__1 fd2 = new FinalData_7_8_1__1("fd2");
		System.out.println(fd1);
		System.out.println(fd2);
	}

}
