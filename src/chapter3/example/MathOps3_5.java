package chapter3.example;

import java.util.Random;

public class MathOps3_5 {

	public static void main(String[] args) {
		Random rand = new Random(47);

		int i, j, k;
		j = rand.nextInt(100) + 1;
		System.out.println("j£º" + j);
		k = rand.nextInt(100) + 1;
		System.out.println("k£º" + k);
		i = j + k;
		System.out.println("j + k£º" + i);
		i = j - k;
		System.out.println("j - k£º" + i);
		i = k / j;
		System.out.println("k / j£º" + i);
		i = k * j;
		System.out.println("k * j£º" + i);
		i = k % j;
		System.out.println("k % j£º" + i);
		j %= k;
		System.out.println("j %= k£º" + j);

		float u, v, w;
		v = rand.nextFloat();
		System.out.println("v£º" + v);
		w = rand.nextFloat();
		System.out.println("w£º" + w);
		u = v + w;
		System.out.println("v + w£º" + u);
		u = v - w;
		System.out.println("v - w£º" + u);
		u = v * w;
		System.out.println("v * w£º" + u);
		u = v / w;
		System.out.println("v / w£º" + u);
		u += v;
		System.out.println("u += v£º" + u);
		u -= v;
		System.out.println("u -= v£º" + u);
		u *= v;
		System.out.println("u *= v£º" + u);
		u /= v;
		System.out.println("u /= v£º" + u);

	}

}
