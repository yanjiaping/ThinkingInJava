package chapter9.example;

import java.util.Random;

/**
 * 9.7.1 初始化接口中的域
 * 
 * @author YJP
 *
 */
interface RandVals {
	Random RAND = new Random(47);

	int RANDOM_INT = RAND.nextInt(10);
	long RANDOM_LONG = RAND.nextLong() * 10;
	float RANDOM_FLOAT = RAND.nextFloat() * 10;
	double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}

public class TestRandVals_9_7_1 {
	public static void main(String[] args) {
		System.out.println(RandVals.RANDOM_INT);
		System.out.println(RandVals.RANDOM_LONG);
		System.out.println(RandVals.RANDOM_FLOAT);
		System.out.println(RandVals.RANDOM_DOUBLE);
	}
}