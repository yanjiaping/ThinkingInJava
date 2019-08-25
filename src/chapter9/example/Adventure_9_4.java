package chapter9.example;

/**
 * 9.4 JavaÖÐµÄ¶à¼Ì³Ð
 * 
 * @author YJP
 *
 */
interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

interface CanClimb {
	void climb();
}

class ActionCharacter {
	public void fight() {
		System.out.println("ActionCharacter fight()");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {

	@Override
	public void fly() {
		System.out.println("CanFly fight()");
	}

	@Override
	public void swim() {
		System.out.println("CanSwim fight()");
	}

	@Override
	public void climb() {
		System.out.println("CanClimb climb()");
	}

}

public class Adventure_9_4 {
	private static void t(CanFight x) {
		x.fight();
	}

	private static void u(CanSwim x) {
		x.swim();
	}

	private static void v(CanFly x) {
		x.fly();
	}

	private static void w(ActionCharacter x) {
		x.fight();
	}
	
	private static void x(CanClimb x) {
		x.climb();
	}

	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		x(h);
	}

}
