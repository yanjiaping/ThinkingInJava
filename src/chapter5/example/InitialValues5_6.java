package chapter5.example;

/**
 * 成员初始化
 * 
 * @author YJP
 *
 */
public class InitialValues5_6 {
	char c;

	void printInitialValues() {
		System.out.println("char [" + c + "]");
	}

	public static void main(String[] args) {
		new InitialValues5_6().printInitialValues();
	}

}
