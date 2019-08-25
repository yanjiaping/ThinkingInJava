package chapter10.example;

/**
 * 10.1 创建内部类
 * 
 * @author YJP
 *
 */
public class Parcell_10_1__1 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
		new Parcell_10_1__1().ship("Tasmania");
	}
}
