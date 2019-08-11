package chapter4.example;

public class ListCharacters4_3_2 {

	public static void main(String[] args) {
		for (char c = 0; c < 128; c++) {
			if (Character.isLowerCase(c)) {
				System.out.println("value: " + (int) c + " character: " + c);
			}
		}
	}

}
