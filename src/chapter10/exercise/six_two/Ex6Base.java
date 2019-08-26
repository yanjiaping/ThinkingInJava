package chapter10.exercise.six_two;

import chapter10.exercise.six_one.Ex6Interface;

public class Ex6Base {
	protected class Ex6BaseInner implements Ex6Interface {
		public Ex6BaseInner() {
		}

		public String say() {
			return "Hi";
		}
	}
}
