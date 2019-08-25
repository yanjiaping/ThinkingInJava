package chapter10.example;

/**
 * 10.1 创建内部类
 * 
 * @author YJP
 *
 */
public class Parcell_10_1__2 {
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

	public Destination to(String s) {
		return new Destination(s);
	}

	public Contents contents() {
		return new Contents();
	}

	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
		Parcell_10_1__2 p = new Parcell_10_1__2();
		p.ship("Tasmania");
		Parcell_10_1__2 q = new Parcell_10_1__2();
		Parcell_10_1__2.Contents c = q.contents();
		Parcell_10_1__2.Destination d = q.to("Borneo");
	}
}
