package chapter4.example;

/**
 * ��ǩ
 * 
 * @author YJP
 *
 */
public class LabeledWhile4_7__2 {

	public static void main(String[] args) {
		int i = 0;
		outer: while (true) {
			System.out.println("Outer while loop");
			while (true) {
				i++;
				System.out.println("i = " + i);
				if (i == 1) {
					System.out.println("continue");
					continue;
				}
				if (i == 3) {
					System.out.println("continue outer");
					continue outer;
				}
				if (i == 5) {
					System.out.println("break");
					break;
				}
				if (i == 7) {
					System.out.println("break outer");
					break outer;
				}
			}

		}
	}

}
