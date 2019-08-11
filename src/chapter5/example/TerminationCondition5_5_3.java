package chapter5.example;

/**
 * ÖÕ½áÌõ¼þ
 * 
 * @author YJP
 *
 */
class Book {
	boolean checkedOut = false;

	public Book(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	void checkIn() {
		checkedOut = false;
	}

	protected void finalize() throws Throwable {
		System.out.println("finalize");
		if (checkedOut) {
			System.out.println("Error: checked out");
		}
	}
}

public class TerminationCondition5_5_3 {

	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}

}
