package chapter10.exercise.six_three;

import chapter10.exercise.six_one.Ex6Interface;
import chapter10.exercise.six_two.Ex6Base;

public class Ex6 extends Ex6Base {
	Ex6Interface getBaseInner() {
		return this.new Ex6BaseInner();
	}

	public static void main(String[] args) {
		Ex6 ex = new Ex6();
		System.out.println(ex.getBaseInner().say());
	}
}
