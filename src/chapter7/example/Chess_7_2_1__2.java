package chapter7.example;

/**
 * 7.2.1 初始化基类
 * 
 * @author YJP
 *
 */
class Game {
	Game(int i) {
		System.out.println("Game constructor" + i);
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor" + i);
	}
}

public class Chess_7_2_1__2 extends BoardGame {
	Chess_7_2_1__2() {
		super(11);
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		Chess_7_2_1__2 c = new Chess_7_2_1__2();
	}

}
