package chapter10.example;

/**
 * 10.2 链接到外部类
 * 
 * @author YJP
 *
 */
interface Selector {
	boolean end();

	Object current();

	void nest();
}

public class Sequence_10_2 {
	private Object[] items;
	private int next = 0;

	public Sequence_10_2(int size) {
		System.out.println("Sequence_10_2()");
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public SequenceSelector() {
			System.out.println("SequenceSelector()");
		}

		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void nest() {
			if (i < items.length) {
				i++;
			}
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		Sequence_10_2 sequence = new Sequence_10_2(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(i);
		}
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.nest();
		}
	}
}
