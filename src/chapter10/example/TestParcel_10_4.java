package chapter10.example;

/**
 * 10.4 内部类与向上转型
 * 
 * @author YJP
 *
 */
interface Destination {
	String readLabel();
}

interface Contents {
	int value();
}

class Parcel4 {
	private class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}
	}

	protected class PDestination implements Destination {
		private String label;

		private PDestination(String whereTo) {
			label = whereTo;
		}

		@Override
		public String readLabel() {
			return label;
		}
	}

	public Destination destination(String s) {
		return new PDestination(s);
	}

	public Contents contents() {
		return new PContents();
	}
}

public class TestParcel_10_4 {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
//		Parcel4.PContents pc = p.new PContents();
//		Parcel4.PDestination pd = p.new PDestination();
	}
}
